package Functions_and_methods;

public class votingelible {
    public static void main(String[] args) {
        votingcheck(18);
    }

     static void votingcheck(int age) {
        if(age>=18){
            System.out.println("You can vote");
        }
        else {
            System.out.println("Your not elible to vote ");
        }
    }

}
