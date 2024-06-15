package Week6;

public class person {
    private String name;
    // must make phone number string bc "integer too large error"
    private String phoneNumber;
    private String birthDate;
    private int jerseyNum;

    public person(String name, String phoneNumber, String birthDate, int jerseyNum){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.jerseyNum = jerseyNum;
    }
    // setter methods
    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNum(String phoneNumber){

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

    public String getPhone(){

        return phoneNumber;
    }

    public String getBirthDate(){

        return birthDate;
    }

    public int getJerseyNum(){

        return jerseyNum;
    }

}
