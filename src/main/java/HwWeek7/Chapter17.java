package HwWeek7;

public class Chapter17 {
    String name;
    String breed;

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setInfo(String name, String breed){
        setName(name);
        setBreed(breed);
    }
}
