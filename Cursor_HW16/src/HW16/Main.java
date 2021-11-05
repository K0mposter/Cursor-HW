package HW16;

class CommonObject {
    int counter = 1;
}

class CounterThread implements Runnable {
    CommonObject res;

    CounterThread(CommonObject res) {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
            for (int i = 1; i <= 10; i++) {
                res.notify();
                System.out.printf("'%s' - %d\n",
                        Thread.currentThread().getName(),
                        res.counter);
                res.counter++;
                try {
                    if(i!=10){
                    res.wait();}
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CommonObject commonObject = new CommonObject();
        for (int i = 0; i < 2; i++) {
            Thread t;
            t = new Thread(new CounterThread(commonObject));
            t.setName("Thread " + i);
            t.start();
        }
    }
}