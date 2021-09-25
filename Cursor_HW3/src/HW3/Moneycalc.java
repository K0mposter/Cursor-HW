package HW3;
import java.math.BigDecimal;

public class Moneycalc {
    public static void main(String[] args) {
        Money sum1 = new Money(10, (byte) 25);
        Money sum2 = new Money(2, (byte) 10);
        System.out.println(sum1 + " hrn" );
        System.out.println(sum2 + " hrn" );
        System.out.println(Money.add(sum1, sum2));
        System.out.println(Money.sub(sum1,sum2));
        System.out.println(Money.mult(sum1,sum2));
        System.out.println(Money.div(sum1,sum2));
    }
}


 class Money{
     long hrn;
     byte cop;

     public Money(long hrn, byte cop) {
         this.hrn = hrn;
         this.cop = cop;
     }
     public Money(double value) {
         this.hrn = (long) value;
         this.cop = (byte) ((value-hrn) * 100);
     }
     public double getNumericalValue() {
         return hrn + (double) cop / 100;
     }
     public static Money add(Money val1, Money val2){
         return new Money(val1.getNumericalValue() + val2.getNumericalValue());
     }
     public static Money sub(Money val1, Money val2){
         return new Money(val1.getNumericalValue() - val2.getNumericalValue());
     }
     public static Money mult(Money val1, Money val2){
         return new Money(val1.getNumericalValue() * val2.getNumericalValue());
     }
     public static Money div(Money val1, Money val2){
         return new Money(val1.getNumericalValue() / val2.getNumericalValue());
     }
     @Override
     public String toString() {
         return hrn + "," + cop;
     }


 }