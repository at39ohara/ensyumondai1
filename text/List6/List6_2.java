package text.List6;

public class List6_2 {
    public static void main(String[] args) {
        int[] a = new int[5]; /**長さが5のaという配列を作成 */

        a[1] = 37; /**aのインデックス1番に37を代入 */
        a[2] = 51; /**aのインデックス2番に54を代入 */
        a[4] = a[1] * 2; /**aのインデックス4番に74を代入 */

        System.out.println("a[" + 0 + "] = " + a[0]); /**こっちの書き方の方が処理が効率的になるらしい */
        System.out.println("a[1] = " + a[1]); /**こっちでもいいけど上の方がいいらしい */
        System.out.println("a[" + 2 + "] = " + a[2]);
        System.out.println("a[" + 3 + "] = " + a[3]);
        System.out.println("a[" + 4 + "] = " + a[4]);
    }    
}
