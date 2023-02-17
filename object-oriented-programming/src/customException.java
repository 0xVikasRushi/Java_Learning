class customExcep extends Exception{
    customExcep(String _str ){
        super(_str);
    }
}


public class customException {

    public static void checkAge(int age ) throws customExcep{
        if(age<18){
            throw new customExcep("age not enough");
        }else{
            System.out.println("you can vote");
        }
    }

    public static void main(String[] args) {
      try{
        checkAge(12);
      }catch (customExcep e ){
          System.out.println(e);
      }
    }
}
