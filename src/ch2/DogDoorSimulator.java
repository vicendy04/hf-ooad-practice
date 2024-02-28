package ch2;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Fido barks to go outside...");
        // Door opens, auto-closes on timer
        remote.pressButton();
        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido’s all done...");
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
        }
        System.out.println("...but he's stuck outside!");
        System.out.println("\nFido start barking");
        System.out.println("...so Todd grabs the remote control.");
        remote.pressButton();

        System.out.println("\nFido’s back inside...");
    }
}
