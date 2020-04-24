package org.example.builder.general;

/**
 * @ProjectName: DesignPattern
 * @ClassName: ConcreteBuilder
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/23 4:46 下午
 * @Version v1.0
 */
public class ConcreteBuilder implements IBuilder{

    private Product product = new Product();


    @Override
    public Product build() {
        return product;
    }
}
