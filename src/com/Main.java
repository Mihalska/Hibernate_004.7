package com;
import com.Animal1;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimalHelper cr = new AnimalHelper();
        Animal1 animal1 = new Animal1();

// ----------- add(animal1) -------------
//        animal1.setName("Petrovich");
//        animal1.setAge(25);
//        animal1.setTail(true);
//        cr.add(animal1);

// -----------List<Animal1> ----------
//        List<Animal1> animal1s = cr.getAll();
//        for (Animal1 an1 : animal1s) {
//            System.out.println(an1.getId() + " " + an1.getName() + " "
//                    + an1.getAge() + " " + an1.isTail());
//        }
// ---------- пошук по ID --------
//        animal1 = cr.getById(1);
//        System.out.println(animal1.getId() + " " + animal1.getName() + " "
//                    + animal1.getAge() + " " + animal1.isTail());
// ----------видалення -----------
        cr.remove(cr.getById(1));
    }
}
