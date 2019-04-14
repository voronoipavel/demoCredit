package Credit.KG.demoCredit.controller;

import Credit.KG.demoCredit.entity.Client;
import Credit.KG.demoCredit.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ClientController.URLCOUNTRY)
public class ClientController {
    public static final String URLCOUNTRY = "/credit.kg/registration";

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getClient(){
        return clientService.findAllClient();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id){
        return clientService.findClientById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client registrationClient(@RequestBody Client client){
        return clientService.getClientByRegistration(client);
    }


}

