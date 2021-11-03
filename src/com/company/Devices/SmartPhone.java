package com.company.Devices;

import java.util.Scanner;

public class SmartPhone extends Mobile {
    String OS;

    public SmartPhone(int simCount, boolean display) {
        super(simCount, display);
    }

    void runApp() {
        System.out.println("Какое приложение включаем?");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Открываем " + s);
    }

    @Override
    void call() {
        System.out.println("Звоню");
    }
}
