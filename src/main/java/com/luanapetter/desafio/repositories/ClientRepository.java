package com.luanapetter.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luanapetter.desafio.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	

}
