package ThreadExamples;

class ThreadThroughRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(
                    "Thread " + Thread.currentThread().getId() + " is running"
            );
        } catch (Exception e) {
            System.out.print("Exception!");
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new ThreadThroughRunnable());
            //thread.start();
            
            Thread lambdaThread = new Thread(()->{
                try {
                    System.out.println(
                            "Thread O! " + Thread.currentThread().getId() + " is running"
                    );
                } catch (Exception e) {
                    System.out.print("Exception!");
                }
            });
            lambdaThread.start();
        }
    }
}
