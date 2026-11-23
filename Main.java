class Main {
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
        System.out.println();
        System.out.println("Сумма 2 + 3 = " + sum(2, 3));
        printNumbers(5);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}