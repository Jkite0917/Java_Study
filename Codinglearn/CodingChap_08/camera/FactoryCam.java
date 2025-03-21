package Study.Codinglearn.CodingChap_08.camera;

import Study.Codinglearn.CodingChap_08.detector.Detectable;
import Study.Codinglearn.CodingChap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainPicture() {
        System.out.println("화재 감지");
    }


    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
