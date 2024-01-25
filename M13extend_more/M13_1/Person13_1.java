package M13extend_more.M13_1;

// 抽象クラスPerson
// 人の情報を管理する機能が使えることだけ定義
abstract class Person13_1 {
    // 受け皿を生成
    private String name;
    private String job;

    // 人の情報を受け取るためのコンストラクタ
    Person13_1(String name, String job){
        this.name = name;
        this.job = job;
    }

    // 人の情報を出力する抽象メソッド
    abstract void introduce();

    // 名前の情報を取得するメソッドを定義
    public String getName(){
        return name;
    }

    // 職種の情報を取得するメソッドを定義
    public String getJob(){
        return job;
    }

}