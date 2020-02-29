import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so dong cua ma tran: ");
        int m = input.nextInt();
        System.out.println("nhap so cot cua ma tran: ");
        int n = input.nextInt();

        int A[][] = new int [m][n];
        System.out.println("nhap cac phan tu cho ma tran: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("A[" + i + "][" + j + "]");
                A[i][j] = input.nextInt();
            }
        }
        int max = A[0][0];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (max < A[i][j]){
                    max = A[i][j];
                }
            }
        }
        System.out.println("phan tu lon nhat la:" + max);
    }
}
