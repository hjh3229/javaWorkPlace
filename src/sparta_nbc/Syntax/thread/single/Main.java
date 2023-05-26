package sparta_nbc.Syntax.thread.single;

public class Main { // 엄밀히 말하면 Main 쓰레드 위에 thread1을 만들어 구동했으므로 멀티 쓰레드지만 예시를 위한거니 넘긴다
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("2번 => " + Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };

        System.out.println("1번 => " + Thread.currentThread().getName());
        Thread thread1 = new Thread(task);
        thread1.setName("thread1");

        thread1.start();
        // 1번 => main
        // 2번 => thread1
        // $$$.....
    }
}
