package M11class;

public class M11_7 {
    public static void main(String[] args) {
        // 3人分の学生情報を作成
        C11_7 student1 = new C11_7("A", 001, 89, 65, 88);
        C11_7 student2 = new C11_7("B", 002, 80, 95, 64);
        C11_7 student3 = new C11_7("C", 003, 70, 80, 98);

        // 画面に表示する
        displayinfo(student1);
        displayinfo(student2);
        displayinfo(student3);
    }

    // 結果を一覧表示する
    public static void displayinfo(C11_7 C11_7) {
        System.out.print(C11_7.getNum() + "番");
        System.out.print(C11_7.getName() + "さん");
        System.out.print("平均点" + C11_7.getAve());
        System.out.println("合計点" + C11_7.getSum());
    }
}
