package Entities;

public class BankAcount {
    private int idAcount;
    private String titularName;
    public double initialDeposit;
    private double saldo;
    private double deposit;
    private double withdraw;

    public int getIdAcount() {
        return idAcount;
    }

    public String getTitularName() {
        return titularName;
    }

    public double getSaldo() {
        return saldo;
    }

    public BankAcount(int idAcount, String titularName, double initialDeposit) {
        this.idAcount = idAcount;
        this.titularName = titularName;
        this.initialDeposit = initialDeposit;
    }

    public BankAcount(int idAcount, String titularName) {
        this.idAcount = idAcount;
        this.titularName = titularName;

    }
    public double depositValue(double deposit){
        return saldo += deposit;
    }
    public double withdraw(double withdraw){

    }
}
