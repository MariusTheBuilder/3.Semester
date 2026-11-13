package intro_assignment_s3.ParkingMeter;

public class WeekdayRate extends Rate{
    private static final double RATE_PER_MINUTE = 0.05;

    @Override
    public double costFor(int minutes) {
        return minutes * RATE_PER_MINUTE;
    }
}