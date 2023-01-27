package com.example.imobiliare.Service;

import com.example.imobiliare.Dto.ApartamentConfiguration;
import com.example.imobiliare.Entity.Apartament;
import com.example.imobiliare.Entity.Client;
import com.example.imobiliare.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ApartamentService apartamentService;

    @Override
    public List<Client> getClients() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public Client getClientById(Integer id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client deleteClient(Integer id) {
        Client client = clientRepository.findById(id).orElse(null);
        if(client != null) {
            clientRepository.delete(client);
        }
        return client;
    }

    @Override
    public List<Apartament> getApartamenteInBuget(Integer clientId) {
        Client client = clientRepository.findById(clientId).orElse(null);
        if(client != null) {
            ApartamentConfiguration apartamentConfiguration = new ApartamentConfiguration();
            apartamentConfiguration.setEndPret(client.getBani());
            return apartamentService.filterApartament(apartamentConfiguration);
        }
        return Collections.emptyList();
    }
}
