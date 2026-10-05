// Rule 10 - THI00-J: Do not invoke Thread.run()
// run() does not start a new thread.
public class R10_THI00_J implements Runnable {
    public void run() {
        System.out.println("Running in: " + Thread.currentThread().getName());
    }

    public static Thread startWorker() {
        Thread worker = new Thread(new R10_THI00_J(), "worker");
        worker.run();
        return worker;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread worker = startWorker();
        worker.join();
    }
}
