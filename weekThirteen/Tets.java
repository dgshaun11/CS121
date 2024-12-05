package weekThirteen;

public class Tets {
    public static void main(String[] args){
        ValidParentheses valid = new ValidParentheses();
        System.out.println(valid.isValid("()()()"));
        System.out.println(valid.isValid("{{{{}"));
        RecentCounter counter = new RecentCounter();
        System.out.println(counter.ping(1));
        System.out.println(counter.ping(100));
        System.out.println(counter.ping(3001));
        System.out.println(counter.ping(3002));
        System.out.println(counter.ping(3003));
        System.out.println(counter.ping(3500));
        System.out.println(counter.ping(3550));
        System.out.println(counter.ping(6551));
        System.out.println(counter.ping(6552));

    }
}
