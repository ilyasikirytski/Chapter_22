package pattern_examples.state_pattern_example1;

//context
public class Radio {
    RadioStation radioStation;

    public void setRadioStation(RadioStation radioStation) {
        this.radioStation = radioStation;
    }

    void nextStation() {
        if (radioStation instanceof Radio1) {
            setRadioStation(new Radio2());
        } else if (radioStation instanceof Radio2) {
            setRadioStation(new Radio3());
        } else if (radioStation instanceof Radio3) {
            setRadioStation(new Radio1());
        }
    }

    void play() {
        radioStation.play();
    }
}
