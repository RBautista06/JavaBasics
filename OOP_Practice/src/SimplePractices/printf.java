package SimplePractices;

public class printf {
    public static void main(String[] args){
        String name = "Railley";
        char letter = 'R';
        int age = 21;
        double height = 60.5;
        boolean isLoading = false;

        System.out.printf("%s \n", name); // printing string
        System.out.printf("%c \n", letter);// printing char
        System.out.printf("%d \n", age);// printing int
        System.out.printf("%f \n", height);// printing double
        System.out.printf("%b \n", isLoading);// printing boolean


        // you can also print multiple variable in one printf
        System.out.printf("Your name is %s and your first letter is %c, age is %d, your height is %f, and are you Loading %b",name, letter, age, height, isLoading);

    }
 }
