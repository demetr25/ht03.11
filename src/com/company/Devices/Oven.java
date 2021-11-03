package com.company.Devices;

import java.util.Scanner;

public class Oven extends KitchenTech{
    void initTimer(int time) {
        System.out.println("Духовка автоматически отключится через "+time+" минут");
    }

    @Override
    void cook() {
        System.out.println("Прежде чем начать готовку установите время автоматического отключения");
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        initTimer(time);
    }
}
