package day08.poly.book;

public class CartoonBook extends Book {

    private int accessAge; //나이제한
    public CartoonBook() {
    }
    public CartoonBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }
    public void borrowBook(BookUser user){
        if (this.accessAge <= user.getAge()) {
            System.out.printf("# %s 책이 성공적으로 대여되었습니다.\n", this.getTitle());
        } else {
            System.out.println("# 연령제한으로 대여가 불가합니다.");
        }
    }
    public String toString() {
        return super.toString() + String.format(", 연령제한 = %d세]", accessAge);
    }
}
