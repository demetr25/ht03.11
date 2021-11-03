package com.company.Devices;

public class Main1 {
    public static void main(String[] args) {
        Mobile mb1 = new Mobile(2,true);
        mb1.call();
        System.out.println("=".repeat(80));

        SmartPhone sm1 = new SmartPhone(2, true);
        sm1.call();
        sm1.runApp();
        System.out.println("=".repeat(80));

        DialPhone dp1 = new DialPhone(false);
        dp1.call();
        System.out.println("=".repeat(80));

        Multicooker mc1 = new Multicooker();
        mc1.cook();
        System.out.println("=".repeat(80));

        Oven ov1 = new Oven();
        ov1.cook();
        System.out.println("=".repeat(80));

        AbstractDevice[] obj = new AbstractDevice[]{mb1, sm1, dp1, mc1, ov1};
        main1(obj);
    }
    public static void main1(AbstractDevice[] args) {
        for (int i = 0; i < args.length; i++) {
            args[i].powerOff();
        }
    }
}
