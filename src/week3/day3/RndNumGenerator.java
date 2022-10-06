package week3.day3;

public class RndNumGenerator implements NumGenerator{


    @Override
    public int generate(int num) {
        return (int)(Math.random() * num);
    }
}
