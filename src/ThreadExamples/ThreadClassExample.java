package ThreadExamples;

class ThreadExample extends Thread {
    @Override
    public void run () {
        try {
            System.out.println(
                    "Thread " + Thread.currentThread().getId() + " is running"
            );
        } catch (Exception e) {
            System.out.print("Exception!");
        }
    }
}

public class ThreadClassExample {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            ThreadExample threadExample = new ThreadExample();
            threadExample.start();
        }
    }
}
