package edu.intellistart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MarketPlace {

    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader( System.in));
        String str;
        MarketPlace market=new MarketPlace();
        market.init();
        while (true) {
            printMenu();
            str= reader.readLine();
            if ("1".equals(str)) {
                market.printProducts();
            } else if ("2".equals(str)) {
                market.printBuyers();
            }
            else if("3".equals(str)) {
                return;
            }

        }

    }
    private List<Buyer> buyers=new ArrayList<>();
    private List<Product>products=new ArrayList<>();
    public void init (){
        buyers.add(new Buyer(1, "Smit", "John", 50));
        buyers.add(new Buyer(2, "London", "Jack", 100));
        buyers.add(new Buyer(3, "Musk", "Elon", 150));
        products.add(new Product(1, "flower", 10.99f));
        products.add(new Product(2, "bush", 25.5f));
        products.add(new Product(3, "tree", 55));

    }
    public static void printMenu() {
        System.out.println("Choose one of the following options");
        System.out.println("1 Display products list");
        System.out.println("2 Display buyers list");
        System.out.println("3 exit");

    }
    public void printBuyers() {
        System.out.println("List of buyers:");
        for (Buyer b:
             buyers) {
            System.out.println(b.toString());
        }
    }
    public void printProducts() {
        System.out.println("List of products:");
        for (Product p:
                products) {
            System.out.println(p.toString());
        }
    }
}

