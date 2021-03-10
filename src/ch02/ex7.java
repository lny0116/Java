package ch02;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학점을 입력하세요>>");

        String g = sc.next();

        switch (g){
            case "a": case "b":
                System.out.println("excellent");
                break;
            case "c": case "d":
                System.out.println("good");
                break;
            case "f":
                System.out.println("bye");
                break;
            default:
                System.out.println("다시 입력하세요.");
        }
        sc.close();
    }
}
