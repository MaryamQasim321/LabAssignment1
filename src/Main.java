public class Main {
    public static void main(String[] args) {


        Library lib= new Library();

        Book book1= new Book("Moth Smoke", "Mohsin Hmaeed", 2000, LibraryItemType.BOOK, 247);
        Book book2= new Book("The Reluctant Fundamentalist", "Mohsin Hmaeed", 2000, LibraryItemType.BOOK, 247);


        Magazine magazine1= new Magazine("Dastaan - e Pakistan", "Mohsin Hmaeed", 2000, LibraryItemType.MAGAZINE, 247);

        lib.addItem( book1 );
        lib.addItem( book2 );

        lib.addItem( magazine1 );

        lib.borrowItem( book1 );

        //displaying borrowed items
        lib.displayBorrowedItems();

        //showing available items after borrowing book 1
        lib.displayAvailableItems();

        lib.returnItem( book1 );

        //showing available items after returning book 1
        lib.displayAvailableItems();

    }
}