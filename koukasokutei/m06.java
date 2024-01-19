package koukasokutei;
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;

public class m06 {
  public static void main(String[] args){
    // Scannerクラスのインスタンス化
    Scanner stdIn = new Scanner(System.in);
    // Randomクラスのインスタンス化
    Random rand = new Random();
    //----------------------------------------------------------------------------------------------------//
    //国名と首都がセットで格納されているHashMapを作成する。
    HashMap<String,String> map = new HashMap<>();
    // キーとして国名を、値として首都をmapを格納する
    map.put("日本","東京");
    map.put("中国","北京");
    map.put("インド","ニューデリー");
    map.put("イギリス","ロンドン");
    map.put("アメリカ","ワシントンD.C.");
    //拡張for文を使って、Mapの要素数分繰り返す
    for(String str:map.keySet()){
        //Mapの値に設定されている___(1)___を表示する
        //3回目の処理で表示される値は"___(2)___"
        System.out.println(map.get(str));
      }
      System.out.println("//----------------------------------------------------------------------------------------------------//");
      //九九の表を出力する
      //1~9の段の分繰り返す
      Dan:
      for(int i = 1;i <= 9; i++){
        //～の段と表示
        System.out.println(i+"の段");
        //段の中で1～9までの式を表示する
        Inner:
        for(int j = 1;j <= 9;j++){
          //4の段は苦手で覚えていません
          //4の段だった場合は___(3)___から抜ける
          if(i == 4) break Inner;
          //8の段から先はまだ覚えていないので、九九の表が書けません
          //8の段まで来たら、メッセージを表示して___(4)___の表示をやめる
          if(i == 8){
            System.out.println("8の段より先は覚えていません・・・");
            break Dan;
        }
        //式の表示
        System.out.print(i+"×"+j+"="+(i*j)+":");
      }
      //段の表示が終わったら改行
      System.out.println();
    }
    System.out.println("//----------------------------------------------------------------------------------------------------//");
    //int型の変数numを宣言する
    int num;
    //long型の変数longNumを宣言する
    long longNum;
    //long型の最大値をlongNumに代入する
    longNum = Long.MAX_VALUE;
    //longNumをint型にキャストしてnumに代入する
    num = (int)longNum;
    //numを表示する。ここで表示される数値は___(5)___。
    System.out.println(num);

    //数値が___(5)___となる理由は、すべてのビットが___(6)___で埋まったint型の値になるため

    System.out.println("//----------------------------------------------------------------------------------------------------//");
    

    System.out.println("//----------------------------------------------------------------------------------------------------//");

    //int型の変数num3に3を代入する
    int num3 = 3;
    //int型の変数num4に4を代入する
    int num4 = 4;
    //int型の変数num5に5を代入する
    int num5 = 5;
    //変数num6にnum3、num4、num5の中で___(9)___ 数値を代入する
    int num6 = num3 < num4 ? (num3 < num5 ? num3 : num5 ) : (num4 < num5 ? num4 : num5);
    //num6を表示する。ここで表示される数値は___(10)_ __。
    System.out.println("num6の中身は"+ num6 +"です！");
  }
}
