package com.nti.nbi.spring.core.singleton;

public class DbConnection {
    private static DbConnection connection;
    public static DbConnection connect(){
        if(connection == null){
            connection = new DbConnection();
        }
        return connection;
    }
    private DbConnection(){
        System.out.println("Creating connection");
    }
}
