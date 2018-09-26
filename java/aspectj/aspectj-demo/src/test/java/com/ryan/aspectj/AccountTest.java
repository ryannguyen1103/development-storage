package com.ryan.aspectj;

import com.ryan.aspectj.complie.time.Account;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



/**
 *
 * @author ryan.nguyen
 */
public class AccountTest {

    private Account account;

    @Before
    public void before() {
        account = new Account();
    }

    @Test
    public void given20AndMin10_whenWithdraw5_thenSuccess() {
        assertTrue(account.withdraw(5));
    }

    @Test
    public void given20AndMin10_whenWithdraw100_thenFail() {
        assertFalse(account.withdraw(100));
    }
}
