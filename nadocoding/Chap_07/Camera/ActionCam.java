package nadocoding.Chap_07.Camera;

public final class ActionCam extends Camera { // class에 final을 선언하면 상속도 불가능
    // _17
    public final String lens; // = "광각렌즈"; // 선언과 동시에 초기화도 가능
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈"; // 선언을 미리 해두고 나중에 초기화 할 수 도 있음. 단, final 이기에 한 번 만 가능
    }

    public final void makeVideo() { // 메소드에 final을 선언시 메소드 내 내용도 수정 불가능
        // this.lens = "값 변경"; // final 때문에 불가
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
