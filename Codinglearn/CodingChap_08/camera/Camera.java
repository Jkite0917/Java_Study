package Study.Codinglearn.CodingChap_08.camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("녹화를 시작합니다.");
    }

    public abstract void showMainPicture(); // 자식 클래스에서 구현해야 하는 메소드
}
