package Credit.KG.demoCredit.service;

import Credit.KG.demoCredit.entity.Client;
import Credit.KG.demoCredit.entity.Credit;
import Credit.KG.demoCredit.model.CreditRequest;
import Credit.KG.demoCredit.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class CreditServiceImpl implements CreditService {
    @Autowired
    private CreditRepository creditRepository;

    @Autowired
    private ClientService clientService;

    @Override
    public Credit issuanceOfCredit(CreditRequest c) {
        Client client = clientService.getClientByAuthorization(c.getLogin(), c.getPassword());

        if (client != null && BigDecimal.valueOf(5000).compareTo(c.getSum()) >= 0) {
            Credit credit = new Credit(client, c.getSum(), c.getPercentRate(), c.getTerm(),
                    c.getSum().multiply(new BigDecimal(c.getPercentRate()/100.0)),LocalDateTime.now(), c.getDateCredit().plusMonths(1));

            return creditRepository.save(credit);
        }
        return null;
    }
}
