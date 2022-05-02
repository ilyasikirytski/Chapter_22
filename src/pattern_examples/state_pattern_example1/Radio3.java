package pattern_examples.state_pattern_example1;

//concrete state1
public class Radio3 implements RadioStation {
    @Override
    public void play() {
        System.out.println("Radio3: play....");
    }
}
