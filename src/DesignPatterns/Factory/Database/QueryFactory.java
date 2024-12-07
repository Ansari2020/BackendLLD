package DesignPatterns.Factory.Database;

import DesignPatterns.Factory.Database.Querys.NoSqlQuery;
import DesignPatterns.Factory.Database.Querys.Query;
import DesignPatterns.Factory.Database.Querys.SqlQuery;

public class QueryFactory {

    public static Query getQueryByDatabase(Database database){
        Query q = null;
        if(database instanceof MySQL){
            q=new SqlQuery();

        }
        else if(database instanceof MongoDB){
            q=new NoSqlQuery();
        }
        return q;
    }
}
