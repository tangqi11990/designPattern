package com.gupao.decorator.menuaccess;

/**
 * @ProjectName: DesignPattern
 * @ClassName: BaseMenu
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/12 10:35 上午
 * @Version v1.0
 */
public class BaseMenu extends Menu{


    @Override
    public Boolean getVisiable() {
        return true;
    }

    @Override
    public Boolean getLogin() {
        return false;
    }

    @Override
    public String getName() {
        return "首页";
    }
}
