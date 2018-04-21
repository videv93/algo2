package videv.codefights.introduce;

public class AdditionWithoutCarrying {
    int additionWithoutCarrying(int param1, int param2) {
        int a = Math.max(param1, param2);
        int b = Math.min(param1, param2);
        int s = 0, i = -1;
        while (a > 0) {
            if (b > 0) {
                s += (a % 10 + b % 10) % 10 * Math.pow(10, ++i);
            } else {
                s += a % 10 * Math.pow(10, ++i);
            }
            a /= 10;
            b /= 10;
        }
        return s;
    }

    int additionWithCarrying(int param1, int param2) {
        return -1;
    }

}
