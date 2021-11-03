public class ExtendedThread extends Thread{
    @Override
    public void run() {
        System.out.println("This is extended thread");
    }

    public static void main(String[] args) {
        new Thread(new ExtendedThread()).start();
    }
}
