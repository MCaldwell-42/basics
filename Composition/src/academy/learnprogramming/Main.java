package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("2200", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4, 6, "Version 2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);
        // this is composition opposed to inheritance. Think about if it HAS something or if it DERIVES from something.

//        thePC.getMonitor().drawPixelAt(1500,1200,"red");
//        // calling the monitor object and then calling the function from that object
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerBtn();

        thePC.powerUp();

        Bed myBed = new Bed("King");
        Lights myLights = new Lights(3, false);
        Windows myWindows = new Windows(2, false);
        Room myRoom = new Room(myLights, myWindows, myBed);

        myRoom.sleepInBed(2);
        myRoom.openMyWindow();
        myRoom.getLights().turnOnLights();
    }
}
