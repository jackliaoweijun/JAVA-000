import java.util.concurrent.*;

public class ThreadStudy extends Thread {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("第1种方法");
        ThreadFunc1 func1 = new ThreadFunc1();
        func1.start();
        func1.join();
        System.out.println("第1种返回"+func1.isRtValue());

        System.out.println("第2种方法");
        FutureTask<Boolean> fund2 = new FutureTask<>(new ThreadFunc2());
        new Thread(fund2).start();
        if(!fund2.isDone()){
            System.out.println("子线程还没处理完成");
        }
        System.out.println("第二种方法返回:"+fund2.get());

        System.out.println("第3种方法");
        ThreadFunc3 thread3 = new ThreadFunc3();
        Thread func3 = new Thread(thread3);
        func3.start();
        func3.join();
        System.out.println("第3种返回"+thread3.isRtValue());

        System.out.println("第4种方法");
        ExecutorService exec = Executors.newFixedThreadPool(1);
        Future<Boolean> future = exec.submit(new ThreadFunc4());
        System.out.println("第4种返回"+future.get());
        exec.shutdown();




    }



}
