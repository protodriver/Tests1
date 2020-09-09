package testEkkel;

import java.util.concurrent.Executor;

public class TestThread implements Runnable{
    int a = 0;
    public static void main(String[] args) {
        TestThread tt = new TestThread();
        Thread thread = new Thread(tt);
//        TestThread tt2 = new TestThread();
        Executor thread2 = new Executor() {
            @Override
            public void execute(Runnable command) {
                try {
                    System.out.println("before in execute");
                    ((TestThread) command).f();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
//                command.run();
            }
        };
//        TestThread tt3 = new TestThread();
//        Thread thread3 = new Thread(tt);
        thread.start();
        thread2.execute(tt);
//        thread3.start();
    }
    @Override
    public void run() {
        try {
            System.out.println("перед в run");
            f();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
//            System.out.println(i + a);
            Thread.yield();
        }
    }
    synchronized void f() throws Exception {
        System.out.println("start sleep");
        Thread.sleep(10000);
        System.out.println("end sleep");
        throw new Exception();
//        for (int i = 0; i < 5; i++) {
//
//            System.out.println("" + i + " " + ++a);
//            Thread.yield();
//        }
    }
}
