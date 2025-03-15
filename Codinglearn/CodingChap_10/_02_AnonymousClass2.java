package Study.Codinglearn.CodingChap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        Burger mBurger = getMBurger();
        mBurger.cook();

        Burger bBurger = getBroBurger();
        bBurger.cook();
    }

    private static Burger getBroBurger() {
        return new Burger() {
            @Override
            public void cook() {
                System.out.println("수제버거");
                System.out.println("버거거");
            }
        };
    }

    public static Burger getMBurger() {
        return new Burger() {
            @Override
            public void cook() {
                System.out.println("게살버거");
                System.out.println("깊은 바닷속 파인애플");
            }
        };
    }
}
abstract class Burger {
    public abstract void cook();
}
