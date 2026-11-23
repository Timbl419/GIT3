class Main {
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке dev");
        System.out.println();
        greet("Студент");
        System.out.println("Факториал 5 = " + factorial(5));
    }

    static void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}