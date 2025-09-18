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
        System.out.print("Enter account holder: ");
        String  titularName = sc.next();
        BankAcount ba = new BankAcount(idAcount, titularName);
        System.out.print("Is there an initial deposit (y/n)");
        String initialQuestion = sc.next();
        System.out.println("");
        if (initialQuestion.equals("y")){
            System.out.println("Enter the initial deposit");
            ba.depositValue(sc.nextDouble());
        }
        System.out.println("Account data");
        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f", ba.getIdAcount(), ba.getTitularName(), ba.getSaldo());
        System.out.println("");
        System.out.println("");
        System.out.print("Enter a deposit value: ");
        ba.depositValue(sc.nextDouble());
        System.out.println("Account data");
        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f", ba.getIdAcount(), ba.getTitularName(), ba.getSaldo());
        System.out.println("");
        System.out.println("");
        System.out.print("Enter a withdraw value: ");
        ba.withdraw(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f", ba.getIdAcount(), ba.getTitularName(), ba.getSaldo());


    }
}