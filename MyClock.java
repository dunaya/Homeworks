import java.util.concurrent.TimeUnit;

public class MyClock extends Thread {
    private boolean t = true;

    @Override
    public void run() {
        try {
            while (t) {
                System.out.println("Tik");
                TimeUnit.MILLISECONDS.sleep(500);
                if (!t) {
                    break;
                }
                System.out.println("Tak");
                TimeUnit.MILLISECONDS.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stopClocking() {
        t = false;
    }

    public static void main(String[] args) throws InterruptedException {
        var thread = new MyClock();
        thread.start();
        TimeUnit.SECONDS.sleep(50);
        thread.stopClocking();
    }
}
