package weekTen.interfaces.abstractClasses;

public class CommercialProperty extends Property{
    private String businessType;
    private int perception;

    public CommercialProperty(String location, double price, int squareFootage, String businessType, int perception){
        super(location, price, squareFootage);
        this.businessType = businessType;
        this.perception = perception;
    }

    public void setBusinessType(String businessType){
        this.businessType = businessType;
    }
    public String getBusinessType(){
        return businessType;
    }
    public void setPerception(int perception){
        this.perception = perception;
    }
    public int getPerception(){
        return perception;
    }

    public String marketPerception(){
        if (perception >80){
            return "Good";
        }
        else if (perception > 60){
            return "Decent";
        }
        else if (perception > 40){
            return "Poor";
        }
        else{
            return "Damaged";
        }
    }
    @Override
    public void display() {
        System.out.println("Market Perception " + marketPerception() + " | Business type: " + businessType);
    }
}
