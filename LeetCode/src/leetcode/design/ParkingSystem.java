package leetcode.design;

public class ParkingSystem {

    private int big, medium, small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big != 0) {
                big--;
                return true;
            }
            return false;
        }
        if (carType == 2) {
            if (medium != 0) {
                medium--;
                return true;
            }
            return false;
        }
        if (small != 0) {
            small--;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem system = new ParkingSystem(1, 1, 0);
        System.out.println(system.addCar(1));
        System.out.println(system.addCar(1));
    }
}
