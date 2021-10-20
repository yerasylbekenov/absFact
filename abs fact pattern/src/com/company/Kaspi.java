package com.company;

public class Kaspi implements Bank{
    private String bankName;
    public Kaspi(){
        bankName="Kaspi Bank";
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}
