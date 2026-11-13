package intro_assignment_s3.ParkingMeter;

public class ParkingMeterTest {
    public static void main(String[] args) {
        ParkingMeter weekdayMeter = new ParkingMeter(new WeekdayRate());
        weekdayMeter.insertCoin(5.0);
        weekdayMeter.payForMinutes(60);
        System.out.println("Remaining after weekday parking: " + weekdayMeter.getInsertedAmount());

        ParkingMeter weekendMeter = new ParkingMeter(new WeekendRate());
        weekendMeter.insertCoin(5.0);
        weekendMeter.payForMinutes(60);
        System.out.println("Remaining after weekend parking: " + weekendMeter.getInsertedAmount());
    }
}
