package neewPackage;

public class Book {
    private String titleName;
    private String author;
    private String localDate;

    public Book(String titleName, String author, String localDate) {
        this.titleName = titleName;
        this.author = author;
        this.localDate = localDate;
    }

    public String getTitleName() {
        return titleName;

    }

    public String getAuthor() {
        return author;

    }

    public String getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + titleName + '\'' +
                ", author='" + author + '\'' +
                ", publishedOn=" + localDate +
                '}';


    }
}
