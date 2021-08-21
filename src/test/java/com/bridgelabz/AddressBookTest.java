package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {
    @Test
    public void given_FirstName_ShouldeReturn_True() {

        try{
            AddressBookMain addressBookMain = new AddressBookMain();
            boolean result = addressBookMain.equals("Omkar");
            Assert.assertTrue(result);
        }
        catch (AddressBookException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
