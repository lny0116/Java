package ch02;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("두 정수를 입력하세요>>");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a+"+"+b+"은 "+(a+b));

        sc.close();
    }
}
