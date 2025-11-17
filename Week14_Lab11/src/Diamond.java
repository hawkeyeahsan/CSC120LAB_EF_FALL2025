public class Diamond {

    // Data members
    private int carats;
    private double value;

    // Methods

    public Diamond(double value, int carats) {
        this.value = value;
        this.carats = carats;
    } // end of the constructor

    public int getCarats() {
        return carats;
    } // end of the getCarats method

    public void setCarats(int carats) {
        this.carats = carats;
    } // end of the setCarats method

    public double getValue() {
        return value;
    } // end of the getValue method

    public void setValue(double value) {
        this.value = value;
    } // end of the setValue method

    @Override
    public String toString() {
        return carats + " carats, worth $" + value;
    } // end of the toString method

} // end of the Diamond class
