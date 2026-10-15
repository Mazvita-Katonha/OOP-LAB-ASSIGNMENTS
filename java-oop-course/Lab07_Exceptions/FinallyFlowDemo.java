package Lab07_Exceptions;


public class FinallyFlowDemo {

    public static int testFlow() {
        try {
            System.out.println("1. Inside the try block.");
            return 100; // A return statement is encountered here!
        } finally {
            // Will this run even though we already hit a return statement?
            System.out.println("2. Inside the finally block.");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Lab 7 Challenge: Try vs Finally Return Flow ---");
        
        int result = testFlow();
        
        System.out.println("3. Back in main method. Value returned: " + result);
    }
}


