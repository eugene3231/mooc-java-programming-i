
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared) {
        int ownPrice = this.pricePerSquare * this.squares;
        int comparedPrice = compared.pricePerSquare * compared.squares;
        if (this.moreExpensiveThan(compared)) {
            return ownPrice - comparedPrice;
        } else if (compared.moreExpensiveThan(this)) {
            return comparedPrice - ownPrice;
        } else {
            return 0;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int ownPrice = this.pricePerSquare * this.squares;
        int comparedPrice = compared.pricePerSquare * compared.squares;
        if (ownPrice > comparedPrice) {
            return true;
        } else {
            return false;
        }
    }
}
