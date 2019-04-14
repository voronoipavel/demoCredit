package Credit.KG.demoCredit.service;

import Credit.KG.demoCredit.entity.Credit;
import Credit.KG.demoCredit.model.CreditRequest;

import java.util.List;

public interface CreditService {
    //List<Credit> findAllCredit();
    //Credit saveCredit(Credit credit);
    Credit issuanceOfCredit(CreditRequest credit);


}
