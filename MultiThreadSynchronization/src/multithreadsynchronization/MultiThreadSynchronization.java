package multithreadsynchronization;

class MyData {

    synchronized public void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        
        System.out.print("\n");

    }
}

class MyThread1 extends Thread {

    MyData d;

    public MyThread1(MyData d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.display("Hello, Java");
    }

}

class MyThread2 extends Thread {

    MyData d;

    public MyThread2(MyData d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.display("This is Roky");
    }

}

public class MultiThreadSynchronization {

    public static void main(String[] args) {
        MyData data = new MyData();

        MyThread1 t1 = new MyThread1(data);
        MyThread2 t2 = new MyThread2(data);

        t1.start();
        t2.start();

    }

}
