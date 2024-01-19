package M07while;

public class m7_4 {
    public static void main(String[] args) {
        int total = 0;
        int count = 0;

        while (true) {
            total += count;
            count++;

            // 無限ループしないはずなのに二回目を実行数と
            // 別のインスタンスが実行中ですと出たからbreakを挟んだ
            if (total > 100000) {
                break;
            }
        }

        System.out.println("合計が100000を超えるnは" + (count - 1) + "です");
    }
}