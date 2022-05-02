package pattern_examples.state_pattern_example1;

public class Main {
    public static void main(String[] args) {
        RadioStation radioStation1 = new Radio1();
        Radio radioContext = new Radio();
        radioContext.setRadioStation(radioStation1);

        for (int i = 0; i < 10; i++) {
            radioContext.play();
            radioContext.nextStation();
        }
    }
}
