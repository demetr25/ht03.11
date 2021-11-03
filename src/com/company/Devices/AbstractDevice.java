package com.company.Devices;

public abstract class AbstractDevice {
    String name;
    int num;

    abstract void powerOn();
    abstract void powerOff();

    public AbstractDevice() {
        powerOn();
    }
}

