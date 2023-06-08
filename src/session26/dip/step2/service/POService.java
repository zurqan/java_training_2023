package session26.dip.step2.service;


import session26.dip.step2.data.PO;

public class POService {

    private  PORepo poRepo;

//    public void init(){
//        poRepo = new MysqlPORDS();
//    }
    public POService(PORepo poRepo) {
        this.poRepo = poRepo;
    }

    public void submit(PO po){

        //valiadtion

        //rule

        //save PO
        poRepo.save(po);
    }
}
