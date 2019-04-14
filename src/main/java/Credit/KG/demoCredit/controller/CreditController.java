package Credit.KG.demoCredit.controller;

import Credit.KG.demoCredit.entity.Client;
import Credit.KG.demoCredit.entity.Credit;
import Credit.KG.demoCredit.model.CreditRequest;
import Credit.KG.demoCredit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CreditController.URLCOUNTRY)
public class CreditController {
    public static final String URLCOUNTRY = "/credit.kg/credit";

    @Autowired
    private CreditService creditService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Credit addPayment(@RequestBody CreditRequest creditRequest){

        return creditService.issuanceOfCredit(creditRequest);
    }




}

