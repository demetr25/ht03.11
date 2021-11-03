package com.company.Devices;

public abstract class Phone extends AbstractDevice{
    abstract void call();

    @Override
    void powerOn() {
        System.out.println("Телефон включен");
    }

    @Override
    void powerOff() {
        System.out.println("Телефон выключен");
    }
}
