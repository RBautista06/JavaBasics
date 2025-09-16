package SimplePractices;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        double decilumen;

        decilumen = random.nextDouble(1,6);
        number = random.nextInt(1,6);
        //origin is the starting and bound is the end like generate me a number from 1-5
        // first number is inclusive the last is exclusive

        System.out.println(decilumen);
        System.out.println(number);
    }

}
