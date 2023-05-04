package nadocoding.Chap_07;

public class BlackBox {
    // _02
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 번호

    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (처음엔 0이였다가 증감연산자로 증가)
    // _03
    static boolean canAutoReport = false; // 자동 신고 가능

    // _08
    BlackBox() {  // 생성자 // 인스턴스가 생성될 때 자동으로 실행되는 메소드
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다. " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // 기본 생성자 호출
//
//        System.out.println("사용자 지정 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    // _04
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) {
            return 9;
        } else if (type == 2) {
            return 1;
        } else {
            return 10;
        }
    }

    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상의 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상의 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    //_05
    void record() {
        record(true, true, 5);
    }

    // _06
    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
        // modelname = "test"; // 클래스 메소드 내에서는 인스턴스 변수 사용 불가능
        // canAutoReport = false; // 클래스 변수만 사용 가능
    }

    // _07
    void appendModelName(String modelName) {
        // modelName += modelName; // 이렇게 하면 전달값에 전달값을 더하는 기능이 되버린다.
        // 이와같이 이미 존재하는 인스턴스 변수명과 전달값의 이름이 같은 경우 이를 구분하기 위해 this를 붙인다.
        this.modelName += modelName;
    }

    // _09
    // Getter & Setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int i) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
