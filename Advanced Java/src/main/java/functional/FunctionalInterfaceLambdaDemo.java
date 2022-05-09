package functional;

import misc.GreetingMsg;
import misc.MsgPrinter;

public class FunctionalInterfaceLambdaDemo {

    public static void main(String[] args) {
        GreetingMsg greetingMsg = new GreetingMsg() {
            //Anonymous inner class
            @Override
            public void greet(String name) {
                System.out.println("Hello "+ name);
            }
        };
        greetingMsg.greet("Dinura");

        greetingMsg = (String name) -> {System.out.println("Hello "+ name);};
        greetingMsg.greet("Dinura");

        greetingMsg = (name) -> {System.out.println("Hello "+ name);};
        greetingMsg.greet("Dinura");


        MsgPrinter msgPrinter = () -> {
            System.out.println("This is a message");
        };
        msgPrinter.printMsg();

    }
}
