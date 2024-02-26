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
        System.out.println("\nFido’s back inside...");
    }
}
