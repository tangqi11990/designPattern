package com.gupao.decorator.menuaccess;

/**
 * @ProjectName: DesignPattern
 * @ClassName: MenuAccessTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/12 10:36 上午
 * @Version v1.0
 */
public class MenuAccessTest {

    public static void main(String[] args) {
        Menu menu = new BaseMenu();
        //System.out.println(menu.getName() + "是否登陆:" + menu.getLogin() + ", 是否可见：" + menu.getVisiable());

        //menu.setLogin(true);
        //menu.setName("AAA");
        menu = new MenuA(menu);

        System.out.println(menu.getName() + "是否登陆:" + menu.getLogin() + ", 是否可见：" + menu.getVisiable());


    }
}
