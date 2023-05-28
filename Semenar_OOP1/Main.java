package Semenar_OOP1;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Vending vending1 = new Vending();
        Product product1 = new Product();
        product1.name = "mango";
        System.out.println(vending1.getProduct("mango"));

    }
}