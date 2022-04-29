package observer_pattern_example;

public class Main {
    public static void main(String[] args) {
        MeteoStation meteoStation = new MeteoStation();

        meteoStation.addObserver(new ConsoleObserver());
        meteoStation.addObserver(new FileObserver());

        meteoStation.setMeasurements(24, 760);
        meteoStation.setMeasurements(20, 740);
        meteoStation.setMeasurements(21, 740);
    }
}
