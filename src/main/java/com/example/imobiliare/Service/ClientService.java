package com.example.imobiliare.Service;

import com.example.imobiliare.Entity.Apartament;
import com.example.imobiliare.Entity.Client;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ClientService {
    public List<Client> getClients();
    public Client getClientById(Integer id);
    public Client createClient(Client client);
    public Client updateClient(Client client);
    public Client deleteClient(Integer id);
    List<Apartament>    getApartamenteInBuget(Integer clientId);
}
