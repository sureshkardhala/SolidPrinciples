package org.example.OpenorClosePrinciple;

/*
    Open / Closed principle is defined as "Open for extension and Closed for modification".

    All the objects, entities, class are extendable but without changing contents of extendable class.

    Eg: If our application is saving data into database.
    We got new feature to download the data which we are saving into database.

    Approach : we add new method in same class, but it may lead to bugs.

    Solution : We have to create interface common for old and new feature.
    And new feature can implement in another class.
    Both new and old feature can be implements parent interface.
*/
public class OpenClosedPrinciple {
    public static void main(String[] args) {

    }
}
