package M4.CardCatalog;
class Card{
    private String Title,Author,Subject;

    public Card(String title,String author,  String subject) {
        Author = author;
        Title = title;
        Subject = subject;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    @Override
    public String toString() {
        return "Card [Title="+Title+", Author=" + Author + ", Subject=" + Subject +"]";
    }

   
    
    

}

