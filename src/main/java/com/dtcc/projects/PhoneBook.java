package com.dtcc.projects;

import java.util.*;

public class PhoneBook {

        //Phone number no hyphens please
        public Map<String, List<String> > PhoneBook;

        public PhoneBook(){
            this(new LinkedHashMap<String, List<String>>());
        }

        public PhoneBook(Map<String, List<String>> map){
            this.PhoneBook = map;
        }

        public void add(String name, String phoneNumber){
            List<String> phoneNumberList = PhoneBook.get(name);
            if(phoneNumberList != null){
                phoneNumberList.add(phoneNumber);
            }else{
                //Singleton -> adds the phone number to names List of numbers
                //Doing multiple things at once
                PhoneBook.put(name, Collections.singletonList(phoneNumber));
            }
        }

        public void addAll(String name, String[] phoneNumbers){
            PhoneBook.put(name, Arrays.asList(phoneNumbers));
        }

        public void remove(String name){
            PhoneBook.remove(name);
        }

        public boolean hasEntry(String name){
           return PhoneBook.containsKey(name);
        }

        public List<String> lookup(String name){
            return PhoneBook.get(name);
        }

        public String reverseLookup(String phoneNumber){
            String tempString ="";
            for(Map.Entry m: PhoneBook.entrySet()){
                if((m.getValue().equals(Arrays.asList(phoneNumber)))){
                    tempString += (String)m.getKey();
                }
            }
            return tempString;
        }

        public List<String> getAllContactNames(){
            List<String> temp = new ArrayList<>();
            //Entries, each entry
            for(Map.Entry m: PhoneBook.entrySet()){
                temp.add((String)m.getKey());
            }
            return temp;
        }
    }

