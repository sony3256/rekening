package com.company;

public class BankRekening {
private int saldo = 0;

    public void stortGeld(int bedrag) {
        this.saldo += bedrag;
    }

    public void haalGeldAf(int bedrag) {
        this.saldo -= bedrag;
    }

    public int getSaldo() {


        return saldo;
    }
}
