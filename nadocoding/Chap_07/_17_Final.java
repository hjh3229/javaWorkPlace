package nadocoding.Chap_07;

import nadocoding.Chap_07.Camera.ActionCam;
import nadocoding.Chap_07.Camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final : 해당클래스 내에서도 값을 바꿀 수 없게 만들기

        // public (final) class
        // public (final) void
        // public > abstract > static > final > ...

        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("----------------------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        // slowActionCam.recordVideo();
        slowActionCam.makeVideo();
    }
}
