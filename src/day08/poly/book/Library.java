package day08.poly.book;

import day05.member.Gender;
import static day07.util.Utility.*;
import java.util.Scanner;

public class Library {
    //    public static Scanner sc;
    private BookUser[] members; //도서관 회원

    public Library() {
    }

    //static 데이터는 생성자에서 포기화하면 안 됨
    //static 필드의 초기화는 static initializer 사용
//    static{
//        sc = new Scanner(System.in);
//    }
    public void addMember(BookUser user) {
        if (members == null){
            members = new BookUser[1];
            members[0] = user;
        } else {
            BookUser[] temp = new BookUser[members.length + 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = members[i];
            }
            temp[temp.length - 1] = user;
            members = temp;
        }
    }

    public Book[] getBookList() {
        Book[] bookList = new Book[5];
        bookList[0] = new CookBook("백종원의 집밥", "백종원", "TvN", true);
        bookList[1] = new CartoonBook("슬램덩크", "몰루", "만화책방", 12);
        bookList[2] = new CartoonBook("요츠바랑", "코이와이", "요츠바", 8);
        bookList[3] = new CookBook("집요리선생", "엄마손", "손맛", false);
        bookList[4] = new CookBook("맛도리탕", "또육볶음", "기사식당", true);
        return bookList;
    }

    public BookUser login() {
        Gender gender;
        System.out.println("# 회원 정보를 입력해주세요");
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("나이: ");
        int age = Integer.parseInt(sc.nextLine());
        gender = getGender();
        BookUser user = new BookUser(name, age, gender, 0);
        System.out.printf("%s님의 방문을 환영합니다.\n", user.getName());
        addMember(user);
        return user;
    }

    public static Gender getGender() {
        Gender gender;
        while (true) {
            System.out.print("성별(M/F): ");
            char insertedGender = sc.nextLine().toUpperCase().charAt(0);
            if (insertedGender == 'F') {
                gender = Gender.FEMALE;
                break;
            } else if (insertedGender == 'M') {
                gender = Gender.MALE;
                break;
            } else {
                System.out.println("성별을 M 또는 F로 입력해주세요");
            }
        }
        return gender;
    }

    public int findMemberIndex(BookUser user) {
        int memberIndex = -1;
        for (int i = 0; i < members.length; i++) {
            if (user.getName().equals(members[i].getName())) {
                memberIndex = i;
            }
        }
        return memberIndex;
    }

    public void myPage(BookUser user) {
        int index = findMemberIndex(user);
        System.out.println(members[index].toString());
    }

    public void viewAllBooks() {
        Book[] bookList = getBookList();
        for (int i = 0; i < bookList.length; i++) {
            System.out.print(i + 1 + "번째 도서: ");
            bookListToString(bookList, i);
        }
    }

    public void bookListToString(Book[] bookList, int index) {
        if (bookList[index] instanceof CartoonBook) {
            CartoonBook book = (CartoonBook) bookList[index];
            System.out.println(book.toString());
        }
        if (bookList[index] instanceof CookBook) {
            CookBook book = (CookBook) bookList[index];
            System.out.println(book.toString());
        }
    }

    public void searchBook(String textToFind) {
        System.out.printf("============ 검색결과(검색어: %s) ============\n", textToFind);
        Book[] bookList = getBookList();
        int resultCount = 0;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i].getTitle().contains(textToFind)) {
                bookListToString(bookList, i);
                resultCount++;
            }
        }
        if(resultCount == 0){
            System.out.printf("검색어 [%s]에 대한 검색결과가 존재하지 않습니다\n", textToFind);
        }

    }

    public void borrowBook(BookUser user) {
        System.out.println("============ 대여 도서 목록 ============");
        viewAllBooks();
        System.out.print("대여할 도서 번호 입력: ");
        int indexToBorrow = sc.nextInt() - 1;
        sc.nextLine();
        Book[] bookList = getBookList();
        Book target = bookList[indexToBorrow];

        target.borrowBook(user);
        //나이제한검사
//        if (target instanceof CartoonBook) {
//            boolean ageFlag = ageCheck((CartoonBook) target, user);
//            if (ageFlag) {
//                System.out.printf("# %s 책이 성공적으로 대여되었습니다.\n", target);
//            } else {
//                System.out.print("# 연령제한으로 대여가 불가합니다.");
//            }
//        }
        //쿠폰처리
//        if (target instanceof CookBook) {
//            System.out.printf("# %s 책이 성공적으로 대여되었습니다. ", target.getTitle());
//            boolean couponFlag = ((CookBook) target).isCoupon();
//            if (couponFlag) {
//                user.setCouponCount(user.getCouponCount() + 1);
//                System.out.println("요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
//            }
//        }
    }

//    public boolean ageCheck(CartoonBook book, BookUser user) {
//        return book.getAccessAge() < user.getAge();
//    }

    public void serviceMenu() {
        BookUser user = login();
        while (true) {
            System.out.print("# 엔터를 눌러 계속 진행합니다");
            sc.nextLine();
            System.out.println("============ 도서 메뉴 ============");
            System.out.println("# 1. 마이페이지");
            System.out.println("# 2. 도서 전체 조회");
            System.out.println("# 3. 도서 검색");
            System.out.println("# 4. 도서 대여하기");
            System.out.println("# 5. 프로그램 종료하기");
            System.out.print("- 메뉴 번호: ");
            int select = sc.nextInt();
            sc.nextLine();
            switch (select) {
                case 1:
                    myPage(user);
                    break;
                case 2:
                    viewAllBooks();
                    break;
                case 3:
                    System.out.print("# 검색어: ");
                    String textToFind = sc.nextLine();
                    searchBook(textToFind);
                    break;
                case 4:
                    borrowBook(user);
                    break;
                case 5:
                    System.out.println("============ 도서대여 프로그램을 종료합니다 ============");
                    System.exit(0);
            }
        }
    }


}
