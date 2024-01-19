package M08collection;
import java.util.Arrays;
import java.util.Random;

public class M8_5 {
    public static void main(String[] args) {

        // 配列の長さを指定
        int arrayLength = 5;
        // 配列の宣言
        int[] randomArray = new int[arrayLength];
        // Randomクラスのインスタンスを生成
        Random random = new Random();

        // 配列にランダムな数値を格納
        for (int i = 0; i < arrayLength; i++) {
            // 0から99までのランダムな整数を生成
            int randomNumber = random.nextInt(100);
            // 配列に格納
            randomArray[i] = randomNumber;
        }

        int sum = 0;

        for (int i = 0; i < arrayLength; i++) {
            sum += randomArray[i];
        }

        System.out.println("配列の中の数値は：" + Arrays.toString(randomArray));
        System.out.println("合計値は" + sum + "です。");
        System.out.println("平均値は：" + (sum / arrayLength) + "です。");
    }
    
}
