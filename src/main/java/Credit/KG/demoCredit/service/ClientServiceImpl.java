package Credit.KG.demoCredit.service;

import Credit.KG.demoCredit.entity.Client;
import Credit.KG.demoCredit.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientService clientService;

    @Override
    public List<Client> findAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client findClientById(Long id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public Client getClientByAuthorization(String login, String password) {
        return clientRepository.getClientByAuthorization(login, password);
    }

    @Override
    public Client getClientByRegistration(Client c) {
        return clientRepository.save(c);
    }
}
