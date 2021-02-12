package org.sid.compteoperationservice.openfeign;

import org.sid.compteoperationservice.entities.Compte;
import org.sid.compteoperationservice.entities.Operation;
import org.sid.compteoperationservice.model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;


@FeignClient(name = "CLIENT-SERVICE")
public interface ClientRestClient {

    @GetMapping(path="/clients/{code}")
    Client getClientById(@PathVariable(name = "code") Long code);
    @PostMapping (path="/insertCompte")
     void InsertCompte(@RequestBody Compte compte);
    @PostMapping (path="/versement")
     void versement(@RequestBody Double montant);
    @PostMapping (path="/retrait")
    void retrait(@RequestBody Double montant);
    @PostMapping (path="/virement")
    void retrait(@RequestBody Compte compte, Double montant);
    @GetMapping(path="/comptes/{code}")
    Collection<Operation> ConsulterOperation(@PathVariable(name = "code") Long code);
    @GetMapping(path="/comptes/{code}")
    Client ConsulterCompteClient(@PathVariable(name = "code") Long code);
}
