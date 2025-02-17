package org.lessons.java.snack2;

import java.math.BigDecimal;

public class ContoBancario {
    // attributi
    private int numeroConto;
    private BigDecimal saldo;

    public ContoBancario(int numeroConto, BigDecimal saldo){
        this.numeroConto = numeroConto;
        this.saldo = new BigDecimal(0);
    }; 

    // metodi 
    public int getNumeroConto() {
        return this.numeroConto;
    }

    public void setNumeroConto(int numeroConto) {
        this.numeroConto = numeroConto;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void deposita(BigDecimal sommaDeposito) {
        if (sommaDeposito.compareTo(new BigDecimal(0)) == 1) {
            this.saldo = this.saldo.add(sommaDeposito);
        }
    }

    public boolean ritira(BigDecimal sommaRitiro) {
        if (sommaRitiro.compareTo(new BigDecimal(0)) == 1 && this.saldo.compareTo(sommaRitiro) == 1) {
            this.saldo = this.saldo.subtract(sommaRitiro);
            return true;
        }
        return false;
    }
}
