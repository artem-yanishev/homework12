public class Main {

    public static Book apple;
    public static Book pear;

    public static void books() {
        Author author1 = new Author("Иванов", "Иван");
        Author author2 = new Author("Сергеев", "Сергей");
        apple = new Book("Яблоко", author1, 1983);
        pear = new Book("Груша", author2, 2014);
    }
}