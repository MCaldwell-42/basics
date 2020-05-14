package academy.learnprogramming;

public class Windows {
    private int number;
    private boolean opened;

    public Windows(int number, boolean opened) {
        this.number = number;
        this.opened = opened;
    }

    public void openWindows(){
        this.opened = true;
        System.out.println("You've opened your windows. Feels great!");
    }

    public int getNumber() {
        return number;
    }

    public boolean isOpened() {
        return opened;
    }
}
