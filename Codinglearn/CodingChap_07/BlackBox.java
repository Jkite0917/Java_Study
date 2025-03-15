package Study.Codinglearn.CodingChap_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String Color;
    int serialNumber;

    static int counter = 0;
    static boolean canAutoReport = false;

    BlackBox() {
//        System.out.println("기본 생성자");
//        this.serialNumber = ++counter;
//        System.out.println("시리얼 넘버 갱신 완료");
    }

    BlackBox(String modelName, String resolution, int price, String Color) {
//        this();
//
//        System.out.println("사용자 정의 생성자");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.Color = Color;
    }

    void autoReport() {
        if(canAutoReport) {
            System.out.println("자동 신고되었습니다.");
        } else {
            System.out.println("자동신고 기능이 없습니다.");
        }
    }
    
    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드 있음");
        System.out.println("용량은 " + capacity + " 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) {
            return 9;
        } else if (type == 2) {
            return 1;
        } else {
            return 10;
        }
    }
    
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화 시작");
        if(showDateTime) {
            System.out.println("날짜 정보 표시");
        } 
        if(showSpeed) {
            System.out.println("속도 정보 표시");
        }
        System.out.println(min + " 분 단위로 기록");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터로 연결합니다 (1588-1588)");
        // modelName = "test"; 불가능
        canAutoReport = true; // 가능
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    // getter, setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if(resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if(price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    String getColor() {
        return Color;
    }

    void setColor(String Color) {
        this.Color = Color;
    }


}


