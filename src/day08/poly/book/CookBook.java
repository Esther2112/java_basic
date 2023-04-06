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
    public void borrowBook(BookUser user) {
        System.out.printf("# %s 책이 성공적으로 대여되었습니다. ", this.getTitle());
        if (this.isCoupon()) {
            user.setCouponCount(user.getCouponCount() + 1);
            System.out.println("요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
        }
    }

    public String toString() {
        return super.toString() + String.format(", 쿠폰 = %s]",
                coupon ? "있음" : "없음");
    }
}
