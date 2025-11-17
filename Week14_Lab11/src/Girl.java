public class Girl {

    // Data members
    private String name;
    private Diamond diamond;

    // Methods

    public Girl(String name) {
        this.name = name;
        this.diamond = null;
    } // end of the constructor

    public String getName() {
        return name;
    } // end of the getName method

    public void setName(String name) {
        this.name = name;
    } // end of the setName method

    public Diamond getDiamond() {
        return diamond;
    } // end of the getDiamond method

    public boolean takeDiamond(Diamond diamond) {

        if (this.diamond == null || diamond.getValue() > this.diamond.getValue()) {
            this.diamond = diamond;
            return true;
        }
        return false;

    } // end of the setDiamond method

    @Override
    public String toString() {

        if (this.diamond == null) {
            return name + " has no best friend";
        }
        else {
            return name + " has a diamond, " + diamond.toString();
        }

    } // end of the toString method

} // end of the Girl class
