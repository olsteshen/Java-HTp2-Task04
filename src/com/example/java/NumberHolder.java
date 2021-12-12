package com.example.java;

public class NumberHolder {
    public int anInt;
    public float aFloat;

    public NumberHolder(int anInt, float aFloat) {
        this.anInt = anInt;
        this.aFloat = aFloat;
    }

    void displayMembers() {
        System.out.println(this.anInt + ", " + this.aFloat);
    }

}
