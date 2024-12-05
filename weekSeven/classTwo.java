package weekSeven;

public class classTwo {
    private String country;
    private String city;
    private String state;

    public classTwo(){
        country = "N/A";
        city = "N/A";
        state = "N/A";
    }
    public void setCountry(String country){
        this.country = country;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void getCountry(){
        System.out.println(country);
    }
    public void getState(){
        System.out.println(state);
    }
    public void getCity(){
        System.out.println(city);
    }
    public void print(){
        System.out.println(state + " " + city + " " + country);
    }
}
