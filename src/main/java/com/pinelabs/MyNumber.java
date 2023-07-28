package com.pinelabs;
public class MyNumber<K> implements Comparable<K>
{ // extends Object
    K num;



    public K getNum() {
        return num;
    }

    public void setNum(K num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyNumber)) return false;

        MyNumber myNumber = (MyNumber) o;

        return getNum() == myNumber.getNum();
    }


    @Override
    public int compareTo(K o) {
        return 0;
    }
}
