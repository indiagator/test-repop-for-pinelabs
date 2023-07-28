package com.pinelabs;

public class MyCharacter {

    char ch;

    int i;

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyCharacter)) return false;

        MyCharacter that = (MyCharacter) o;

        if (getCh() != that.getCh()) return false;
        return i == that.i;
    }


}
