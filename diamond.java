import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Satır Sayısını Giriniz :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= (2 * i) - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int t = 0; t <= n; t++) {
            for (int k=1; k<=t; k++){
                System.out.print(" ");
            }
            for (int m=(2*n)-1; m>=(2*t)+1; m--){
                System.out.print("*");
            }
            System.out.println();
        }




    }

}

