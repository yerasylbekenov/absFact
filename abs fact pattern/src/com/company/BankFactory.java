package com.company;

public class BankFactory extends AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("Kaspi")){
            return new Kaspi();
        } else if(bank.equalsIgnoreCase("Halyk")){
            return new Halyk();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}
