package fr.celine.javaweb.controller;

import java.util.HashMap;
import java.util.Map;

public class MockDataDao {

    private final Map<String, Account> mapUsers = new HashMap<String,Account>();

    public MockDataDao() {
        Account account1= new Account("toto", "pierre");
        Account account2 = new Account("cuicui", "paul");
        mapUsers.put(account1.getNom(), account1);
        mapUsers.put(account2.getNom(),account2);
    }

    public Account findUser(String nom) {
        // Find a User by nom
          return mapUsers.get(nom);

        }


    }

