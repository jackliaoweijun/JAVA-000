import java.util.concurrent.Callable;

public class ThreadFunc4 implements Callable<Boolean> {

    @Override
    public Boolean call() throws Exception {
        System.out.println("child thread 4");
        return true;
    }
}
