package videv.codefights.introduce;

public class Rounders {
    int rounders(int value) {
        int i = 0;
        int t = value;
        while (t > 9) {
            if (t % 10 < 5) {
                value -= (t % 10) * Math.pow(10, i);
            } else {
                value -= (t % 10) * Math.pow(10, i);
                value += Math.pow(10, i+1);
            }
            t = value / (int) Math.pow(10, ++i);
        }
        return value;
    }

}
