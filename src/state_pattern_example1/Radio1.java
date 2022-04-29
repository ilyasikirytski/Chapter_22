package state_pattern_example1;

//concrete state1
public class Radio1 implements RadioStation {
    @Override
    public void play() {
        System.out.println("Radio1: play....");
    }
}

