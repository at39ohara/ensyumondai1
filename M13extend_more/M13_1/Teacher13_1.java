package M13extend_more.M13_1;

// サブクラスTeacher
class Teacher extends Person13_1 {
    // privateで受け皿を定義
    private String subject;

    // コンストラクタ
    Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    }

    // 抽象メソッドを定義
    @Override void introduce(){
        System.out.println("氏名：" + getName());
        System.out.println("職種：" + getJob());
        System.out.println("担当科目：" + subject);
    }
}