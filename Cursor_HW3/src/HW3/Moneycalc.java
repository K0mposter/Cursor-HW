package HW3;

public class Moneycalc {
    public static void main(String[] args) {
        Money money1 = new Money(2L, (byte) 60);
        Money money2 = new Money(2L, (byte) 25);
        Money moneyOperationResult = money1.addition(money2);
        boolean moneyComparsionResult;
        System.out.printf("%s + %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.deduction(money2);
        System.out.printf("%s - %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.division(money2);
        System.out.printf("%s / %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.multiplication(money2);
        System.out.printf("%s * %s = %s\n", money1, money2, moneyOperationResult);
        moneyComparsionResult = money1.equals(money2);
        System.out.printf("%s == %s: %s\n", money1, money2, moneyComparsionResult);
        moneyComparsionResult = money1.isHigher(money2);
        System.out.printf("%s > %s: %s\n", money1, money2, moneyComparsionResult);
        moneyComparsionResult = money1.isHigherOrEqual(money2);
        System.out.printf("%s >= %s: %s\n", money1, money2, moneyComparsionResult);
    }
}

class Money {
    private final long hrn;
    private final byte kop;

    public Money(long hrn, byte kop) {
        if (kop < 0 || hrn < 0)
            System.out.println("Money values can`t be negative.");
        if (kop == 100) {
            hrn++;
            kop = 0;
        }
        this.hrn = hrn;
        this.kop = kop;
    }

    public Money addition(Money money) {
        long resulthrn = this.hrn + money.hrn;
        int resultkop = this.kop + money.kop;
        if (resultkop > 100) {
            resulthrn++;
            resultkop -= 100;
        }
        return new Money(resulthrn, (byte) resultkop);
    }

    public Money deduction(Money money) {
        if (!isHigherOrEqual(money))
            throw new IllegalArgumentException("The second object must be less than or equal to the first");
        long resulthrn = this.hrn - money.hrn;
        int resultkop = this.kop - money.kop;
        if (resultkop < 0) {
            resultkop = 100 + resultkop;
            resulthrn--;
        }
        return new Money(resulthrn, (byte) resultkop);
    }

    public Money division(Money money) {
        return this.division(money.toDouble());
    }

    public Money multiplication(Money money) {
        return this.multiplication(money.toDouble());
    }

    public Money division(double number) {
        if (number < 0)
            throw new IllegalArgumentException("Number must be positive.");
        double money = this.toDouble();
        return doubleToMoney(money / number);
    }

    public Money multiplication(double number) {
        if (number < 0)
            throw new IllegalArgumentException("Number must be positive.");
        double money = this.toDouble();
        return doubleToMoney(money * number);
    }

    public boolean isHigher(Money money) {
        return this.toDouble() > money.toDouble();
    }

    public boolean isHigherOrEqual(Money money) {
        return this.toDouble() >= money.toDouble();
    }

    private double toDouble() {
        return ((this.hrn * 100) + this.kop) / 100;
    }

    private Money doubleToMoney(double num) {
        long hrn = (long) num;
        byte kop = (byte) ((num - hrn) * 100);
        return new Money(hrn, kop);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money) {
            Money secondMoney = (Money) obj;
            return this.hrn == secondMoney.hrn && this.kop == secondMoney.kop;
        }
        return false;
    }

    @Override
    public String toString() {
        return hrn + "," + kop;
    }
}