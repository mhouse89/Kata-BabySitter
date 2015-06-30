
public class BabySitter {

    public int calculateCharge(int startTime, int endTime, int bedTime) {

        if (startTime < 17) {
            throw new IndexOutOfBoundsException("Start Time must be 5pm or later");
        }

        if (endTime > 4 && endTime != 24) {
            throw new IndexOutOfBoundsException("End Time must be 4am or earlier");
        }

        int startToBedTime;
        int bedtimeToMidnight;
        int midnightToEnd;

        startToBedTime = bedTime - startTime;
        bedtimeToMidnight = 24 - bedTime;

        if (endTime > 1 && endTime <= 4) {
            midnightToEnd = endTime;
        }
        else {
            midnightToEnd = 0;
        }

        return (startToBedTime * 12) + (bedtimeToMidnight * 8) + (midnightToEnd * 16);
    }

}