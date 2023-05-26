package sparta_nbc.Syntax.thread.yield;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                for (int i = 0; i < 10; i++) { // 1초마다 현재 쓰레드 이름 출력 10번 반복
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
            } catch (InterruptedException e) { // sleep 상태에서 interrupt 만나면 yield 실행
                Thread.yield();
            }
        };

        Thread thread1 = new Thread(task, "thread1");
        Thread thread2 = new Thread(task, "thread2");

        thread1.start(); // thread1 1초마다 출력 10번 반복
        thread2.start(); // thread2 1초마다 출력 10번 반복

        // 메인 쓰레드 5초 정지
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.interrupt(); // 위에서 5초 지난 뒤 thread1에서 InterruptedException 유도

        // thread1 // 1초 경과
        // thread2
        // thread1 // 2초 경과
        // thread2
        // thread1 // 3초 경과
        // thread2
        // thread2 // 4초 경과
        // thread1
        // thread2 // 5초에 thread1은 InterruptedException 발생, yield()로 시간 양보, 대기 상태로 전환
        // thread2 // 6초 경과
        // thread2 // 7초 경과
        // thread2 // 8초 경과
        // thread2 // 9초 경과
        // thread2 // 10초 경과, 반복문 정지
    }
}