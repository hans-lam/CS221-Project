package model.race;

public class RaceUpdater implements RaceObserver {
    // concrete Observer
    private Integer counter;

    public RaceUpdater(Integer n) {
        this.counter = n;
    }

    // MODIFIES: counter
    // EFFECTS: updates the counter and prints out the number of the counter
    @Override
    public void update(Races r) {
        counter += 1;
        System.out.println("You have this many races: " + getCounter());
    }

    public Integer getCounter() {
        return counter;
    }
}
