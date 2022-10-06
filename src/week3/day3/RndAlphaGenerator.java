package week3.day3;

public class RndAlphaGenerator implements AlphaGenerator{

    @Override
    public char generate() {
        return (char)((Math.random() * 26) + 65);
    }


}
