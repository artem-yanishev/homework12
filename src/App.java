public class App {

    public static void main(String[] args) {
        Main.books();
        Main.apple.setYearOfPublication(1984);
        System.out.println("Год книги " + Main.apple.getTitle() + " был изменён на " + Main.apple.getYearOfPublication());
    }
}
