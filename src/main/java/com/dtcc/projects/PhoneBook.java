package com.dtcc.projects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

        //Phone number no hyphens please
        public static HashMap<String, String> PhoneBook = new HashMap<>();
        private static String Name;
        private static String PhoneNumber;

        public void add(String name, String phoneNumber){
            PhoneBook.put(name, phoneNumber);
        }

        public static void addAll(String name, String[] phoneNumbers){
            for(String temp:phoneNumbers){
                PhoneBook.put(name, temp);
            }
        }

        public static void remove(String name){
            PhoneBook.remove(name);
        }

        public static boolean hasEntry(String name){
           return PhoneBook.containsKey(name);
        }

        public List<String> lookup(String name){
            List<String> temp = new ArrayList<>();
            for(String val: PhoneBook.keySet()){
                if(val.equals(name)){
                    temp.add(PhoneBook.get(val));
                }
            }
            return temp;
        }

//        public String reverseLookup(String phoneNumber){
//            return PhoneBook.keys(phoneNumber)
//        }

        public static String getAllContactNames(){
            String temp = "";
            //Entries, each entry
            for(Map.Entry m: PhoneBook.entrySet()){
                String key = (String) m.getKey();
                String value = (String) m.getValue();
                temp += (key + " -> " + value + "\n");
            }
            return temp;
        }
    }

