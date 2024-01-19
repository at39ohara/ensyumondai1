package M02deta;

public class m2_2 {
    public static void main(String[] args) {

        // 10.0を整数型に変換する
        double inputdouble = 10.0;
        int convertedInt = (int) inputdouble;
        System.out.println(convertedInt);

        // "10"を整数型に変換する
        String inpuString = "10";
        int intNumber = Integer.parseInt(inpuString);
        System.out.println(intNumber);

        // "十"を整数型に変換する
        System.out.println("変換不可");
    }
}
