package bai7_ThucHanh;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cục tác cục tác";
    }

    @Override
    public String howToEat() {
        return "eat rice";
    }
}
