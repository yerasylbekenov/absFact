package com.company;

public class Halyk implements Bank{
    private String bankName;
    public Halyk(){
        bankName="Halyk Bank";
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}