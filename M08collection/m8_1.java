package M08collection;

public class m8_1 {
    public static void main(String[] args) {
        // 配列の宣言をする
        int [] a = new int[10];

        // リストに初期値0の変数に1を追加したものを代入していく
        for (int i = 0; i < a.length; i++)
            a[i] = i + 1;
        
        // 初期値0の変数からlengthを使ってリストの長さを取得(9)
        // 最後の9のところまでを添え字を指定して出力する
        for (int i = 0; i < a.length; i++)
            System.out.println("list[" + i + "] = " + a[i]);
    }
    
}
