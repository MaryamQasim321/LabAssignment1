public class LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;
    private LibraryItemType itemTYpe;

    public LibraryItem(String title, String author, int year, LibraryItemType itemTYpe) {
        this.author = author;
        this.itemTYpe = itemTYpe;
        this.year = year;

        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public LibraryItemType getItemTYpe() {
        return itemTYpe;
    }

    public void setItemTYpe(LibraryItemType itemTYpe) {
        this.itemTYpe = itemTYpe;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }
    public boolean equals(Object obj) {
        LibraryItem temp= (LibraryItem) obj;
        return this.getTitle().equals( temp.getTitle() );
    }



}
