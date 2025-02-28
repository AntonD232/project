import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько чисел: ");
        int f = in.nextInt();
        switch (f) {
            case 2:
                System.out.print("a = ");
                a = in.nextInt();
                System.out.print("b = ");
                b = in.nextInt();
                System.out.printf("сумма от a до b : %d ",SumRange(a,b));
                break;
            case 3:
                System.out.print("a = ");
                a = in.nextInt();
                System.out.print("b = ");
                b = in.nextInt();
                System.out.print("c = ");
                c = in.nextInt();
                System.out.printf("сумма от a до b : %d ",SumRange(a,b));
                System.out.printf("сумма от b до c : %d ",SumRange(b,c));
                break;
            default:
                System.out.println("можно только 2 или 3");
        }
    }

    static int SumRange(int a,int b) {
        int result = 0;
            for (int i = a; i <= b; i++) {
                result += i;
            }
        return result;
    }
}
