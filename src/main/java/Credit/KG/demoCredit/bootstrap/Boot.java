package Credit.KG.demoCredit.bootstrap;

import Credit.KG.demoCredit.entity.Client;
import Credit.KG.demoCredit.entity.Credit;
import Credit.KG.demoCredit.service.ClientService;
import Credit.KG.demoCredit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Boot implements CommandLineRunner {

    @Autowired
    private ClientService clientService;

    @Autowired
    private CreditService creditService;


    @Override
    public  void run(String...args) throws Exception{
        Client client1= new Client("aida", "123", "10508199205498","Tynybekova Aida");
        Client client2= new Client("pav", "qwerty", "20409198601562","Voronoi Pavel");
        //Credit credit1 = new Credit(client1,BigDecimal.valueOf(10000),12,10);
        //Credit credit2 = new Credit(client2,BigDecimal.valueOf(800000),36,12);
        clientService.getClientByRegistration(client1);
        clientService.getClientByRegistration(client2);
//        creditService.IssuanceOfCredit(credit1);
//        creditService.IssuanceOfCredit(credit2);


    }
}

