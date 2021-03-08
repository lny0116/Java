package ch01;

public class One2Nine {
    public static void main(String[] args) {
        int i;
        for (i=0; i<9; i++){
            System.out.print(i+1);
            System.out.print(' '); // " ' 상관 없음, 2칸 이상 띄고 싶다면 ""으로 해야함
        }
        System.out.println();
    }
}
