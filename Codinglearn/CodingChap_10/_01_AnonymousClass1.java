package Study.Codinglearn.CodingChap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        
        Coffee c2 = new Coffee();
        c2.order("라떼");
        
        Coffee spCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("서비스 추가요");
            }
        };
        spCoffee.order("녹차라떼");
    }
    
}

class Coffee {
    public void order(String coffee) {
        System.out.println(coffee + " 나왔음");
    }
}
