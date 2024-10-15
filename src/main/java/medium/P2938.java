package medium;

public class P2938 {
    public static void main(String[] args) {
        String s = "101";
        System.out.println(new P2938().minimumSteps(s));
    }


    public long minimumSteps(String s) {
        long swap = 0;
        int black = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                swap += black;
            }
            else {
                black++;
            }
        }
        return swap;
    }
}
