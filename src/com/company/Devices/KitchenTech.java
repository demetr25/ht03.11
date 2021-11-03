package com.company.Devices;

public abstract class KitchenTech extends AbstractDevice{
    abstract void cook();

    @Override
    void powerOn() {
        System.out.println("Вы включили прибор");
    }

    @Override
    void powerOff() {
        System.out.println("Вы выключили прибор");
    }
}
