package com.gupao.prototype.deep;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: DesignPattern
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/23 2:41 下午
 * @Version v1.0
 */
public class Client {

    public static void main(String[] args) {
        ConcretePrototype prototype = ConcretePrototype.getInstance();
        prototype.setName("Tom");
        prototype.setAge(18);
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("书法");
        hobbies.add("美术");
        prototype.setHobbies(hobbies);
        System.out.println(prototype);

        ConcretePrototype cloneType = prototype.clone();
        cloneType.getHobbies().add("技术控");

        System.out.println(prototype == cloneType);
        System.out.println(prototype);
        System.out.println(cloneType);
//        System.out.println();
    }
}
