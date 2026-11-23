class Main {
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке dev");
        System.out.println();
        greet("Студент");
    }

    static void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }
}