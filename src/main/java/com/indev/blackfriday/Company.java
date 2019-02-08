package com.indev.blackfriday;

public class Company {

    private int totalAsset = 0;

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int quantity, String capsule, int price) {
        totalAsset += price * quantity;
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        return totalAsset;
    }

    public Company blackFriday() {
        return this;
    }
}
