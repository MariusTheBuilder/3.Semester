package intro_assignment_s3.ParkingMeter;

public class WeekendRate extends Rate{
    private static final double RATE_PER_MINUTE = 0.02;

    @Override
    public double costFor(int minutes) {
        return minutes * RATE_PER_MINUTE;
    }
}
