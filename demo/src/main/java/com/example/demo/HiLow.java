package com.example.demo;

public class HiLow {
    int diceFace;

    public HiLow() {
        this.diceFace = (int) Math.random() * 6;
    }

    public int getDiceFace() {
        return diceFace;
    }
}
