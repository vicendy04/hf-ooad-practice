package inventorymanagement;

public class Guitar extends Instrument {
    // all existing props and methods are now defined in Instrument class

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        super(serialNumber, price, spec);
    }

}