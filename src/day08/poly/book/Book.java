package day08.poly.book;

public class Book {

    private String title;
    private String author;
    private String publisher;

    public Book() {
    }
    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void borrowBook(BookUser user){
        System.out.printf("# %s 책이 성공적으로 대여되었습니다. ", this.getTitle());
    }
    public String toString(){
    return String.format("[책제목 = '%s', 저자 = '%s', 출판사 = '%s'", title, author, publisher);
    }
}
