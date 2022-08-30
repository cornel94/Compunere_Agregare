import java.util.ArrayList;

public class Screen {

    private int pixelNo;
    private Dimensions dimensions;
    private Pixel thePixel;

    ArrayList<Pixel> pixels;

    public Screen(){}

    public Screen (int pixelNo, String color, int width, int lenght, int depth){
        this.pixelNo = pixelNo;
        this.thePixel = new Pixel(color);
        this.dimensions = new Dimensions(width,lenght,depth);
    }

    public void setPixel(int pixelNo, String color){
        this.pixelNo = pixelNo;
        this.thePixel.setPixel(color);

    }

    public void colorScreen(String color){
        this.thePixel.setPixel(color);
        System.out.println("The screen color is " + color);
    }
}
