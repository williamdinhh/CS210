package Week7;

public class team {
    private String name;
    private int phoneNumber;
    private String birthDate;
    private int jerseyNum;

    public team(String name, int phoneNumber, String birthDate, int jerseyNum){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.jerseyNum = jerseyNum;
    }
    // setter methods
    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNum(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }

    public void setJerseyNum(int jerseyNum){
        this.jerseyNum = jerseyNum;
    }

    // getters
    public String getName(){
        return name;
    }

    public int getPhone(){
        return phoneNumber;
    }

    public String getBirthDate(){
        return birthDate;
    }

    public int getJerseyNum(){
        return jerseyNum;
    }

}
