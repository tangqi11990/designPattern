package com.gupao.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: DesignPattern
 * @ClassName: Folder
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/14 11:36 上午
 * @Version v1.0
 */
public class Folder extends Directory{

    private List<Directory> list ;
    private int level;

    public Folder(String name, int level) {
        super(name);
        this.list = new ArrayList<Directory>();
        this.level = level;
    }

    public void add(Directory directory) {
        if (!list.contains(directory)) {
            list.add(directory);
        }
    }

    public void remove(Directory directory) {
        list.remove(directory);
    }

    public Directory get(int index)  {

        if (list.isEmpty()) {
            return null;
        }
        return list.get(index);
    }

    @Override
    protected void show() {
        System.out.println(this.name);
        for (Directory directory : list) {
            for (int i = 0; i < this.level; i++) {
                System.out.print("    ");
            }
            for (int i = 0; i < this.level; i++) {
                if (i == 0) {
                    System.out.print("+");
                }
                System.out.print("-");
            }
            directory.show();
        }
    }
}
