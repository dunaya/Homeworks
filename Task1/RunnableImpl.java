public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("This is runnable thread");
    }

    public static void main(String[] args) {
        new Thread(new RunnableImpl() {
        }).start();
    }
}
