
public class Driver {
    public static void main(String[] args) {
        
        Mammal mammal = new Mammal();
        mammal.name = "Human";
        mammal.displayAnimalInfo();
        mammal.giveBirth();

        Bird bird = new Bird();
        bird.name = "Chicken";
        bird.displayAnimalInfo();
        bird.layEggs();

    }
}
