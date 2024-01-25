package M13extend_more.M13_1;

// サブクラスCook
class Cook extends Person13_1 {
    // privateで受け皿を定義
    private String specialties;

    // コンストラクタを定義
    Cook(String name, String job, String specialties) {
        super(name, job);
        this.specialties = specialties;
    }

    // 抽象メソッドを定義
    @Override void introduce(){
        System.out.println("氏名：" + getName());
        System.out.println("職種：" + getJob());
        System.out.println("得意料理：" + specialties);
    }

}