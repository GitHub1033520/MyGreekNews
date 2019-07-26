package com.example.dell.mygreeknews.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
