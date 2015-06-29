
public class BabySitter {

    public int calculateCharge(int startTime, int endTime, int bedTime) {
        int startToBedTime = bedTime - startTime;
        int bedTimeToMidnight = 24 - bedTime;
        int midnightToEnd = endTime;

        return (startToBedTime * 12) + (bedTimeToMidnight * 8) + (midnightToEnd * 16);
    }

}