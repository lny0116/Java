package ch02;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("논리 연산을 입력하세요>>");

        boolean a = sc.nextBoolean();
        String op = sc.next(); //이게 중간에 들어가야지 실행이 정상적으로 됨
        boolean b = sc.nextBoolean();

        switch (op) {
            case "and":
                System.out.println(a && b);
                break;
            case "or":
                System.out.println(a || b);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        sc.close();
    }
}
