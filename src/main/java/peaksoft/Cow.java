package peaksoft;

public class Cow implements Animal{

    private String breed;
    private String color;

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void animalPlus() {
        System.out.println("Plus:   Cow gives milk,meat,and cow domestic animal");
    }

    @Override
    public void animalMinus() {
        System.out.println("Minus:  Сow eats a lot of grass");
    }

    @Override
    public String toString() {
        return "Cow\n"+
                "paroda: " + breed +
                " color:  " + color ;
    }
}
