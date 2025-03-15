package Study.Codinglearn.CodingChap_06;

public class _03_Return {
    public static String getNumber() {
        String phoneNumber = "032-1234-5678";
        return phoneNumber;
    }

    public static String getAddress() {
        // 기존 void 자리에는 return 으로 반환되는 값의
        // 타입형태를 적어놓는다
        return "인천에 위치합니다.";
    }

    public static void main(String[] args) {
        String hotelNumber = getNumber();
        System.out.println("호텔 전화번호는 "+ hotelNumber);

        String address = getAddress();
        System.out.println("호출 주소는 "+address);

        double num = Math.random();
        System.out.println("랜덤 숫자 " +num);

        int number = (int) (Math.random() * 6 + 1);
    }
}
