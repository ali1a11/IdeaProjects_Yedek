package day_47_Polymoprhism_Cont;

public class EncapsulationReview {
    private String bookTitle;
    private final String publishDate;

    public EncapsulationReview(String bookTitle, String publishDate) {
        this.bookTitle = bookTitle;
        this.publishDate = publishDate;
    }

    public String getBookTitle() {
        if(bookTitle == null){  // to prevent null point exception
            return "";
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if(bookTitle == null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }
}
