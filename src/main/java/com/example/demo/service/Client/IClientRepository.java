package com.example.demo.service.Client;

import java.util.Set;

import com.example.demo.model.Client;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface IClientRepository extends Repository<Client , Long> {
  
  Client findByIdClient(Long idClient);

  Client save(Client client);

  @Modifying
	@Query("update Client u set u.idClient = ?1")
	int updateClient(Long idClient);

  Set<Client> findAll();
}
