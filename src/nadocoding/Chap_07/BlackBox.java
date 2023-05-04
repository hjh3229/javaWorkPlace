package nadocoding.Chap_07;

public class BlackBox {
    // _02
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    // _03
    static boolean canAutoReport = false; // 자동 신고 가능

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
}
