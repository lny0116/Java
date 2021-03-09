package ch02;

import java.util.Scanner;

public class scanner {
    static final double pi = 3.14159;

    static double AreaCircle(double r){ //원형
        return pi*r*r;
    }
    static double VolumeCone(double r, double h){ //원뿔
        return 1.0/3.*pi*r*r*h;
    }
    static double VolumeSphere(double r){ //구
        return 4.0/3.*pi*r*r*r;
    }

    public static void main(String[] args) {
        double rd, h;
        Scanner scan = new Scanner(System.in);
        System.out.println("원의 면적 구하기 - 반지름을 입력하시오: ");
        rd = scan.nextDouble(); // 반지름을 실수로 입력
        System.out.println("원의 면적: "+ AreaCircle(rd));

        System.out.println("원뿔의 체적 구하기 - 반지름과 높이를 입력하시오: ");
        rd = scan.nextDouble();
        h = scan.nextDouble();
        System.out.println("원뿔의 체적: "+ VolumeCone(rd,h));

        System.out.println("구의 체적 구하기 - 지름을 입력하시오: ");
        rd = scan.nextDouble();
        System.out.println("구의 체적: " + VolumeSphere(rd));

        scan.close();
    }
}
