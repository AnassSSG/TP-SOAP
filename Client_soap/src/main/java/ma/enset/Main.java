package ma.enset;

import proxy.BankService;
import proxy.BanqueWS;
import proxy.Compte;


public class Main {
    public static void main(String[] args) {
        BankService proxy = new BanqueWS().getBankServicePort();
        System.out.println(proxy.conversionEuroToDh(700));

        Compte compte = proxy.getCompte(4);
        System.out.println("------------------");
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
        System.out.println(compte.getDateCreation());

        proxy. listCompte().forEach(cp-> {
            System.out.println("----------------------");
            System.out.println(cp.getCode());
            System.out.println(cp.getSolde());
            System.out.println(cp.getDateCreation());
        });

    }
}