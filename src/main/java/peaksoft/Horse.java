package peaksoft;

public class Horse implements Animal{
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
        System.out.println("Plus:   The horse is the wing of man");
    }

    @Override
    public void animalMinus() {
        System.out.println("Minus:  Horse eats a lot of grass");
    }

    @Override
    public String toString() {
        return "Horse\n"+
                "paroda: " + breed +
                " color:  " + color ;
    }
}
