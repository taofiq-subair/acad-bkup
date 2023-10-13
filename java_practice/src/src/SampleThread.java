public class SampleThread implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        Thread.yield();
    }

    public void testSampleThread() throws InterruptedException {
        Thread t1;
        Thread t2;
        Thread t3;
        for(int i  = 1; i < 10; i ++){
            t1 = new Thread(new SampleThread(), "firstThread");
            t2 = new Thread(new SampleThread(), "secondThread");
            t3 = new Thread(new SampleThread(), "thirdThread");
            t1.start();
            t2.start();
            //
            t3.start();
            t3.join(10000);
        }
    }
}
