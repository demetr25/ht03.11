package com.company.Interfaces;

import com.company.Interfaces.Caller;

public class DialPhone2 implements Caller {
    @Override
    public void call() {
        System.out.println("Совершаю звонок...");
    }
}
