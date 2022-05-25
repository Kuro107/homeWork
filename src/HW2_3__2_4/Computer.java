package HW2_3__2_4;

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
    FullName fullName;
    Login login;
    Age age;
    Password password;
    Unlocked unlocked;

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

    public KeyEng getKeyEng() {
        return keyEng;
    }

    public void setKeyEng(KeyEng keyEng) {
        this.keyEng = keyEng;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public Unlocked getUnlocked() {
        return unlocked;
    }

    public void setUnlocked(Unlocked unlocked) {
        this.unlocked = unlocked;
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
                "HW2_3.Model: " + model + "\n" +
                "HW2_3.Display: " + display + "\n" +
                "HW2_3.Color: " + color + " \n" +
                "HW2_3.SSD: " + ssd + "\n" +
                "Hw2_2.Main memory: " + ssd + "\n" +
                "HW2_3.GPU: " + gpu + "\n" +
                "USB port: " + usbPort + "\n" +
                "HW2_3.Keyboard" + keyboard + "\n" +
                "Letters: " + keyEng + "\n" +
                "Full name: " + fullName + "\n" +
                "HW2_3.Login: " + login + "\n" +
                "HW2_3.Age = " + age + "\n" +
                "HW2_3.Password: " + password + "\n" +
                "Is the account blocked" + unlocked;
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
    class FullName{
    String firstName;
    String name;
    String lastName;

        public FullName(String firstName, String name, String lastName) {
            this.firstName = firstName;
            this.name = name;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        @Override
        public String toString(){
            return
                    "First name: " + firstName + "\n" +
                    "Name: " + name + "\n" +
                     "Last name" + lastName;

        }
    }
    class Login{
    String login;


        public Login(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }
        @Override
        public String toString(){
            return
                    "HW2_3.Login: " + login;
        }
    }
    class Age{
    byte age;

        public Age(byte age) {
            this.age = age;
        }

        public byte getAge() {
            return age;
        }

        public void setAge(byte age) {
            boolean zero = true;
            this.age = age;
            if (age <= 0)
                zero = false;
        }
        @Override
        public String toString(){
            return
                    "HW2_3.Age = " + age;
        }
    }
    class Password{
    String password;

        public Password(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        @Override
        public String toString(){
            return
                    "HW2_3.Password: " + password;
        }
    }
    class Unlocked{
    boolean unlocked;

        public Unlocked(boolean unlocked) {
            this.unlocked = unlocked;
        }

        public boolean isUnlocked() {
            return unlocked;
        }

        public void setUnlocked(boolean unlocked) {
            this.unlocked = unlocked;
        }
        @Override
        public String toString(){
            return
                    "Your logins is locked " + unlocked;
        }
    }

