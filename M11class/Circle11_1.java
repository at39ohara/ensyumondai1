package M11class;

public class Circle11_1 {
    private int radius; /**半径を格納する引数 */
    
    // コンストラクタ
    Circle11_1 (int radius) {
        this.radius = radius;
    }

    // 円周の長さを計算し結果を返す
    double getLength() {
        return 2 * Math.PI * radius;
    }
    // 円の面積を計算し結果を返す
    double getArea() {
        return radius * radius * Math.PI;
    }
}
