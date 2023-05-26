package sparta_nbc.Syntax.thread;

public class Main {
    public static void main(String[] args) {
//        TestThread thread = new TestThread();
//        thread.start();

//        Runnable run = new TestRunnable();
//        Thread thread = new Thread(run);
//
//        thread.start();

        Runnable task = () -> {
            // TestThread 등에서 run()메서드에 적었던 부분을 여기다 적는다 라고만 알아두자
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);
        }; // 여기까지가 람다식

        Thread thread1 = new Thread(task); // Thread() 안에 Runnable 변수를 넣어주는 건 동일
        thread1.setName("thread1"); // 쓰레드 이름 정해주기
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();

    }
}
