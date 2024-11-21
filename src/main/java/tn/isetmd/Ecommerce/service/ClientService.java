package tn.isetmd.Ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isetmd.Ecommerce.dao.entities.Client;
import tn.isetmd.Ecommerce.dao.repositories.ClientRepository;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository ;
    public void updateClient (Long id, String nom) {
        Client c = clientRepository.findById(id).get();
        c.setNom(nom);
        clientRepository.save(c);
    }
}
