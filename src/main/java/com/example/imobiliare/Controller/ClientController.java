package com.example.imobiliare.Controller;

import com.example.imobiliare.Entity.Apartament;
import com.example.imobiliare.Entity.Client;
import com.example.imobiliare.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/client")
    public List<Client> getClients() {
        return clientService.getClients();
    }
    @GetMapping("/client/{id}")
    public Client getClientById(@PathVariable Integer id) {
        return clientService.getClientById(id);
    }
    @PostMapping("/client")
    public Client createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }
    @PutMapping("/client")
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }
    @DeleteMapping("/client/{id}")
    public Client deleteClient(@PathVariable Integer id) {
        return clientService.deleteClient(id);
    }
    @GetMapping("/client/{id}/apartamente")
    public List<Apartament> getApartamenteInBuget(@PathVariable Integer id) {
        return clientService.getApartamenteInBuget(id);
    }
}
