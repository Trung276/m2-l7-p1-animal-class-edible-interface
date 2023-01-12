public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Con ga keu o o o";
    }

    @Override
    public String howToEat() {
        return "nau chin";
    }
}
