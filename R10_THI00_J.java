// Rule 10 - THI00-J: Do not invoke Thread.run()
// Use start() to start the thread.
public class R10_THI00_J implements Runnable {
    public void run() {
        System.out.println("Running in: " + Thread.currentThread().getName());
    }

    public static Thread startWorker() {
        Thread worker = new Thread(new R10_THI00_J(), "worker");
        worker.start();
        return worker;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread worker = startWorker();
        worker.join();
    }
}
