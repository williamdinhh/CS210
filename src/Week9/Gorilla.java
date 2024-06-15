package Week9;

class Gorilla extends Pet {
    private String species;

    public void setSpecies(String newSpecies){
        species = newSpecies;
    }

    public String getSpecies(){
        return species;
    }

    public String speak() {
        return "RAHHHHHHH";
    }
}
