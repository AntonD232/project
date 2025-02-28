import java.util.Scanner;


import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S=0;
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 10; j++) {
                S += sin(pow(i, 3) + pow(j, 4));
            }
        }
        System.out.printf("S=%.3f", S);
    }


}