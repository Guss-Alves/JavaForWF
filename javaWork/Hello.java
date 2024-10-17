public class Hello{
    //this line main is always necessary on Java applications
    public static void main(String[] args){
        // System.out.println("hello world");
        String firstName = "Gustavo";
        String lastName = "Alves";
        String result = firstName + " " + lastName;
        System.out.println(result);
        System.out.println(String.format("u got it %s", firstName));
        // System.out.println();
        for(int i = 0; i <= 10; i++){
            System.err.printf("Looping through the number ->  %s \n", i);
        }
    }
}