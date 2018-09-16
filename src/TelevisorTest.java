public class TelevisorTest {

    public static void main(String[] args) {

        Televisor televisor = new Televisor();

        // Status TV

        televisor.showStatus();

        // Włączenie telewizora

        televisor.turnOn(1);
        televisor.showStatus();

        //Wyłącznie TV

        televisor.turnOff(0);
        televisor.showStatus();


    }

}
