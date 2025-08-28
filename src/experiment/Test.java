package experiment;

@FunctionalInterface
interface Solution {
    abstract void add(int a, int b);
}

@FunctionalInterface
interface Solution2 {
    abstract void multiply(int a, int b);
}

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution() {
            @Override
            public void add(int a, int b) {
                System.out.println(a + b);
            };
        };
        s.add(2, 3);
        System.out.println("**** ");
        Solution2 s2 = (a, b) -> {
            System.out.println(a * b);
        };
        s2.multiply(5, 3);
    }
}