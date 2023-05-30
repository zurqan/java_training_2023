package session26.dm.step2.app;

import session26.dm.step1.repo.MysqlRDS;

public class Service {

    private final PORepo repo ;

    public Service(PORepo repo) {
        this.repo = repo;
    }

    public void doOperation(){
        //some work
        repo.save("data");
    }
}
