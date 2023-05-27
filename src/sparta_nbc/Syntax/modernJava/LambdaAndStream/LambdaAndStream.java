package sparta_nbc.Syntax.modernJava.LambdaAndStream;

import java.util.ArrayList;
import java.util.List;

// 주차장 예제
// 티켓 or 파킹머니(주차비) -> 주차 가능
public class LambdaAndStream {
    public static void main(String[] args) {
        // 주차 대상 차량
        ArrayList<Car> carsWantToPark = new ArrayList<>();
        // 주차장
        ArrayList<Car> parkingLot = new ArrayList<>();

        // 주말 주차장 : 돈과 티켓 둘 다 있어야함
        ArrayList<Car> weekendParkingLot = new ArrayList<>();

        // 5개의 Car instance
        Car car1 = new Car("Benz", "Class E", true, 0);
        Car car2 = new Car("BMW", "Series 7", false, 100);
        Car car3 = new Car("BMW", "X9", false, 0);
        Car car4 = new Car("Audi", "A7", true, 0);
        Car car5 = new Car("Hyundai", "Ionic 6", false, 10000);

        carsWantToPark.add(car1);
        carsWantToPark.add(car2);
        carsWantToPark.add(car3);
        carsWantToPark.add(car4);
        carsWantToPark.add(car5);

//        parkingLot.addAll(parkingCarWithTicket(carsWantToPark));
        parkingLot.addAll(parkCars(carsWantToPark, Car::hasTicket)); // 매개변수로 함수를 지정하는 법 ::~~~

//        parkingLot.addAll(parkingCarWithMoney(carsWantToPark));
        parkingLot.addAll(parkCars(carsWantToPark, Car::noTicketButMoney));

        // 익명함수 적용
        parkingLot.addAll(parkCars(carsWantToPark, (Car car)->car.hasParkingTicket() && car.getParkingMoney() > 1000));
        // 위와 같이 로직이 간단하면 {}도 생략 가능하다.

        for (Car car : parkingLot) {
            System.out.println("Parked Car : " + car.getCompany() + "-" + car.getModel());
        }


    }

//    public static List<Car> parkingCarWithTicket(List<Car> carsWantToPark) {
//        // return할 Car 선언
//        ArrayList<Car> cars = new ArrayList<>();
//
//        // 매개 변수에 있는 car 내부에 ParkingTicket 여부 확인
//        for (Car car : carsWantToPark) {
//            if (car.hasParkingTicket()) { // 있다면 임시 ArrayList cars에 추가
//                cars.add(car);
//            }
//        }
//
//        return cars;
//    }
//
//    public static List<Car> parkingCarWithMoney(List<Car> carsWantToPark) {
//        ArrayList<Car> cars = new ArrayList<>();
//
//        // 매개 변수에 있는 car 내부에 ParkingMoney가 1000 초과인지 확인
//        for (Car car : carsWantToPark) {
//            if (!car.hasParkingTicket() && car.getParkingMoney() > 1000) {
//                cars.add(car);
//            }
//        }
//
//        return cars;
//    }

    // 위의 두 메서드를 하나로 : 내부 주요 로직을 함수로 전달 받자
    public static List<Car> parkCars(List<Car> carsWantToPark, Predicate<Car> function) {
        List<Car> cars = new ArrayList<>();

        for (Car car : carsWantToPark) {
            // 전달된 함수를 사용하여 구현
            if (function.test(car)) {
                cars.add(car);
            }
        }

        return cars;
    }
}

class Car {
    private final String company; // 자동차 회사
    private final String model; // 자동차 모델

    private final boolean hasParkingTicket;
    private final int parkingMoney;

    public Car(String company, String model, boolean hasParkingTicket, int parkingMoney) {
        this.company = company;
        this.model = model;
        this.hasParkingTicket = hasParkingTicket;
        this.parkingMoney = parkingMoney;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public boolean hasParkingTicket() {
        return hasParkingTicket;
    }

    public int getParkingMoney() {
        return parkingMoney;
    }

    public static boolean hasTicket(Car car) {
        return car.hasParkingTicket;
    }

    public static boolean noTicketButMoney(Car car) {
        return !car.hasParkingTicket && car.getParkingMoney() > 1000;
    }
}


// 메서드의 타입을 결정해주는 것 -> 인터페이스
// 인터페이스는 타입 역할을 할 수 있기 때문
// 함수형 인터페이스 : 추상 메서드를 딱 하나만 가지고 있음
//    public exampleMethod (int parameter1, ??? parameterfunction) {
//        parameterfunction
//    }

interface Predicate<T> { // 주차 가능 여부를 검증하는 역할
    boolean test(T t); // 후에 티켓 여부, 주차비 여부를 확인할 것이기 때문에 boolean
}