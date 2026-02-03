import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

interface A{
    void display();
}
abstract class B{
    B(){
        System.out.println("IN B");
    }
}
class C extends B{

}
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A a = ()->{
            System.out.println("Hello");
        };
        a.display();
        B b = new C();

    }
}
