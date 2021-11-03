package com.company.Devices;

import java.util.Scanner;

public class Multicooker extends KitchenTech{
    public void switchProgram(int num) {
        System.out.println("Мультиварка готовит еду по програме №"+num);
    };

    @Override
    void cook() {
        System.out.println("Прежде чем начать готовку выберите номер програмы ->");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switchProgram(num);
    }


}
