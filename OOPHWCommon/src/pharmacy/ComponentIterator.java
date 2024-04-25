package pharmacy;

import java.util.Iterator;
import java.util.List;

public class ComponentIterator implements Iterator<Component> {
    private int index;
    private IterablePharmacy pharmacy;

    public ComponentIterator(IterablePharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    @Override
    public boolean hasNext() {
        return index < pharmacy.getComponents().size();
    }

    @Override
    public Component next() {

        return pharmacy.getComponents().get(index++);
    }
}
