package com.gupao.decorator.menuaccess;

/**
 * @ProjectName: DesignPattern
 * @ClassName: MenuA
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/12 10:33 上午
 * @Version v1.0
 */
public class MenuB extends MenuDecorator{
    public MenuB(Menu menu) {
        super(menu);
    }


    @Override
    public Boolean getVisiable() {
        return super.menu.getVisiable();
    }

    @Override
    public Boolean getLogin() {
        return super.menu.getLogin();
    }

    @Override
    public String getName() {
        return "menu B";
    }
}
