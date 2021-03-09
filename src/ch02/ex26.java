package ch02;

public class ex26 {
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
        System.out.println("원의 면적: "+ AreaCircle(5.));
        System.out.println("원뿔의 체적: "+ VolumeCone(5.,8.));
        System.out.println("구의 체적: "+ VolumeSphere(5.));
    }
}