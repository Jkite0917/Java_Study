package Study.Codinglearn.CodingChap_08;

import Study.Codinglearn.CodingChap_08.camera.SpeedCam;
import Study.Codinglearn.CodingChap_08.detector.AccidentDetector;
import Study.Codinglearn.CodingChap_08.reporter.VideoReporter;

public class SelfCheck {
    public static void main(String[] args) {
        SpeedCam scam = new SpeedCam();
        scam.setDetector(new AccidentDetector());
        scam.setReporter(new VideoReporter());

        scam.detect();
        scam.report();
    }
}
