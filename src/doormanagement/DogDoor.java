package doormanagement;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private String allowedBark;

    public DogDoor() {
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

    public String getAllowedBark() {
        return allowedBark;
    }

    public void setAllowedBark(String allowedBark) {
        this.allowedBark = allowedBark;
    }
}
