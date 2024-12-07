package DesignPatterns.Factory.Database;

import DesignPatterns.Factory.Database.Querys.Query;
import DesignPatterns.Factory.Database.Transactions.Transaction;
import DesignPatterns.Factory.Database.Updaters.Updater;

public class PostgreDBFactory implements DatabaseFactory{
    @Override
    public void getVersion() {

    }

    @Override
    public Query createQuery() {
        return null;
    }

    @Override
    public Transaction createTransaction() {
        return null;
    }

    @Override
    public Updater createUpdater() {
        return null;
    }
}
