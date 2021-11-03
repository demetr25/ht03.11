package com.company.Devices;

public class Mobile extends Phone{
    int simCount;
    boolean display;

    public Mobile(int simCount, boolean display) {
        this.simCount = simCount;
        this.display = display;
    }

    @Override
    void call() {
        System.out.println("Совершаю вызов...");
    }
}
