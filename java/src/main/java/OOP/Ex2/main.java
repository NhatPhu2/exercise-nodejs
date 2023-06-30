package Ex2;

public class main {
    public static void main(String[] args) {
        Book javaBook = new Book("Java","java",30);
        Book CPlusBook = new Book("C++","C++",30);
        Book CSharpBook = new Book("C#","C#",30);
        Library library = new Library();
        library.addBook(javaBook);
        library.addBook(CSharpBook);
        library.addBook(CPlusBook);
        Member member = new Member("phu");
        member.borrowBook(javaBook);
        member.returnBook(javaBook);
        member.displayBorrowedBooks();

    }
}
