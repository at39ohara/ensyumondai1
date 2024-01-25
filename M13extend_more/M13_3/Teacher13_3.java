package M13extend_more.M13_3;

public class Teacher13_3 implements Person13_3 {
    // 受け皿を定義
    private String name;
    private String job;
    private String subject;

    // コンストラクタを定義
    Teacher13_3(String name, String job, String subject) {
        this.name = name;
        this.job = job;
        this.subject = subject;
    }

    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("担当科目：" + subject);
    }
}
