package com.gupao.decorator.menuaccess;

/**
 * @ProjectName: DesignPattern
 * @ClassName: Menu
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/12 10:31 上午
 * @Version v1.0
 */
public abstract class Menu {

    private Boolean isLogin;

    private Boolean isVisiable;

    private String name;


    public void setLogin(Boolean login) {
        isLogin = login;
    }
    public void setVisiable(Boolean visiable) {
        isVisiable = visiable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Boolean getVisiable();

    public abstract Boolean getLogin();

    public abstract String getName();


}
