package ch02;

import java.util.Scanner;

public class ex8 { //if문 활용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("커피 주문하세요>>");

        String coffee = sc.next();
        int a = sc.nextInt();

        if (coffee.equals("에스프레소")){
            System.out.println(a*2000+"원입니다.");
        }
        else if (coffee.equals("아메리카노")){
            System.out.println(a*2500+"원입니다.");
        }
        else if (coffee.equals("카푸치노")){
            System.out.println(a*3000+"원입니다.");
        }
        else if (coffee.equals("카페라떼")){
            System.out.println(a*3500+"원입니다.");
        }
        else {
            System.out.println("다시 주문해주세요.");
        }
        sc.close();
    }
}
