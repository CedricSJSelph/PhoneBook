package com.dtcc.projects;

import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class PhoneBookTest extends PhoneBook{

    @Test
    public void addTest(){
        add("Cedric", "3023007497");
        add("Emergency","911");

        Assert.assertEquals("3023007497", PhoneBook.get("Cedric"));
        Assert.assertEquals("911", PhoneBook.get("Emergency"));
    }

    @Test
    public void addAllTest(){
        String[] temp = {"911", "3023007497"};
        addAll("Cedric", temp);
        Assert.assertEquals("3023007497", PhoneBook.get("Cedric"));
    }

    @Test
    public void removeTest(){
        add("Cedric", "3023007497");
        add("Emergency","911");
        remove("Emergency");
        Assert.assertEquals(false, PhoneBook.containsKey("Emergency"));
        Assert.assertEquals(true, PhoneBook.containsKey("Cedric"));
    }

    @Test
    public void hasEntryTest(){
        add("Cedric", "3023007497");
        Assert.assertEquals(true, hasEntry("Cedric"));
    }

    @Test
    public void lookupTest(){
        add("Cedric", "3023007497");
        List<String> temp = lookup("Cedric");
        Assert.assertEquals("3023007497", temp.get(0));
    }

    @Test
    public void getAllContactNamesTest(){
        
    }
}
