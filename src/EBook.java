public class EBook extends Book {

    private double fileSize;

    public EBook(String title, String author, int year, double fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "[E-Book] " + super.toString() + ", File Size: " + fileSize + "MB";
    }
}
