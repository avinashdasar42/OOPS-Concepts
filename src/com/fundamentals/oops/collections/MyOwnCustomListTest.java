package com.fundamentals.oops.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MyOwnCustomListTest{
    public static void main(String[] args) {
        MyOwnCustomList list = new MyOwnCustomList(3);
        list.add("Hello");
        list.add("World");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
//        System.out.println(list.get(2));
    }
}

//1. CustomList Constructors >> default, capacity, collections
//2. get-add-remove methods
class MyOwnCustomList{
    //public static final int DEFAULT_CAPACITY = 10;
    public static final Object[] DEFAULT_SIZE_EMPTY_DATA = {};
    Object[] elementData;
    private int size;

    public MyOwnCustomList(){
        this.elementData = DEFAULT_SIZE_EMPTY_DATA;
    }

    public MyOwnCustomList(int initialCapacity){
        this.elementData = new Object[initialCapacity];
    }

    public Object[] grow(int minCapacity){
        int oldLength = elementData.length;
        int newCapacity = oldLength + oldLength >> 1;
        return elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public boolean add(Object o){
        int currentSize = elementData.length;
        if(size == currentSize){
            elementData = grow(size+1);
        }
        elementData[size] = o;
        size++;
        return true;
    }

    public Object get(int index){
        Objects.checkIndex(index,size);
        return elementData[index];
    }
}

