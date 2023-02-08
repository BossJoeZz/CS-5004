package com.test.impl;

import com.test.IListOfInts;

public class ElementNode implements IListOfInts {

    private int data;
    private ElementNode next;
    private IListOfInts head = this.next;

    public ElementNode() {
        this.next = null;
    }

    public ElementNode(int data, IListOfInts e) {
        this.data = data;
        this.next = (ElementNode)e;
    }

    @Override
    public IListOfInts addAtIndex(int key, int value) {
        int index = 0;
        while(index != key) {
            this.next = this.next.next;
        }
        ElementNode elementNode = new ElementNode(value, this.next);
        this.next = elementNode;
        return head;
    }

    @Override
    public IListOfInts addFront(int value) {
        ElementNode elementNode = new ElementNode(value, this.next);
        return this.head;
    }

    @Override
    public IListOfInts addBack(int value) {
        while (this.next != null) {
            this.next = this.next.next;
        }
        ElementNode elementNode = new ElementNode(value, this.next);
        return this.head;
    }

    @Override
    public int getDataAtIndex(int key) {
        int index = 0;
        while(index != key) {
            this.next = this.next.next;
        }
        return this.data;
    }

    @Override
    public int count() {
        int index = 0;
        while(this.next != null) {
            this.next = this.next.next;
            index ++;
        }
        return index;
    }

    @Override
    public int sum() {
        int sum = 0;
        while(this.next != null) {
            this.next = this.next.next;
            sum += this.data;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "ElementNode{" + "data=" + data + ", next=" + next + ", head=" + head + '}';
    }
}
