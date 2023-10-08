public class Library {
    LibraryItem[] libraryItem=new LibraryItem[100];
    int counter=0;
    public void addItem(LibraryItem item){
        for(int i=0; i< libraryItem.length; i++){
            if(libraryItem[i]==null) {
                libraryItem[i] = item;
                counter++;
                break;
            }
        }
            }

    public void borrowItem(LibraryItem item){
        if(counter>0){
        for(int i=0; i<counter; i++){
            if(libraryItem[i].equals(item)) {
                libraryItem[i].setBorrowed( true );
                break;
            }
            }
        }
    }

    public void returnItem(LibraryItem item){
        for(int i=0; i<counter; i++){
            if(counter>0&&libraryItem[i]!=null) {
                if (libraryItem[i].equals( item )) {
                    libraryItem[i].setBorrowed( false );
                }
            }
        }
    }

    public  void displayAvailableItems(){

        for(int i=0; i<counter; i++) {
            if(counter>0&&libraryItem[i]!=null){
            if (libraryItem[i].getIsBorrowed() == false) {
                {
                    System.out.printf( "%s is available", libraryItem[i].getTitle() );
                }

            }
        }
            System.out.println("\n");
        }
    }
    public  void displayBorrowedItems(){
        for(int i=0; i<counter; i++){
            if(counter>0&&libraryItem[i]!=null){
            if(libraryItem[i].getIsBorrowed()==true) {
                System.out.printf( "%s is borrowed.", libraryItem[i].getTitle() );

            }

            }
        }
        System.out.println("\n");
    }
}
