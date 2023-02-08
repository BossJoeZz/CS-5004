package com.test.impl;

import com.test.IListOfInts;

public class EmptyNode implements IListOfInts {

    public EmptyNode() {
    }

    @Override
    public String toString() {
        return "EmptyNode{}";
    }

    @Override
    public IListOfInts addAtIndex(int key, int value) {
        return null;
    }

    @Override
    public IListOfInts addFront(int value) {
        return null;
    }

    @Override
    public IListOfInts addBack(int value) {
        return null;
    }

    @Override
    public int getDataAtIndex(int key) {
        return 0;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int sum() {
        return 0;
    }
}
