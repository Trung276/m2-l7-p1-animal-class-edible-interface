public class Apple extends Fruit{
    @Override
    public String howToEat() {
        return "Tao: " + super.howToEat();
    }
}
