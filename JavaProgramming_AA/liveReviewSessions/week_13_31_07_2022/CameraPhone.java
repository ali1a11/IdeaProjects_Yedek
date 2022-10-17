package week_13_31_07_2022;

public class CameraPhone extends Phone{
    int imageSize;
    int memorySize;

    public CameraPhone(String make, String model, double price, int imageSize, int memorySize) {
        super(make, model, price);
        this.imageSize = imageSize;
        this.memorySize = memorySize;
        // if we have default constructor(without parameter) we do not need to call parent constructor with super
    }

    public CameraPhone() {
    }

    public int numPictures(){
        return memorySize*100/imageSize;
    }
}
