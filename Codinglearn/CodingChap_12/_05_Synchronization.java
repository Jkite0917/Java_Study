package Study.Codinglearn.CodingChap_12;

import Study.Codinglearn.CodingChap_12.Clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {

        Room room = new Room();


        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("-- 직원1 청소 시작 --");
                for(int i=1; i<=5; i++) {
                    room.clean("n1");
                }
                System.out.println("직원1 끝");
            }
        };

        Runnable cleaner2 = () -> {
            System.out.println("-- 직원2 청소 시작 --");
            for(int i=1; i<=5; i++) {
                room.clean("n2");
            }
            System.out.println("직원2 끝");
        };

        Thread ct1 = new Thread(cleaner1);
        Thread ct2 = new Thread(cleaner2);

        ct1.start();
        ct2.start();
    }
}
