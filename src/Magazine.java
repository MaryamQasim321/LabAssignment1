public class Magazine extends LibraryItem {
    int issueNumber;
    public Magazine(String title, String author, int year, LibraryItemType itemTYpe,int issueNumber){
        super( title,  author,  year,   itemTYpe);
        this.issueNumber=issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}
