package org.lessons.java.snack2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContoBancario mioConto = new ContoBancario(4555444, null);

        mioConto.setSaldo(new BigDecimal(1200));
        System.out.println(mioConto.getSaldo());

        mioConto.deposita(new BigDecimal(300));
        System.out.println(mioConto.getSaldo());
        mioConto.ritira(new BigDecimal(250));
        System.out.println(mioConto.getSaldo());
        
    }
}
