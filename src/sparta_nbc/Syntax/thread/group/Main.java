package sparta_nbc.Syntax.thread.group;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) { // 지정된 시간이 지날 때까지 아래 무한 반복
                try {
                    Thread.sleep(1000); // 매초 아래 반복
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + " Interrupted");
        };

        // ThreadGroup 클래스로 객체를 만듭니다.
        ThreadGroup group1 = new ThreadGroup("Group1");

        // Thread 객체 생성시 첫번째 매개변수로 넣어줍니다.
        // Thread(ThreadGroup group, Runnable target, String name)
        Thread thread1 = new Thread(group1, task, "Thread 1");
        Thread thread2 = new Thread(group1, task, "Thread 2");

        // Thread에 ThreadGroup 이 할당된것을 확인할 수 있습니다.
        System.out.println("Group of thread1 : " + thread1.getThreadGroup().getName());
        System.out.println("Group of thread2 : " + thread2.getThreadGroup().getName());

        thread1.start();
        thread2.start();

        try {
            // 현재 쓰레드를 지정된 시간동안 멈추게 합니다.
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // interrupt()는 일시정지 상태인 쓰레드를 실행대기 상태로 만듭니다.
        group1.interrupt();
        // Group of thread1 : Group1
        // Group of thread2 : Group1
        // Thread 2  // 1초 경과
        // Thread 1
        // Thread 1  // 2초 경과
        // Thread 2
        // Thread 2  // 3초 경과
        // Thread 1
        // Thread 1  // 4초 경과
        // Thread 2
        // Thread 2 Interrupted  // 5초가 지나서 while문 탈출
        // Thread 1 Interrupted
    }
}