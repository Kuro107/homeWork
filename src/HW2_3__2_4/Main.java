package HW2_3__2_4;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Display display = new Display(18.4,"Philips","ips");
        computer.setDisplay(display);

        SSD ssd = new SSD(512, (byte) 2);
        computer.setSsd(ssd);

        USBPort usbPort = new USBPort(2.5,3);
        Keyboard keyboard = new Keyboard();
        keyboard.setBackLight(true);
        keyboard.setHaveNum(true);

        String engKey = "QWERTYUIOPASDFGHJKLZXCVBNM";
        char[] keyEngLetters = engKey.toCharArray();
        KeyEng keyEng = new KeyEng();
        keyEng.setLetter(keyEngLetters);
        keyboard.setKeyboard(keyEng);
        computer.setKeyboard(keyboard);

        System.out.println(computer);


        }

    }
