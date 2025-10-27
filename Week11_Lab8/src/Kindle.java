public class Kindle {

    // Data members
    private int currentPage;
    private int totalPages;

    // Constructor
    public Kindle (int totalPages) {

        this.currentPage = 1;
        this.totalPages = totalPages;

    } // end of the constructor

    public String toString() {

        return "Page " + currentPage + " of " + totalPages;

    } // end of the toString method

    public void turnPages (int pagesToTurn) {

        if (currentPage + pagesToTurn > totalPages) {
            System.out.println("You were on                : " + toString());
            System.out.println("Turning " + pagesToTurn + " pages would take you past the last page.");
            currentPage = totalPages;
            System.out.println("You are now on             : " + toString());
        }
        else {
            currentPage += pagesToTurn;
        }

    } // end of the turnPages method

    public void turnPages () {

        turnPages(1);

    } // end of the turnPages method

}  // end of the Kindle class
