package nadocoding.Chap_07.Camera;

//public class SlowActionCam extends ActionCam {
//    // _17
//    public SlowActionCam() {
//        this.name = "슬로우 액션 카메라";
//    }
//
//    public void makeVideo() { // final로 인해 메소드 오버라이딩도 불가능해짐
//        // this.lens = "값 변경"; // final 때문에 불가
//        System.out.println(this.name + " : "
//                + this.lens + "로 촬영한 영상을 통해 멋진 슬로우모드 비디오를 제작합니다.");
//    }
//}

public class SlowActionCam{ // 상속을 받지 못해 일일히 만들어야함.
    public String name;
    public SlowActionCam() {
        this.name = "슬로우 액션 카메라";
    }

    public void makeVideo() {
        System.out.println("자체개발한 비디오 제작 기능");
    }
}
