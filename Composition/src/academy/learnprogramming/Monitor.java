package academy.learnprogramming;

public class Monitor {
    private String model;
    private String manufacturers;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturers, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturers = manufacturers;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at "+x+","+y+" in colour "+ color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
