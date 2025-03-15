package Study.Codinglearn.CodingChap_08.detector;

public class AccidentDetector implements Detectable {
    @Override
    public void detect() {
        System.out.println("사고를 감지하였습니다.");
    }
}
