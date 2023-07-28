package com.pinelabs;

import java.util.Objects;

public class MyFloat {

    float f;

    int i;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyFloat)) return false;
        MyFloat myFloat = (MyFloat) o;
        return Float.compare(myFloat.f, f) == 0 && i == myFloat.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(f, i);
    }
}
