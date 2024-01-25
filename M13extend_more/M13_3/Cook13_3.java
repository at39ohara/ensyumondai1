package M13extend_more.M13_3;

public class Cook13_3 implements Person13_3 {
    // 受け皿を定義
    private String name;
    private String job;
    private String specialties;

    // コンストラクタを定義
    Cook13_3(String name, String job, String specialties) {
        this.name = name;
        this.job = job;
        this.specialties = specialties;
    }

    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specialties);
    }

}
