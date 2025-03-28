package Study.Codinglearn.CodingChap_08.camera;

import Study.Codinglearn.CodingChap_08.detector.Detectable;
import Study.Codinglearn.CodingChap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {

    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }

    @Override
    public void showMainPicture() {
        System.out.println("속도 측정, 번호 인식");
    }
}
