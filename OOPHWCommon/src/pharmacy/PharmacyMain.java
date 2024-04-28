package pharmacy;

import java.util.*;

public class PharmacyMain {
    public static void main(String[] args) {
        Component peniz =new Component("Peniz", "10mg", 100);
        Component salt =new Component("Salt", "40mg", 40);
        Component sugar =new Component("Sugar", "200mg", 30);

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponent(salt, peniz);
        Pharmacy pharmacy11 = new Pharmacy();
        pharmacy11.addComponent(salt, peniz);
        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponent(sugar, peniz);
        Pharmacy pharmacy21 = new Pharmacy();
        pharmacy21.addComponent(sugar, peniz);
        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponent(sugar, peniz,salt);
        Pharmacy pharmacy4 = new Pharmacy();
        pharmacy4.addComponent(sugar, salt);
        Set <Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy11);
        result.add(pharmacy2);
        result.add(pharmacy21);
        result.add(pharmacy3);
        result.add(pharmacy4);
       // System.out.println(result);
        Iterator iR= result.iterator();
        while (iR.hasNext()) {
            System.out.println(iR.next());
        }
        System.out.println(result.hashCode());

//        System.out.println(pharmacy1);
//        System.out.println(pharmacy2);
//        Iterator <Component> itComp = pharmacy1;
//        while (itComp.hasNext()){
//            System.out.println(itComp.next());
//        }
//        IterablePharmacy iPharmacy1 = new IterablePharmacy();
//        iPharmacy1.addComponent(salt, peniz);
//        while (iPharmacy1.iterator().hasNext()){
//            System.out.println(iPharmacy1.iterator().next());
//        }
//        List<Component> list = new ArrayList<>();
//        list.add(salt);
//        list.add(peniz);
//        list.add(sugar);
//        Collections.sort(list);
//        System.out.println(list);


    }
}
