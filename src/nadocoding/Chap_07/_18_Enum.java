package nadocoding.Chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 (Enum)
        // 달력 : Jan, Feb, Mar, ...
        // 옷 사이즈 : XL, L, M, ...
        // OS 종류 : Win10, Win11, MacOS, LINUX, ...
        // 해상도 : HD, FHD, QHD, UHD, ...

        Resolution resolution = Resolution.HD; // 다른 객체 생성처럼 new ~~~() 형태가 아닌 ~~~.@@ 형태로 쓰임
        System.out.println(resolution); // HD

        resolution = Resolution.FHD;
        System.out.println(resolution); // FHD

        // 스위치문이 많이 사용됨
        System.out.print("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        // 동영상 녹화 품질 : 고화질
        }

        resolution = Resolution.valueOf("UHD"); // 값을 읽어 열겨형으로 바꿔서 저장
        System.out.println(resolution); // UHD

        System.out.println("---------------------");

        for (Resolution myRes : Resolution.values()) { // 열거형에 저장되어있는 값 불러오기
            System.out.println(myRes.name() + " : " + myRes.ordinal()); // .name() 열거형에 있는 이름 전달, .ordinal() 순서 전달
        }
        // HD : 0
        // FHD : 1
        // UHD : 2

        System.out.println("---------------------");

        for (Resolution myRes: Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
        // HD : 1280
        // FHD : 1920
        // UHD : 3840
    }
}

enum Resolution {
    HD(1280), FHD(1920), UHD(3840);

    // 각 열거형에 추가 값 저장
    private final int width;
    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
