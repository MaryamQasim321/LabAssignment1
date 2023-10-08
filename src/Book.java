public class Book extends LibraryItem{
    int pageCount;
    public Book(String title, String author, int year,  LibraryItemType itemTYpe, int pageCount){
       super(title,  author, year,    itemTYpe);
        this.pageCount=pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
}
