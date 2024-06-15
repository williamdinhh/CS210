package Week9;

class Bear extends Pet {
    private String bearType;

    public void setBearType(String newBearType){
        bearType = newBearType;
    }

    public String getBearType(){
        return bearType;
    }

    public String speak() {
        return "Grr Im a bear!";
    }
}
