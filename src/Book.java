public class Book {
    public int numberOfPages;
    public String genre;
    public boolean hasPictures;

    public Book(int pNumPages, String pGenr, boolean pHasPics) {
        numberOfPages = pNumPages;
        genre = pGenr;
        hasPictures = pHasPics;
    }


public void printInfo(){
    System.out.println(numberOfPages);
    System.out.println(genre);
    System.out.println(hasPictures);

    }
}
