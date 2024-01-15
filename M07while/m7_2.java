package M07while;

class m7_2 {
    public static void main (String[] args) {
        int x = 1;
        int sum = 0;
        do {
            sum += x;
            x++; /**sum += 1とx++の各順番が逆になると計算が狂う */

            System.out.println("合計：" + sum);
        } while (x <= 100);
    }    
}
