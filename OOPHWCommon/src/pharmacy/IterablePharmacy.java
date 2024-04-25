package pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterablePharmacy implements Iterable<Component> {
        private int index;
        private List<Component> components;

        public IterablePharmacy() {
            this.index = 0;
            this.components = new ArrayList<>();

        }

        public void addComponent(Component... components) {
            if (components == null) {
                System.out.println("Вы ничего не добавили");
            } else Collections.addAll(this.components, components);
        }



        @Override
        public String toString() {
            return "Pharmacy{" +
                    "components=" + components +
                    '}';
        }

//    @Override
//    public Iterator<Component> iterator() {
//        return new ComponentIterator(this);
//    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>(){
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {

                return components.get(index++);
            }

        };
    }
}

