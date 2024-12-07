package DesignPatterns.Factory.Database;

import DesignPatterns.Factory.Database.Querys.Query;
import DesignPatterns.Factory.Database.Transactions.Transaction;
import DesignPatterns.Factory.Database.Updaters.Updater;


public class UserService {
    private Database database;

    public UserService(Database database) {
        this.database = database;

    }

    public void createUser(User user){
        // v1
        Query q=QueryFactory.getQueryByDatabase(database);

 //    this will be done by many files so itr is poor things it is v0.;
//        if(database instanceof MySQL){
//            q=new SqlQuery();
//
//        }
//        else if(database instanceof MongoDB){
//            q=new NoSqlQuery();
//        }
    }

    public void updateUser(User user){
        //abstarct factory
        DatabaseFactory databaseFactory=database.createDatabaseFactory();
        Query q=databaseFactory.createQuery();
        Transaction t=databaseFactory.createTransaction();
        Updater u=databaseFactory.createUpdater();
    }
}
