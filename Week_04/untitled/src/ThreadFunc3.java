public class ThreadFunc3 implements Runnable {
    private volatile boolean rtValue = false;

    public boolean isRtValue() {
        return rtValue;
    }

    @Override
    public void run() {
        System.out.println("child thread 3");
        rtValue = true;

    }
}
