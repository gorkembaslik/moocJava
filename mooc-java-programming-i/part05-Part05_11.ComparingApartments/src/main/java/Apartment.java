
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        return this.squares>compared.squares;
    }
    
    public int priceDifference(Apartment compared){
        int difference = this.squares*this.pricePerSquare-compared.squares*compared.pricePerSquare;
        return difference < 0 ? -difference : difference;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        return this.squares*this.pricePerSquare-compared.squares*compared.pricePerSquare > 0;
    }
}
