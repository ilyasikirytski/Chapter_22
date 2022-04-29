package memento_pattern_example;

//memento
public class Save {
    private final String level;
    private final int milliSecond;

    public Save(String level, int milliSecond) {
        this.level = level;
        this.milliSecond = milliSecond;
    }

    public String getLevel() {
        return level;
    }

    public int getMilliSecond() {
        return milliSecond;
    }
}
