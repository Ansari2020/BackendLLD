package DesignPatterns.Factory.Database;

public class PostgreSQL implements Database{

    @Override
    public void getVersion() {

    }

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MongoDBFactory();
    }
}
