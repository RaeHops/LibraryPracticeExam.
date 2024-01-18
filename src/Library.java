public class Library {
    public static void main(String[] args) {
        Library logicLibrary = new Library();
    }
    public String nameOfLibrary;
    public boolean isOpen;
    public int numberOfBooks;
    public boolean checkedIn;
    public Book raeBook;
    public Library (){
            System.out.println("Greetings, bookworms! ");
            nameOfLibrary = "Stacks & Syntax: The Logic Library";
            isOpen = true;
            numberOfBooks = 15234;

            System.out.println("Welcome to " + nameOfLibrary + "! It is " + isOpen + " that we are open. We have " + numberOfBooks + " books on our shelves.");
            numberOfBooks = numberOfBooks *2;
            System.out.println("Welcome to " + nameOfLibrary + "! It is " + isOpen + " that we are open. We have " + numberOfBooks + " books on our shelves.");
            randomBooks();
            raeBook = new Book(300, "fantasy", true);
            raeBook.printInfo();

        }

        public void randomBooks(){
            int randomInt = (int)(Math.random()*11);
            System.out.println("We spun the wheel and you get to check out " + randomInt + " books from the Library!" );

        }



}


