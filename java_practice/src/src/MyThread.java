class MyThread extends Thread{
    @Override
    public void run() {
//        super.run();

        for (int a = 0; a < 5; a++){
            System.out.println("Loop  from my THREAD class: " + a );
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
//        super.run();
for(int a = 0; a<5; a++) {
    System.out.println("This is from RUNNABLE class: " + a);

}
    }
}