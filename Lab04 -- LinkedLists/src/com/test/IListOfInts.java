package com.test;

public interface IListOfInts {

    /**
     * add a value use key in list
     *
     * @author  Zheng
     * @since   JDK
     */
    IListOfInts addAtIndex(int key, int value);

    /**
     * add a value in front on list
     *
     * @author  Zheng
     * @since   JDK
     */
    IListOfInts addFront(int value);

    /**
     * add a value end in list
     *
     * @author  Zheng
     * @since   JDK
     */
    IListOfInts addBack(int value);

    /**
     * use a key query in list
     *
     * @author  Zheng
     * @since   JDK
     */
    int getDataAtIndex(int key);

    /**
     * get list node numbers
     *
     * @author  Zheng
     * @since   JDK
     */
    int count();

    /**
     * get list node value sum
     *
     * @author  Lee Boynton
     * @since   JDK1.8
     */
    int sum();

}
