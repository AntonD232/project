import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N=");
        int N = in.nextInt();
        System.out.print("Введите M=");
        int M = in.nextInt();
        int[][] zad1 = new int[N][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                zad1[j][i] = 5 * (i + 1);
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println();
            for (int j = 0; j < M; j++) {
                System.out.printf("%d ", zad1[i][j]);
            }

        }

        for (int i = 0; i < M; i++) {
            System.out.print("\nВведите "+i+" число");
            int T = in.nextInt();
            for (int j = 0; j < N; j++) {
                zad1[j][i] = T;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println();
            for (int j = 0; j < M; j++) {
                System.out.printf("%d ", zad1[i][j]);
            }

        }
        System.out.println("\nВведите D=");
        int D = in.nextInt();
        for (int i = 0; i < M ; i++) {
            for (int j = 1; j < N; j++) {
                zad1[j][i]=zad1[j-1][i]*D;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println();
            for (int j = 0; j < M; j++) {
                System.out.printf("%d ", zad1[i][j]);
            }

        }
        System.out.println("\nВведите K=");
        int K = in.nextInt();
        if(K>=1 || K<=M) {
            for (int i = 0; i < N; i++) {
                System.out.printf("%d \n", zad1[i][K - 1]);
            }
        } else System.out.println("должно быть 1<=K<=M");
    }
}