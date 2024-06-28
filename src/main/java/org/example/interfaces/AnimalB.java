package org.example.interfaces;

interface AnimalFeedable {
    void feed();
}
class Turtle implements AnimalFeedable {
    @Override
    public void feed() {
        System.out.println("Turtle feeding");
    }
}
public class AnimalB {
    public static void main(String[] args) {
        AnimalFeedable af = new Turtle();
        af.feed();
    }
}
