package com.company.Lesson_3;

import java.lang.reflect.Type;
import java.util.jar.JarEntry;

public class MyArray<Type> {
    Type array[];
    int size;

    public MyArray() {
        array = (Type[]) new Object[5];
       size = 5;
    }
    public MyArray(int size) {
        array = (Type[]) new Object[5];
        this.size = size;
    }
    public Type[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    public void add(Type obj) {
        if (size + 1 < array.length) {
            array[size + 1] = obj;
            size++;
        } else {
            Type[] secondarray = (Type[]) new Object[size + 10];
            for (int i = 0; i < array.length; i++) {
                secondarray[i] = array[i];
            }
            array = secondarray;
        }
    }
    public Type get(int index){
        return array[index];
    }
}
