package ch02;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("돈의 액수를 입력하세요>>");

        int m = sc.nextInt();

        System.out.print("오만원"+m/50000+"개, ");
        m %= 50000;
        System.out.print("만원"+m/10000+"개, ");
        m %= 10000;
        System.out.print("천원"+m/1000+"개, ");
        m %= 1000;
        System.out.print("500원"+m/500+"개, ");
        m %= 500;
        System.out.print("100원"+m/100+"개, ");
        m %= 100;
        System.out.print("10원"+m/10+"개, ");
        m %= 10;
        System.out.println("1원"+m+"개");

        sc.close();
        }
    }
