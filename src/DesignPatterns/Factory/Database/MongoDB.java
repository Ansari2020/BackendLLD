package DesignPatterns.Factory.Database;

public class MongoDB implements Database{


    @Override
    public void getVersion() {

    }

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MongoDBFactory();
    }
}
