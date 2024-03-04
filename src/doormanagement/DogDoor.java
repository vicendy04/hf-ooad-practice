package doormanagement;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private List allowedBarks;

    public DogDoor() {
        allowedBarks = new LinkedList();
        this.open = false;
    }

    public void open() {
        System.out.println("The dog door opens.");
        open = true;
        // make the dog door close automatically all the time
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public List getAllowedBarks() {
        return allowedBarks;
    }

    public void addAllowedBark(Bark allowedBark) {
        allowedBarks.add(allowedBark);
    }
}
