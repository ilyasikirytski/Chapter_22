package pattern_examples.memento_pattern_example;

//originator
public class Game {
    private String level;
    private int milliSecond;

    public void set(String level, int milliSecond) {
        this.level = level;
        this.milliSecond = milliSecond;
    }

    public Save save() {
        return new Save(level, milliSecond);
    }

    public void load(Save save) {
        level = save.getLevel();
        milliSecond = save.getMilliSecond();
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", milliSecond=" + milliSecond +
                '}';
    }
}
