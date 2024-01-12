package 問06for文;

class m6_7 {
    public static void main(String[] args) {

        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                int ans = x * y;
                System.out.println(x + "×" + y + "=" + ans);
            }
        }
    }
}
