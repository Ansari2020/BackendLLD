package DesignPatterns.Factory.Database;

import DesignPatterns.Factory.Database.Querys.Query;
import DesignPatterns.Factory.Database.Transactions.Transaction;
import DesignPatterns.Factory.Database.Updaters.Updater;

public interface DatabaseFactory {
    void getVersion();

    Query createQuery();
    Transaction createTransaction();
    Updater createUpdater();
}
