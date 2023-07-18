package thefarm;

public class TheFarm {
    public int findAnimalLegs(int chickenLegs, int dogLegs, int lionLegs) {
        int noOfChickenLegs = chickenLegs * 2;
        int noOfDogLegs = dogLegs * 4;
        int noOfLionLegs = lionLegs * 4;
        int totalLegs = noOfChickenLegs + noOfDogLegs + noOfLionLegs;
        return totalLegs;
    }
}
