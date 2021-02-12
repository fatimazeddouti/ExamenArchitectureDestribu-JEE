package org.sid.compteoperationservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.sid.compteoperationservice.model.Client;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private Double solde;
    private Date dateCreation;
    private String type;
    private String etat;
    @OneToMany(mappedBy = "compte")
    private Collection<Operation> operations;
    private Long ClientID;
    @Transient
    private Client client;
}
