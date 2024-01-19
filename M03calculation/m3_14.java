package M03calculation;
import java.util.Scanner;

public class m3_14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("長方形の面積を求めます");

        System.out.print("縦の長さ：");
        int warp = stdIn.nextInt();

        System.out.print("横の長さ：");
        int side = stdIn.nextInt();

        double ans = warp * side;

        System.out.println("長方形の面積 = " + ans);
    }
}
