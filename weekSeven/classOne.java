package weekSeven;

public class classOne {
    private int years;
    private String name;
    private int creditScore;
    private double bankCredit;

    public classOne(){
        years = -1;
        name = "Blank";
        creditScore = 300;
        bankCredit = 0.01;
    }
    public void setCreditScore(int creditScore){
        this.creditScore = creditScore;
    }
    public void setYears(int years){
        this.years = years;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBankCredit(double bankCredit){
        this.bankCredit = bankCredit;
    }
    public int getCreditScore(){
        return creditScore;
    }
    public double getBankCredit(){
        return bankCredit;
    }
    public void getName(){
        System.out.println(name);
    }
    public int getYears(){
        return years;
    }
    public void print(){
        System.out.println(name + " " + years + " " + creditScore + " " + bankCredit);
    }
}
