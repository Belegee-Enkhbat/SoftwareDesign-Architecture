package com.example.monolithArch.domain;

public class Calculator
{
    int x;
    int y;

    public Calculator() {
    }

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int add()
    {

        return this.x +this.y;
    }
    public int mul()
    {
        return this.x * this.y;
    }
    public int division()
    {
        return this.x / this.y;
    }
    public int minus()
    {
        return this.x - this.y;
    }
}