package ch1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber,
                          double price,
                          Builder builder,
                          String model,
                          Type type,
                          Wood backWood,
                          Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    // Update to reduce the broken chance using enum types
    // Update to return a list of Guitar
    public List search(Guitar searchGuitar) {
        List matchGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (searchGuitar.getBuilder() != guitar.getBuilder()) continue;
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel()))) continue;
            if (searchGuitar.getType() != guitar.getType()) continue;
            if (searchGuitar.getBackWood() != guitar.getBackWood()) continue;
            if (searchGuitar.getTopWood() != guitar.getTopWood()) continue;
            matchGuitars.add(guitar);
        }
        return matchGuitars;
    }

}
