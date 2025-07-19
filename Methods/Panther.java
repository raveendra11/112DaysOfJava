package Methods;

public class Panther {

    public void doHunt(boolean hungry){
        if(!hungry)
            System.out.println("I'm not hungry.");
    }

    public static void main(String[] args) {

        Panther object = new Panther();
        object.doHunt(false);

    }
}
