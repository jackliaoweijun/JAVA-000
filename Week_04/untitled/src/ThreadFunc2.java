import java.util.concurrent.Callable;

public class ThreadFunc2 implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        System.out.println("child thread 2");
        return true;
    }
}
