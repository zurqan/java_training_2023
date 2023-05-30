package session26.dm.step1.app;

import session26.dm.step1.repo.MysqlRDS;

public class Service {

    private final MysqlRDS mysqlRDS ;

    public Service(MysqlRDS mysqlRDS) {
        this.mysqlRDS = mysqlRDS;
    }

    public void doOperation(){
        //some work
        mysqlRDS.save("data");
    }
}
