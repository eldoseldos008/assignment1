public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "James Gosling", 2020);
        Book book2 = new Book("Clean Code", "Robert Martin", 2008);

        LibraryMember member1 = new LibraryMember("Alice", 101);
        LibraryMember member2 = new LibraryMember("Bob", 102);

        Library library = new Library("Central Library", "Astana");

        System.out.println(library);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(member1);
        System.out.println(member2);

        System.out.println();

        if (book1.getYear() > book2.getYear()) {
            System.out.println(book1.getTitle() + " is newer than " + book2.getTitle());
        } else {
            System.out.println(book2.getTitle() + " is newer than " + book1.getTitle());
        }

        if (member1.getMemberId() == member2.getMemberId()) {
            System.out.println("Members are the same.");
        } else {
            System.out.println("Members are different.");
        }
    }
}