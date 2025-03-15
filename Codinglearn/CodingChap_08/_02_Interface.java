package Study.Codinglearn.CodingChap_08;

import Study.Codinglearn.CodingChap_08.camera.FactoryCam;
import Study.Codinglearn.CodingChap_08.detector.AdvancedFireDetector;
import Study.Codinglearn.CodingChap_08.detector.Detectable;
import Study.Codinglearn.CodingChap_08.detector.FireDetector;
import Study.Codinglearn.CodingChap_08.reporter.NormalReporter;           // 사용하는 파일을 import 해준 모습
import Study.Codinglearn.CodingChap_08.reporter.Reportable;
import Study.Codinglearn.CodingChap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 상속(extends) <- 단일 상속만 가능함

        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        Reportable videoReporter2 = new VideoReporter();
        videoReporter2.report();

        System.out.println();

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println();

        FactoryCam fcam = new FactoryCam();
        fcam.setDetector(advancedFireDetector);
        fcam.setReporter(videoReporter);

        fcam.detect();
        fcam.report();
    }
}
