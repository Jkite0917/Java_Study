package Study.Codinglearn.CodingChap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        // 사실 이것도 메소드이다
        // 단지 메인 메소드라 맨 처음 실행되는 것 뿐이다.
        // 그럼 저기서 String[] args가 뭐냐?
        /*
        실제로 우리가 입력값을 넣어볼 때
         */



         howMany(1);
    }

    static void howMany(int k) {
        System.out.println(
                switch (k) {
                    case 1 -> "one";
                    case 2 -> "two";
                    default -> "Many";
                }
        );
    }
}


        // int j = switch(){} 같은 방식도 가능해졋다.
        // yield 예악어도 있으나 저건 나중에 배워보도록 한다.


