package DesignPatterns.Factory.Database;

public interface Database {
    void getVersion();
//
//    Query createQuery();
//    Transaction createTransaction();
//    Updater createUpdater();

    DatabaseFactory createDatabaseFactory();
}
