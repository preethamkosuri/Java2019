package M4.CardCatalog;
class CardCatalog{
    Card[] bookTitle=new Card[10];
    Card[] bookAuthor=new Card[10];
    Card[] bookSubject=new Card[10];
    int n=0;
    public void addACard(Card b){
        bookTitle[n]=b;
        bookTitle=sortArray(bookTitle,"title");
        bookAuthor[n]=b;
        bookAuthor=sortArray(bookAuthor,"author");
        bookSubject[n]=b;
        bookSubject=sortArray(bookSubject,"subject");
        n++;
    }
    public Card getATitle(String searchTitle){
        for(int i=0;i<n;i++){
            if(bookTitle[i].getTitle().equals(searchTitle)){
                return bookTitle[i];
            }
        }
        return null;
    }
    public Card getAnAuthor(String searchAuthor){
        for(int i=0;i<n;i++){
            if(bookAuthor[i].getAuthor().equals(searchAuthor)){
                return bookAuthor[i];
            }
        }
        return null;
    }
    public Card getSubject(String searchSubject){
        for(int i=0;i<n;i++){
            if(bookSubject[i].getSubject().equals(searchSubject)){
                return bookSubject[i];
            }
        }
        return null;
    }
    public void removeATitle(String deleteTitle){
        for(int i=0;i<n;i++) {
            if(bookTitle[i].getTitle().equals(deleteTitle)){
                bookTitle=leftShift(bookTitle,i);
            }
        }
        for(int i=0;i<n;i++){
            if(bookAuthor[i].getTitle().equals(deleteTitle)){
                bookAuthor=leftShift(bookAuthor,i);
            }
        }
        for(int i=0;i<n;i++){
            if(bookSubject[i].getTitle().equals(deleteTitle)){
                bookSubject=leftShift(bookSubject,i);
            }
        }
        System.out.println("Done!");
        n--;
    }
    public void printTheCatalog(String type) {
        switch(type){
            case "title":
                for (int i=0;i<n;i++){
                    System.out.println(bookTitle[i]);
                }
                break;
            case "author":
                for (int i=0;i<n;i++){
                    System.out.println(bookAuthor[i]);
                }
                break;
            case "subject":
                for (int i=0;i<n; i++){
                    System.out.println(bookSubject[i]);
                }
                break;
        }
    }
    private Card[] leftShift(Card[] array,int f) {
        for (;f<n;f++){
            array[f]=array[f+1];
            array[f+1]=null;
        }
        return array;
    }
    private Card[] sortArray(Card[] array,String sorter){
        switch(sorter){
            case "title":
                for (int i=0;i<=n&&i<array.length;i++){
                    Card temp=null;
                    for (int i1=i+1;i1<=n&&i1<array.length;i1++)
                        if (array[i].getTitle().compareTo(array[i1].getTitle()) > 0) {
                            temp=array[i];
                            array[i]=array[i1];
                            array[i1]=temp;
                        }
                }
                return array;
            case "author":
                for (int i=0;i<=n&&i<array.length;i++){
                    Card temp=null;
                    for (int i1=i+1;i1<=n&&i1<array.length;i1++)
                        if (array[i].getAuthor().compareTo(array[i1].getAuthor())>0) {
                            temp=array[i];
                            array[i]=array[i1];
                            array[i1]=temp;
                        }
                }
            return array;
            case "subject":
                for (int i=0;i<=n&&i<array.length;i++){
                    Card temp=null;
                    for (int i1=i+1;i1<=n&&i1<array.length;i1++)
                        if (array[i].getSubject().compareTo(array[i1].getSubject())>0) {
                            temp=array[i];
                            array[i]=array[i1];
                            array[i1]=temp;
                        }
                }
            return array;
        }
        return null;
    }

}