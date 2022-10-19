package app.model;

public abstract class Animal {
    long getTime(){return new Timer().getTime();}
    abstract Timer getTimer();
}
