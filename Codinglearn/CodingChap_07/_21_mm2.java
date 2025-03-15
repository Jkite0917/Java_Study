package Study.Codinglearn.CodingChap_07;

import Study.Codinglearn.CodingChap_08.camera.Camera;
import Study.Codinglearn.CodingChap_08.camera.FactoryCam;

public class _21_mm2 {
    public static void main(String[] args) {
        Camera factCam = new FactoryCam();

        if (factCam instanceof FactoryCam) {
            ((FactoryCam)factCam).recordVideo();
        }

        // Camera fCam = factCam as FactoryCam; 시바 자바는 as 연산자가 없네??? is instanceof도 아니고???

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        for(Resolution res : Resolution.values()) {
            System.out.println(res.ordinal() + " : " + res.name() + " : " + res.getWidth());
        }
        for(nameList n : nameList.values()) {
            System.out.println(n.name() + " : " + n.getTmi());
        }
    }
enum Resolution {
        HD(1280), FHD(1920), UHD(3840);

        private final int width;
        Resolution(int width) {
            this.width = width;
        }

        public int getWidth() {
            return width;
        }
}

enum nameList {
        학생("병신1"), 학생2("병신2"), 학생3("병신3");
        private final String TMI;
        nameList(String tmi) {
            this.TMI = tmi;
        }

        public String getTmi() {
            return TMI;
        }
}
}
