public class App {

    public static void main(String[] args) {
        Main.books();
        Main.getApple().setYearOfPublication(1984);
        System.out.println("Год книги " + Main.getApple().getTitle() + " был изменён на " + Main.getApple().getYearOfPublication());
    }
}
