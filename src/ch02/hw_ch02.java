package ch02;

import java.util.Scanner;

public class hw_ch02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("0~255사이의 양의 정수를 입력하시오: ");
        num = sc.nextInt();
        String num_by = Integer.toBinaryString(num);
        System.out.println("2진수로 바꾼 값: " + num_by);
    }
}
