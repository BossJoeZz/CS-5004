package com.test.test;

import com.test.impl.ElementNode;
import com.test.impl.EmptyNode;

public class Test {

    @org.junit.Test
    public void test01() {
        EmptyNode emptyNode = new EmptyNode();
        ElementNode elementNode =new ElementNode(3,
                new ElementNode(2,
                new ElementNode(1,
                new ElementNode(0, emptyNode)
                )));
    }

    @org.junit.Test
    public void test02() {
        EmptyNode emptyNode = new EmptyNode();
        ElementNode elementNode =new ElementNode(3,
                new ElementNode(2,
                        new ElementNode(1,
                                new ElementNode(0, emptyNode)
                        )));

        System.out.println(elementNode.count());
    }

    @org.junit.Test
    public void test03() {
        EmptyNode emptyNode = new EmptyNode();
        ElementNode elementNode =new ElementNode(3,
                new ElementNode(2,
                        new ElementNode(1,
                                new ElementNode(0, emptyNode)
                        )));

        System.out.println(elementNode.sum());
    }

}
