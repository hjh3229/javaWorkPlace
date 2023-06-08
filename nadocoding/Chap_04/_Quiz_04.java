package nadocoding.Chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        /*
        조건문을 활용하여 주차 요금 정산 프로그램 만들기

        1. 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        2. 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        ex)
        일반 차량 5시간 주차 시 20000원
        경차 5시간 주차 시 10000원
        장애인 차량 10시간 주차 시 15000원

        출력 결과 : 주차 요금은 xx원 입니다.
         */

        int parkingHour = 10;
        int fee = parkingHour * 4000;
        if (fee > 30000) {
            fee = 30000;
        }
        boolean smallCar = false;
        boolean withDisabledPerson = true;

        if (smallCar || withDisabledPerson) {
            fee /= 2;
        }

        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
