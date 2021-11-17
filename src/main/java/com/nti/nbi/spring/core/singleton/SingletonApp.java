package com.nti.nbi.spring.core.singleton;

public class SingletonApp {
    public static void main(String[] args) {
        DbConnection c1 = DbConnection.connect();
        DbConnection c2 = DbConnection.connect();
        System.out.println(c1 == c2);
    }
}
