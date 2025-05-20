public class Main {

    private static Book apple;
    private static Book pear;

    public static void books() {
        Author author1 = new Author("Иванов", "Иван");
        Author author2 = new Author("Сергеев", "Сергей");
        apple = new Book("Яблоко", author1, 1983);
        pear = new Book("Груша", author2, 2014);
    }

    public static Book getApple() {
        return apple;
    }

    public static Book getPear() {
        return pear;
    }
}