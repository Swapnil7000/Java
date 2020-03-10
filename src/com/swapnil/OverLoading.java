package src.com.swapnil;

class OverLoading {
    public static void main(String[] args) {
        System.out.println(Add(1, 35));
        System.out.println(Add(1.34, 35.34));
        System.out.println(Add("Swapnil ", "Bhojwani"));
    }

    public static int Add(int a, int b) {
        return (a + b);
    }

    public static double Add(Double a, Double b) {
        return a + b;
    }

    public static String Add(String a, String b) {
        return a + b;
    }
}