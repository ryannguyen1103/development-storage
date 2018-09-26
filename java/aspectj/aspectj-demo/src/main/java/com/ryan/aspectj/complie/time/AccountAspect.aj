import com.ryan.aspectj.complie.time.Account;

public aspect AccountAspect {
    final int MIN_BALANCE = 10;
 
    pointcut callWithDraw(int amount, Account acc) : 
     call(boolean Account.withdraw(int)) && args(amount) && target(acc);
 
    before(int amount, Account acc) : callWithDraw(amount, acc) {
    }
 
    boolean around(int amount, Account acc) : 
      callWithDraw(amount, acc) {
        System.out.println("AccountAspect::around -- Calling withdrawal: amount = " + amount);
        if (acc.balance < amount) {
            System.out.println("Insufficient balance! balance = " + acc.balance + ", amount = " + amount);
            return false;
        }
        return proceed(amount, acc);
    }
 
    after(int amount, Account balance) : callWithDraw(amount, balance) {
    }
}