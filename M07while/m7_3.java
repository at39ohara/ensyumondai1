package M07while;
import java.util.Scanner;

class M7_3 {
    public static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int inputnumber;

        System.out.print("整数を入力：");
            inputnumber = stdIn.nextInt();

        do {
            System.out.print(inputnumber % 10);
            inputnumber /= 10;
        } while (inputnumber > 0);
    }    
}