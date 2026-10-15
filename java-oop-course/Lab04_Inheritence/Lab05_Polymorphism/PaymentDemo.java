package Lab04_Inheritence.Lab05_Polymorphism;

public class PaymentDemo {
  

// --- APPROACH 1: Using instanceof (Harder to maintain and scale) ---
class Payment {}
class CardPayment extends Payment { 
    void swipe() { System.out.println("Card swiped securely."); } 
}
class MobileMoneyPayment extends Payment { 
    void dialEcoCash() { System.out.println("EcoCash USSD prompt sent."); } 
}

class NaivePaymentProcessor {
    void pay(Payment p) {
        // Java 16+ Pattern Matching: checks the type and casts it automatically
        if (p instanceof CardPayment card) {
            card.swipe();
        } else if (p instanceof MobileMoneyPayment mobile) {
            mobile.dialEcoCash();
        }
        // CRITIQUE: If you add a new payment type (like Bitcoin), you must change this code!
    }
}

// --- APPROACH 2: Pure Polymorphism (Clean, scalable, and follows SOLID principles) ---
interface Transaction {
    void process();
}

class PolishedCardPayment implements Transaction {
    @Override
    public void process() { 
        System.out.println("Processing secure credit card transaction..."); 
    }
}

class PolishedMobilePayment implements Transaction {
    @Override
    public void process() { 
        System.out.println("Processing mobile wallet payment dialer..."); 
    }
}

class SmartPaymentProcessor {
    // This method NEVER changes, no matter how many payment options you add down the road!
    void pay(Transaction t) {
        t.process(); // Pure polymorphic call
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        System.out.println("--- Approach 1: Conditional Checking (instanceof) ---");
        NaivePaymentProcessor naiveProcessor = new NaivePaymentProcessor();
        naiveProcessor.pay(new CardPayment());
        naiveProcessor.pay(new MobileMoneyPayment());

        System.out.println("\n--- Approach 2: Pure Polymorphism Contract ---");
        SmartPaymentProcessor smartProcessor = new SmartPaymentProcessor();
        smartProcessor.pay(new PolishedCardPayment());
        smartProcessor.pay(new PolishedMobilePayment());
    }
}

}
