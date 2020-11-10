public class ThreadFunc1 extends Thread {
    private volatile boolean rtValue = false;

    public boolean isRtValue() {
        return rtValue;
    }

    @Override
    public void run() {
        System.out.println("child thread 1 process");
        rtValue = true;
    }
}
