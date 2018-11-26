package felixwilking;

public class Main {

    public static void main(String[] args) {
        codewordchecker sc1 = new codewordchecker(5, 6, "$");
        codewordchecker sc2 = new codewordchecker("pass");

        System.out.println(sc1.isValid("happy"));
        System.out.println(sc1.isValid("happy$"));
        System.out.println(sc1.isValid("Code"));
        System.out.println(sc1.isValid("happyCode"));

        System.out.println(sc2.isValid("MyPass"));
        System.out.println(sc2.isValid("MypassPort"));
        System.out.println(sc2.isValid("happy"));
        System.out.println(sc2.isValid("1,000,000,000,000,000"));
    }
}
