package models;

public class Random {
    public static int makeRandomNumber(int maxNum) {
        return (int) (Math.random() * maxNum);
    }
}
