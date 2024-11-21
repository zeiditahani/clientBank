package tn.isetmd.Ecommerce.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.isetmd.Ecommerce.dao.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
