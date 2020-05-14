package academy.learnprogramming;

public class Lights {
    private int number;
    private boolean lightsOn;

    public Lights(int number, boolean lightsOn) {
        this.number = number;
        this.lightsOn = lightsOn;
    }

    public void turnOnLights() {
        this.lightsOn = true;
        System.out.println("Lights are on. You can see!");
    }

    public int getNumber() {
        return number;
    }

    public boolean isLightsOn() {
        return lightsOn;
    }
}
