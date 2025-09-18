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

    public void setTitularName(String titularName) {
        this.titularName = titularName;
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
        saldo = initialDeposit;
        return saldo += deposit;
    }
    public double withdraw(double withdraw){
        return saldo -= withdraw + 5.00;

    }
}
