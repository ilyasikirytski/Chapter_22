package pattern_examples.observer_pattern_example;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileObserver implements Observer {
    @Override
    public void handleEvent(int temp, int pressure) {
        String text = "Weather is changed: temp: " + temp + " pressure: " + pressure;
        try {
            Path pathTemp = Files.createTempFile(Path.of(System.getenv("USERPROFILE") + "\\Desktop\\"), "TemperaturePressure", ".txt");
            FileWriter file = new FileWriter(String.valueOf(pathTemp));
            file.append(text);
            file.append("n");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //для записи(и для добавления новых строк) в один файл.
//        FileWriter fileWriter;
//        try {
//            fileWriter = new FileWriter(System.getenv("USERPROFILE") + "\\Desktop\\TemperaturePressure.txt", true);
//            fileWriter.append(text);
//            fileWriter.append("\n");
//            fileWriter.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
