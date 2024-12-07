package DesignPatterns.Factory.Database;

public class MySQL implements  Database{

    @Override
    public void getVersion() {

    }

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MongoDBFactory();
    }
}
