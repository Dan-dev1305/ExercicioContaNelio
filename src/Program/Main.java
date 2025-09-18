package Program;

import Entities.BankAcount;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account nunber: ");
        int idAcount = sc.nextInt();
        System.out.println("Enter account holder: ");
        String titularName = sc.nextLine();
        BankAcount ba = new BankAcount(idAcount, titularName);
        System.out.print("Is there an initial deposit (y/n)");
        String initialQuestion = sc.nextLine();
        if (initialQuestion == "y"){
            System.out.println("Enter the initial deposit");
            ba.initialDeposit = sc.nextDouble();
        }
        System.out.println("Account data");
        System.out.println("Updated account data:");
        System.out.printf("Account %f, Holder: %s, Balance: $ %d", ba.getIdAcount(), ba.getTitularName(), ba.getSaldo());






    }
}