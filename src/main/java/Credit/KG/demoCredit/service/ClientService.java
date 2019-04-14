package Credit.KG.demoCredit.service;

import Credit.KG.demoCredit.entity.Client;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface ClientService {
    List<Client> findAllClient();

    Client findClientById(Long id);

    Client getClientByRegistration(Client client);

    Client getClientByAuthorization(String login, String password);

}
