package Study.Codinglearn.CodingChap_12.Clean;

public class CleanRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("-- 직원 청소 시작 (able) --");
        for(int i=2; i<=10; i+=2) {
            System.out.println("(직원)"+ i +" 번방 청소 중 (able)");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("직원 끝 (able) ");
    }

}
