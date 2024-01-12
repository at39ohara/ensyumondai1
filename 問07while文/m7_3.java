package 問07while文;
import java.util.Scanner;

class m7_3 {
    public static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int inputnumber;
        do {
            System.out.print("整数を入力：");
            inputnumber = stdIn.nextInt();
            
            String reversed = 1.0 / inputnumber;

            System.out.println(inverseNumber);
        } while (inputnumber != 0);
    }    
}