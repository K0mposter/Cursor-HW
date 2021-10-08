package HW6;


import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Number> NumberList1 = new ArrayList<>();
        NumberList1.add(3);
        NumberList1.add(9);
        NumberList1.add(11);
        NumberList1.add(18);
        NumberList1.add(20);
        NumberList1.add(22);
        System.out.println(NumberList1);

        Iterator<Number> numberIterator = NumberList1.iterator();
        while (numberIterator.hasNext()) {
            Number nextElement = numberIterator.next();
            if ((int) nextElement % 3 == 0) {
                numberIterator.remove();
            }
        }

        System.out.println(NumberList1);


        ArrayList<String> FruitList1 = new ArrayList<>();
        FruitList1.add("Orange");
        FruitList1.add("Apple");
        FruitList1.add("Lemon");
        FruitList1.add("Mango");
        System.out.println(FruitList1);
        boolean isReplaced = false;
        for (int i = 0; i < FruitList1.size(); i++) {
            if (FruitList1.get(i).equals("Orange")){
                FruitList1.set(i,"Grapefruit");
                isReplaced = true;
            }
        }
        System.out.println(FruitList1);
        if (isReplaced = true);{
            System.out.println("there is no value");
        }



    }
}