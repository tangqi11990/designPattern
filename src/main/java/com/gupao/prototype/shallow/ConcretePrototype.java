package com.gupao.prototype.shallow;

import lombok.Data;

import java.util.List;

/**
 * @ProjectName: DesignPattern
 * @ClassName: ConcretePrototype
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/23 2:41 下午
 * @Version v1.0
 */
@Data
public class ConcretePrototype  implements Cloneable{


    private int age;
    private String name;
    private List<String> hobbies;


    @Override
    public ConcretePrototype clone() {
//        ConcretePrototype concretePrototype = new ConcretePrototype();
//        concretePrototype.setAge(this.age);
//        concretePrototype.setName(this.name);
        try {
            return (ConcretePrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
