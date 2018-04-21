package videv.codefights.introduce;

public class GrowingPlant {
    int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int currentHeight = 0;
        int days = 1;
        while (currentHeight < desiredHeight) {
            currentHeight += upSpeed;

            if (currentHeight >= desiredHeight) {
                break;
            } else {
                currentHeight -= downSpeed;
            }

            ++days;
        }
        return days;
    }

}
