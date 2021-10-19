package com.example.Backend_SaldoYa.Repositorio;
import com.example.Backend_SaldoYa.Modelo.ClienteModelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends CrudRepository<ClienteModelo,Long>{
    
}