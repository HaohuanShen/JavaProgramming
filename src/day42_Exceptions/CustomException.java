package day42_Exceptions;

class FadyException extends RuntimeException{

    public FadyException(){
        System.out.println("Time ofr a short break");
    }
public FadyException(String message){
    super(message);
}
}

class NoBreakException extends Exception{

}

public class CustomException {

    public static void main(String[] args) {

        //throw new FadyException("It's time for lunch break");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }

    }
}
