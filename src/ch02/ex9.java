package ch02;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하세요>>");

        int n = sc.nextInt();
        int a = n/10;
        int b = n%10;

        if (a%3==0) { //3의 배수일때
            System.out.println("박수짝짝");
        }
        else if (b%3==0) {
            System.out.println("박수짝");
        }
        else {
            System.out.println("박수없음");
        }
        sc.close(); //다시 해야함 안돼...
    }
}
