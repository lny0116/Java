package ch02;

import java.util.Scanner;

public class hw_ch02 { // 2주차 과제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("0~255사이의 양의 정수를 입력하시오: ");

        int num = sc.nextInt(); // 입력 값 받음

        if (num>255 || num<0){ //입력 값이 0보다 작거나 or 255보다 클 때
            System.out.println("잘못된 값입니다.");
        }
        else { //제대로 입력했을 때
            for (int size = 7; size >= 0; --size) { //8비트 표기 (255 = 1111 1111)
               if ((num & (1 << size)) == 0) { //비트 연산과 시프트 연산을 이용
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
        }
        sc.close();
    }
}