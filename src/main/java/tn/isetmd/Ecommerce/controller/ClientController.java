package tn.isetmd.Ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isetmd.Ecommerce.dao.entities.Client;
import tn.isetmd.Ecommerce.dao.repositories.ClientRepository;
import tn.isetmd.Ecommerce.service.ClientService;

import java.util.List;

@RestController
@CrossOrigin
public class ClientController {
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    ClientService clientService;

    @GetMapping(path = "/clients")
    public List<Client> getClients(){return clientRepository.findAll();}

    @PostMapping( path = "/client")
    public void saveClient(@RequestBody Client client){clientRepository.save(client);}

    @PutMapping(path = "/client/{id}")
    public void updateClient(@PathVariable Long id,@RequestParam String nom){clientService.updateClient(id,nom);}

    @DeleteMapping(path = "/client/{id}")
    public void deleteClient(@PathVariable Long id){clientRepository.deleteById(id);}



}
