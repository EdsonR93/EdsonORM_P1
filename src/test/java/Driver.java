import Models.Car;
import Models.User;
import ORM.CRUD.QueryCreation.Delete;
import ORM.CRUD.QueryCreation.QueryBuilder;
import ORM.CRUD.QueryCreation.Select;
import ORM.CRUD.QueryCreation.Update;

public class Driver {

    public static void main(String[] args) throws Exception {
        User user = new User(2,false,"username","pass","name","lastname");
//        Insert ins = new Insert(user);
//
//        System.out.println(ins.buildInsertQuery());



        Select sel = new Select();
        Delete del = new Delete();
        Update upd = new Update(user);
        QueryBuilder qb = new QueryBuilder(user);
//        System.out.println(qb.buildInsertQuery());
//        System.out.println(qb.buildSelectStatement());
//        System.out.println(upd.buildUpdateQuery());

//      will give a NoWhereClauseFoundException because we haven't specify a where clause
//      preventing us from deleting everything
//        System.out.println(qb.buildUpdateQuery());
//        System.out.println(qb.buildDeleteQuery());


//        sel.setColumn("*");
//        sel.setTableName("users");
//        System.out.println(sel.buildSelectStatement());
//
        sel.setColumns("1","2","3","4");
        sel.setColumn("5");
        sel.setTableName("user");
        sel.setWhereClause("col1 = 'sds'").and().setWhereClause("2 = '2323'");
        System.out.println(sel.buildSelectStatement());
//
//
//        ins.setTableName("cars");
//        ins.setColumns("col1","col2","col3");
//        ins.setValues("val1","val2","val3");
//        System.out.println(ins.buildInsertQuery());
//
//
//        del.setTableName("Cars").setWhereClause("Col1 = '1'").or().setWhereClause(" col2 = '1'");
//        System.out.println(del.buildDeleteQuery());
//
//        upd.setTableName("Cars");
//        upd.setValue("col1 = 'd'");
//        upd.setWhereClause("col2 = '8'");
//        System.out.println(upd.buildUpdateQuery());


    }


}
