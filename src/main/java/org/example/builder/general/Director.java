package org.example.builder.general;

/**
 * @ProjectName: DesignPattern
 * @ClassName: Director
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/23 4:46 下午
 * @Version v1.0
 */
public class Director {

    public static void main(String[] args) {
        IBuilder iBuilder = new ConcreteBuilder();
        System.out.println(iBuilder.build());

    }
}
