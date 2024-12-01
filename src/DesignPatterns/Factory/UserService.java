package DesignPatterns.Factory;

import DesignPatterns.Factory.Querys.NoSqlQuery;
import DesignPatterns.Factory.Querys.Query;
import DesignPatterns.Factory.Querys.SqlQuery;


public class UserService {
    private Database database;

    public UserService(Database database) {
        this.database = database;

    }

//    this will be done by many files so itr is poor things it is v0.;
    public void createUser(User user){
        Query q=null;
        if(database instanceof MySQL){
            q=new SqlQuery();

        }
        else if(database instanceof MongoDB){
            q=new NoSqlQuery();
        }
    }
}
