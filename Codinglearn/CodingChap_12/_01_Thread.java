package Study.Codinglearn.CodingChap_12;

import Study.Codinglearn.CodingChap_12.Clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 하나의 프로세스 process
        // 쓰레드

        // 1, 3, 5, 7, 9
        // 2, 4, 6, 8, 10

        // cleanBySelf();

        CleanThread ct = new CleanThread();
        //ct.run();
        ct.start();  // 여러번 실행 해 볼것

        cleanByBoss();
    }
    
    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for(int i=1; i<=10; i++) {
            System.out.println("(혼자)"+ i +" 번방 청소 중");
        }
        System.out.println("끝");
    }
    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for(int i=1; i<=10; i+=2) {
            System.out.println("(사장)"+ i +" 번방 청소 중");
        }
        System.out.println("사장 끝");
    }
}
