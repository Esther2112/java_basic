package day08.poly.book;

public class CookBook extends Book {
    private boolean coupon; //요리학원 쿠폰 유무

    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }
    public String toString() {
        return super.toString() + String.format(", 쿠폰 = %s]",
                coupon ? "있음" : "없음");
    }
}
