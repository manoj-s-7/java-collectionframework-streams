package Tests;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


interface A {
    void display();
}

abstract class B {
    B() {
        System.out.println("IN Tests.B");
    }
}

class C extends B {

}

class Solution {
    private String name;

    public Solution(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A a = () -> {
            System.out.println("Hello");
        };
        a.display();
        B b = new C();
        Solution s1 = new Solution("Manoj");
        Solution s2 = new Solution("Manoj");
        System.out.println(s1.equals(s2));
        //Basic patterns using loops
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int num = 10;
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        List<Integer> val = Arrays.asList(1, 2, 3, 4, 5, 5);

        System.out.println(val.get(1));
        System.out.println(Integer.valueOf(1));
    }
}
