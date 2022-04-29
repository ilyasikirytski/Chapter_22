package state_pattern_example1;

//concrete state2
public class Radio2 implements RadioStation {
    @Override
    public void play() {
        System.out.println("Radio2: play....");
    }
}
