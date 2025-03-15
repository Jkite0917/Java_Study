package Study.Codinglearn.CodingChap_06;

public class _02_Parameter {
    public static void sayHello() {
        System.out.println("sayHello 메소드 내 println 코드입니다.");
    }

    public static void power(int number) {  // number => parameter 전달값, 파라미터
        int result = number * number;
        System.out.println(number + " 의 제곱은 " + result + " 입니다.");
    }
    public static void powerByExp(int A, int B) {
        int result = 1 ;
        for(int i=0; i<B; i++) {
            result *= A;
        }
        System.out.println(A+"의 "+B+"승은 "+result+"입니다.");
    }

    public static void main(String[] args) {
        sayHello(); // 메소드 호출
        power(4);  // 4 => 인수(Argument)
        powerByExp(4, 2);
    }
}
/*
메소드(함수)란
한 기능을 담당하는 코드를 묶어놓은 것,

 */

