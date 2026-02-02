import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

interface A{
    void display();
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        System.out.println("India: " + india.format(amount));
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + us.format(amount));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + china.format(amount));
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + france.format(amount));

        A a = ()->{
            System.out.println("Hello");
        };
        a.display();

    }
}
