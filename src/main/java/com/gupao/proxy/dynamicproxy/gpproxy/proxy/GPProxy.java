package com.gupao.proxy.dynamicproxy.gpproxy.proxy;


import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @ProjectName: DesignPattern
 * @ClassName: GPProxy
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/11 10:15 上午
 * @Version v1.0
 */
public class GPProxy {

    private static final String ln = "\r\n";

    public static Object newProxyInstance(GPClassLoader gpClassLoader, Class[] interfaces, GPInvocationHandler h) {

        try {
            // 1、 生成java的源码数据
            String scrCode = generator(interfaces);
            System.out.println(scrCode);
            // 2、将源码数据加载到磁盘
            String filePath = GPProxy.class.getResource("").getPath();
            File file = new File(filePath + "$Proxy0.java");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(scrCode);
            fileWriter.flush();
            fileWriter.close();

            // 3、将java文件编译成class 文件
            JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = javaCompiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = javaCompiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            // 4、将class 文件加载到jvm
            Class proxyClass = gpClassLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
            file.delete();

            // 5、返回字节码的新的对象
            return c.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generator(Class[] interfaces) {

        // 代理类的代码编写
        // 1、依据jdk方式，会实现接口
        // 2、构造方法会传递GPInvocationHandler
        // 3、实现接口里的方法，会调用实现类的invoke

        StringBuffer interfaceList = new StringBuffer();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(GPProxy.class.getPackage() + ";" + ln);
        for (Class anInterface : interfaces) {
            stringBuffer.append("import " + anInterface.getName() + ";" + ln);
            interfaceList.append(anInterface.getName()).append(",");
        }
        stringBuffer.append("import java.lang.reflect.*;" + ln);

        stringBuffer.append("public class $Proxy0 implements " + interfaceList.substring(0, interfaceList.length() - 1) + ln);
        stringBuffer.append("{" + ln);

        //编写构造方法及初始化GPInvocationHandler
        stringBuffer.append("private GPInvocationHandler h;" + ln);
        stringBuffer.append("public $Proxy0(GPInvocationHandler h) {" + ln);
        stringBuffer.append("this.h=h;" + ln);
        stringBuffer.append("}" + ln);

        for (Class anInterface : interfaces) {
            for (Method method : anInterface.getMethods()) {
                //处理方法参数
                //public method需要的参数
                StringBuffer paramList = new StringBuffer();
                //通过反射查找方法需要的入参数
                StringBuffer methodParam = new StringBuffer();
                //调用反射方法需要传递的参数
                StringBuffer objectParam = new StringBuffer();
                for (int i = 0; i < method.getParameterTypes().length; i++) {
                    Class parameterType = method.getParameterTypes()[i];
                    paramList.append(parameterType.getTypeName() + " " + parameterType.getSimpleName().toLowerCase() + i + ",");
                    methodParam.append(parameterType.getTypeName() + ".class,");
                    objectParam.append(parameterType.getSimpleName().toLowerCase() + i + ",");
                }

                stringBuffer.append("public " + method.getReturnType().getName() + " " + method.getName()
                        + "(" + ((paramList.length() > 0) ? paramList.substring(0, paramList.length() - 1) : paramList.toString()) + ")" + ln);
                stringBuffer.append("{" + ln);
                stringBuffer.append("try{" + ln);
                stringBuffer.append("Method m = " + anInterface.getName() + ".class.getMethod(\""
                        + method.getName() + "\", new Class[]{" + (methodParam.length() > 0 ? methodParam.substring(0, methodParam.length() - 1) : methodParam) + "}); " + ln);
                stringBuffer.append("Object result = this.h.invoke(this, m ,new Object[]{"
                        + (objectParam.length() > 0 ? objectParam.substring(0, objectParam.length() - 1) : objectParam) + "});" + ln);
                //处理返回结果
                if (!method.getReturnType().equals(void.class)) {
                    stringBuffer.append("return (" + method.getReturnType().getTypeName() + ")result;" + ln);
                }
                stringBuffer.append(" }catch(Exception e) { " + ln);
                stringBuffer.append(" e.printStackTrace();" + ln);
                stringBuffer.append(" } catch (Throwable throwable) {" + ln);
                stringBuffer.append(" throwable.printStackTrace();" + ln);
                stringBuffer.append(" }" + ln);
                //如果返回不为空，出现异常则返回null
                if (!method.getReturnType().equals(void.class)) {
                    if (!method.getReturnType().equals(int.class)) {
                        stringBuffer.append("return null;" + ln);
                    } else {
                        stringBuffer.append("return 0;" + ln);
                    }
                }
                stringBuffer.append("}" + ln);
            }
        }
        stringBuffer.append("}" + ln);
        return stringBuffer.toString();

    }


}
