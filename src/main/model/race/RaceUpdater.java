package model.race;

public class RaceUpdater implements RaceObserver {
    // concrete Observer
    private Integer counter;

    public RaceUpdater(Integer n) {
        this.counter = n;
    }

    @Override
    public void update(Races r) {
        counter += 1;
        System.out.println("You have this many races: " + getCounter());
    }

    public Integer getCounter() {
        return counter;
    }
}
