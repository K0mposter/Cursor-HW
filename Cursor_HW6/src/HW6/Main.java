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
        if (FruitList1.contains("Orange")) {
            int orangeIndex = FruitList1.indexOf("Orange");
            FruitList1.set(orangeIndex, "Grapefruit");
        } else {
            System.out.println("value not present");
        }


        ArrayList<Integer> CompareList1 = new ArrayList<>();
        CompareList1.add(124);
        CompareList1.add(12);
        CompareList1.add(4);
        System.out.println(CompareList1);
        ArrayList<Integer> CompareList2 = new ArrayList<>();
        CompareList2.add(14);
        CompareList2.add(4);
        CompareList2.add(264);
        System.out.println(CompareList2);
        CompareList1.retainAll(CompareList2);
        System.out.println(CompareList1);

    }
}