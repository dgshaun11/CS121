package weekTen.interfaces.abstractClasses;

public class ResidentialProperty extends Property {
    private int numOfBedrooms;
    private int numOfBathrooms;
    private boolean hasBasement;
    private String address;

    public ResidentialProperty(String location, double price, int squareFootage, String address) {
        super(location, price, squareFootage);
        this.address = address;
    }

    public void setNumOfBedrooms(int numOfBedrooms){
        this.numOfBedrooms = numOfBedrooms;
    }
    public void setNumOfBathrooms(int numOfBathrooms){
        this.numOfBathrooms = numOfBathrooms;
    }
    public void setHasBasement(boolean hasBasement){
        this.hasBasement = hasBasement;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getNumOfBedrooms(){
        return numOfBedrooms;
    }
    public int getNumOfBathrooms(){
        return numOfBathrooms;
    }
    public boolean getHasBasement(){
        return hasBasement;
    }
    public String getAddress(){
        return address;
    }

    @Override
    public void display() {
        System.out.println("Location: " + location + " | Address: " + address +
                " | Number of Bathrooms: " + numOfBathrooms + " | Number of Bedrooms: "
                + numOfBedrooms + " | Has Basement: " + hasBasement);
    }
}
