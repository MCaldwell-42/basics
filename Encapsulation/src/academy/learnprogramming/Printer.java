package academy.learnprogramming;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean Duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >-1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        Duplex = duplex;
    }

    public void newTonerCart(){
        if(this.tonerLevel >= 100) {
            System.out.println("This toner cartridge is full.");
        } else if(this.tonerLevel < 100) {
            this.tonerLevel = 100;
            System.out.println("New cartridge installed. toner full.");
        }
    }

    public int printPage(int pagesInJob) {
        int pages = pagesInJob;
        if (this.Duplex == true) {
            pages = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }

        this.pagesPrinted += pages;
        System.out.println("This printer has printed "+ this.pagesPrinted+" pages.");
        return pages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrint() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return Duplex;
    }
}
