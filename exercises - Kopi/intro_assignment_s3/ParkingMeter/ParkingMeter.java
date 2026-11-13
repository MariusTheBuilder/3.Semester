package intro_assignment_s3.ParkingMeter;

public class ParkingMeter {
    private double insertedAmount;
    private Rate rate;

    public ParkingMeter(Rate rate) {
        this.insertedAmount = 0;
        this.rate = rate;
    }

    public void insertCoin(double amount) {
        insertedAmount += amount;
    }

    public int payForMinutes(int minutes) {
        double cost = rate.costFor(minutes); // meter has no idea which Rate this is
        if (cost > insertedAmount) {
            throw new IllegalStateException("Not enough money inserted");
        }
        insertedAmount -= cost;
        return minutes;
    }

    public double getInsertedAmount() {
        return insertedAmount;
    }

}
