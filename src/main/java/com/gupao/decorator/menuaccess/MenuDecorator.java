package com.gupao.decorator.menuaccess;

/**
 * @ProjectName: DesignPattern
 * @ClassName: MenuDecorator
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/12 10:32 上午
 * @Version v1.0
 */
public class MenuDecorator extends Menu{

    protected Menu menu;

    public MenuDecorator(Menu menu) {
        this.menu = menu;
    }

    @Override
    public Boolean getVisiable() {
        return this.menu.getVisiable();
    }

    @Override
    public Boolean getLogin() {
        return this.menu.getLogin();
    }

    @Override
    public String getName() {
        return this.menu.getName();
    }
}
