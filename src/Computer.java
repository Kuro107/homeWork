import java.util.Arrays;

public class Computer {
    Display display;
    Model model;
    Color color;
    SSD ssd;
    Ram ram;
    GPU gpu;
    USBPort usbPort;
    Keyboard keyboard;
    KeyEng keyEng;

    public  Computer(){}

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public USBPort getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(USBPort usbPort) {
        this.usbPort = usbPort;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Computer(Display display, Model model, Color color, SSD ssd, Ram ram, GPU gpu, USBPort usbPort, Keyboard keyboard) {
        this.display = display;
        this.model = model;
        this.color = color;
        this.ssd = ssd;
        this.ram = ram;
        this.gpu = gpu;
        this.usbPort = usbPort;
        this.keyboard = keyboard;

    }
    @Override
public String toString(){
        return "This computer have: " + "\n" +
                "Model: " + model + "\n" +
                "Display: " + display + "\n" +
                "Color: " + color + " \n" +
                "SSD: " + ssd + "\n" +
                "Main memory: " + ssd + "\n" +
                "GPU: " + gpu + "\n" +
                "USB port: " + usbPort + "\n" +
                "Keyboard" + keyboard + "\n" +
                "Letters: " + keyEng;
    }
}
class Display{
    public Display(){}
    public Display(double diagonal, String madeFrom, String matrix) {
        this.diagonal = diagonal;
        this.madeFrom = madeFrom;
        this.matrix = matrix;
    }

    private double diagonal;
    private String madeFrom;
    private String matrix;

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getMadeFrom() {
        return madeFrom;
    }

    public void setMadeFrom(String madeFrom) {
        this.madeFrom = madeFrom;
    }

    public String getMatrix() {
        return matrix;
    }

    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }
    @Override
    public String toString(){
        return
                "Diagonal: " + diagonal + "\n" +
                        "Made from: " + madeFrom + "\n" +
                        "Matrix: " + matrix;
    }
}
class Model{
    public Model() {
    }
}
class Color{

}
class  SSD{
    public SSD(){}

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public byte getHowManyDiscs() {
        return howManyDiscs;
    }

    public void setHowManyDiscs(byte howManyDiscs) {
        this.howManyDiscs = howManyDiscs;
    }

    public SSD(int memory, byte howManyDiscs) {
        this.memory = memory;
        this.howManyDiscs = howManyDiscs;

    }

    int memory;
    byte howManyDiscs;

    @Override
    public String toString(){
        return
                "Memory: " + memory + "\n" +
                        "How many discs: " + howManyDiscs;
    }
}
class Ram{
    public Ram() {
    }
}
class GPU {
    public GPU(){}

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getMadeFrom() {
        return madeFrom;
    }

    public void setMadeFrom(String madeFrom) {
        this.madeFrom = madeFrom;
    }

    public GPU(int memory, String madeFrom) {
        this.memory = memory;
        this.madeFrom = madeFrom;

    }

    int memory;
    String madeFrom;
    @Override
    public String toString(){
        return
                "Memory: " + memory + "\n" +
                        "Made from: " + madeFrom;
    }
}
class USBPort{
    public USBPort(){}

    public USBPort(double portType, int portID) {
        this.portType = portType;
        this.portID = portID;
    }

    double portType;
    int portID;

    public double getPortType() {
        return portType;
    }

    public void setPortType(double portType) {
        this.portType = portType;
    }

    public int getPortID() {
        return portID;
    }

    public void setPortID(int portID) {
        this.portID = portID;
    }
    @Override
    public String toString(){
        return
                "Type: " + portType + "\n" +
                        "ID : " + portID;
    }
}
class Keyboard{
    public Keyboard(){}
    public Keyboard(boolean backLight, boolean haveNum) {
        this.backLight = backLight;
        this.haveNum = haveNum;
    }

    public KeyEng getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(KeyEng keyboard) {
        this.keyboard = keyboard;
    }

    public boolean isBackLight() {
        return backLight;
    }

    public void setBackLight(boolean backLight) {
        this.backLight = backLight;
    }

    public boolean isHaveNum() {
        return haveNum;
    }

    public void setHaveNum(boolean haveNum) {
        this.haveNum = haveNum;
    }


   private KeyEng keyboard;
   private boolean backLight;
   private boolean haveNum;
    @Override
    public String toString(){
        return
                "Have back light: " + backLight + "\n" +
                        "Have num: " + haveNum;
    }


}

class KeyEng{
    public  KeyEng(){}
    public KeyEng(char[] letter) {
        this.letter = letter;
    }

    private char [] letter;

    public char[] getLetter() {
        return letter;
    }

    public void setLetter(char[] letter) {
        this.letter = letter;
    }
    @Override
    public String toString(){
        return
                "Keyboards symbols: " + Arrays.toString(letter);
    }

}
