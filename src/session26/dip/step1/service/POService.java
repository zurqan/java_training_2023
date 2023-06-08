package session26.dip.step1.service;

import session26.dip.step1.data.PO;
import session26.dip.step1.repo.MysqlPORDS;

public class POService {

    private final MysqlPORDS mysqlPORDS;

    public POService(MysqlPORDS mysqlPORDS) {
        this.mysqlPORDS = mysqlPORDS;
    }

    public void submit(PO po){

        //valiadtion

        //rule

        //save PO
        mysqlPORDS.save(po);
    }
}
