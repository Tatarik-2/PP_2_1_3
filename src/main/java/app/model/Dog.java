package app.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Dog extends Animal{
    Timer timer = new Timer();
    public long getTime(){
        return timer.getTime();
    }

    @Override
    Timer getTimer() {
        return timer;
    }

    @Override
    public String toString() {
        return "I am Dog";
    }
}
