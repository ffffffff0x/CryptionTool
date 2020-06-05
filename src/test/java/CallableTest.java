import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
    private final int NUMBER = 3;

    public CallableTest() {

        // 创建容量为NUMBER的线程池。
        ExecutorService pool = Executors.newFixedThreadPool(2000);

        ArrayList<Future<String>> futures = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {

            AThread t = new AThread(i);

            Future<String> f = pool.submit(t);
            futures.add(f);
        }

        System.out.println("获取结果中...");
        for (Future<String> f : futures) {
            try {
                //if(f.isDone())
                System.out.println(f.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("得到结果.");

        // 关闭线程池。
        pool.shutdown();
    }

    private class AThread implements Callable<String> {

        private int id;

        public AThread(int id) {
            this.id = id;
        }

        @Override
        public String call() {
            //System.out.println("线程:" + id + " -> 运行...");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            //System.out.println("线程:" + id + " -> 结束.");

            return "返回的字符串" + id;
        }
    }

    public static void main(String[] args) {
        new CallableTest();
    }
}
