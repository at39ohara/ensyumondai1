package koukasokutei;
import java.util.Scanner;

public class m05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int inputnum = 0;
        int subject = 1;
        int sum = 0;

        for (int i = 1; i < 6; i++) {
            if (inputnum >= 0 && inputnum <= 100){
                System.out.print(i + "教科目の点数を入力してください:");
                subject = stdIn.nextInt();
                sum += subject;
            } else {
                System.out.print("不正な点数を検出しました。0点とします。");
            }
        }
        System.out.println("合計点 = " + sum);
        System.out.println("平均点 = " + ((double)sum / 5));
    }
}
