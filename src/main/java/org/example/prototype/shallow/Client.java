package org.example.prototype.shallow;

import java.util.ArrayList;
import java.util.Arrays;
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
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setName("Tom");
        prototype.setAge(18);
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("书法");
        hobbies.add("美术");
        prototype.setHobbies(hobbies);
        System.out.println(prototype);

        ConcretePrototype cloneType = prototype.clone();
        cloneType.getHobbies().add("技术控");
        System.out.println(prototype.getHobbies() == cloneType.getHobbies());
//        System.out.println();
    }
}
