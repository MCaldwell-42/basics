package academy.learnprogramming;

public class Room {
    private Lights lights;
    private Windows windows;
    private Bed bed;

    public Room(Lights lights, Windows windows, Bed bed) {
        this.lights = lights;
        this.windows = windows;
        this.bed = bed;
    }

    public void openMyWindow(){
        windows.openWindows();
    }

    public void sleepInBed(int sleepTime){
        getBed().goToSleep(sleepTime);
    }

    public Lights getLights() {
        return lights;
    }

    public Windows getWindows() {
        return windows;
    }

    public Bed getBed() {
        return bed;
    }
}
