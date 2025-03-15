package Study.Codinglearn.CodingChap_08;

import Study.Codinglearn.CodingChap_08.camera.FactoryCam;
import Study.Codinglearn.CodingChap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 클래스 (객체로 만들 수 없는 클래스)
        // 추상 메소드 (추상 클래스 또는 인터페이스에서만 사용 가능한 껍데기만 있는 메소드)

        // Camera cam = new Camera();    unable
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainPicture();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainPicture();

        // Camera fcam = new FactoryCam();  can
    }
}
