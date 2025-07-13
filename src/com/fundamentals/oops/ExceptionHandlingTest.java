package com.fundamentals.oops;

public class ExceptionHandlingTest {
    public static void main(String[] args) {
        Balance balance = new Balance();

        //1. Deposit 200
        balance.deposit(200);
        //2. It doesn't force to handle and it should not be handled as it is business logic failure
//        balance.deposit(-300);
        //3. this will force us to handle since it is checked exception
        try {
            balance.withdraw(1400);
        } catch (InsufficientBalanceException e) {
//            throw new RuntimeException(e);
            System.out.println("Show Message: "+e.getMessage());
        }

        // RULE: How to choose between Exception and RuntimeException for our Custom Exception
//        Is the caller expected to recover from this exception?
//        If yes > Exception
//        If No > RuntimeException
    }
}

class Balance{
    private int balance = 1000;

    public void deposit(int amount){
        if(amount <= 0){
           throw new InvalidAmountException("Amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited: "+amount);
        System.out.println("Total amount after deposit: "+balance);
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdrawn: "+amount);
        System.out.println("Total amount after withdraw: "+balance);
    }
}

class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(String s) {
        super(s);
    }
}

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String s) {
        super(s);
    }
}
