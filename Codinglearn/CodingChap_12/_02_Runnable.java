package Study.Codinglearn.CodingChap_12;

import Study.Codinglearn.CodingChap_12.Clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {

        CleanRunnable cr = new CleanRunnable();
        Thread thread = new Thread(cr);

        thread.start();
        cleanByBoss();
    }
    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for(int i=1; i<=10; i+=2) {
            System.out.println("(사장)"+ i +" 번방 청소 중");
        }
        System.out.println("사장 끝");
    }
}
