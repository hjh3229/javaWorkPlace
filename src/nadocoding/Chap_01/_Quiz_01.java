package nadocoding.Chap_01;

/*
 (출력 결과)
 상암08번 버스
 약 3분 후 도착
 남은 거리  1.2km
 */

public class _Quiz_01 {
    public static void main(String[] args) {
        String busNo = "상암08";
        int busTime = 3;
        double busDistance = 1.2;

        System.out.println(busNo + "번 버스");
        System.out.println("약 " + busTime + "분 후 도착");
        System.out.println("남은 거리 " + busDistance + "km");
    }
}
