
public class Televisor {

    int button;
    boolean showStatus = button == 0;

    void turnOn(int inputOne) {

        this.showStatus = !((this.button < inputOne) && (inputOne == 1)) ;

    }

    void turnOff (int inputTwo){

        this.showStatus = (this.button == inputTwo) && (inputTwo == 0);
    }

    void showStatus(){

        System.out.println("Telewizor jest wyłączony: " + this.showStatus);

    }

}
