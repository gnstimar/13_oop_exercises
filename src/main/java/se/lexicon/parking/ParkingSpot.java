package se.lexicon.parking;

public class ParkingSpot {
    private boolean isFree;
    private int number;

    public void occupy() {
        setFree(false);
    }

    public void free() {
        setFree(true);
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
