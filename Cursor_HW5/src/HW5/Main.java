package HW5;

public class Main {

    public static void main(String[] args) {
        Number num1 = 6;
        Number num2 = 13;
        Number num3 = 78;
        Number num4 = 0;
        MyList<Number> numberMyList = new MyList<>();
        numberMyList.add(num1);
        numberMyList.add(num2);
        numberMyList.add(num3);
        numberMyList.add(num4);
        System.out.println(numberMyList);
        System.out.println("Smallest is " + numberMyList.smallest());
        System.out.println("Largest is " + numberMyList.largest());
    }
}
