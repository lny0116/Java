package ch02;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b=5;
        System.out.print("몇 층인지 입력하세요>>");
        a = sc.nextInt();

        b *= a;
        System.out.println(b+"m 입니다.");
        sc.close();
    }
}
