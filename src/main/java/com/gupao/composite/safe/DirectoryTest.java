package com.gupao.composite.safe;

/**
 * @ProjectName: DesignPattern
 * @ClassName: DirectoryTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/14 3:23 下午
 * @Version v1.0
 */
public class DirectoryTest {

    public static void main(String[] args) {

        Folder root = new Folder("文学", 1);
        Folder folder1 = new Folder("近代文学", 2);
        root.add(folder1);

        File file = new File("文学通史");
        File file1 = new File("文学概述");
        File file2 = new File("文学简史");
        root.add(file);
        root.add(file1);
        root.add(file2);

        File file3 = new File("近代国内文学");
        File file4 = new File("近代国外文学");
        folder1.add(file3);
        folder1.add(file4);

        System.out.println("目录结构如下:");
        root.show();


    }
}
