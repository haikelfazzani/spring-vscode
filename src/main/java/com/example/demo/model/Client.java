package com.example.demo.model;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="client")
public class Client {

  private Long idClient;
  private String loginClient;
  private String motPasseClient;
  private String nomClient;
  private String prenomClient;
  private Set<Commande> commandes;

  public Client() {

  }

  public Client(Long idClient, String loginClient, String motPasseClient, String nomClient, String prenomClient, Set<Commande> commandes) {
    this.idClient = idClient;
    this.loginClient = loginClient;
    this.motPasseClient = motPasseClient;
    this.nomClient = nomClient;
    this.prenomClient = prenomClient;
    this.commandes = commandes;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLIENT_gen_seq")
  @SequenceGenerator(name="CLIENT_gen_seq", sequenceName="CLIENT_SEQ", allocationSize=1)
  public Long getIdClient() {
    return this.idClient;
  }

  public void setIdClient(Long idClient) {
    this.idClient = idClient;
  }

  @Column(name = "LOGIN_CLIENT", length = 20)
  public String getLoginClient() {
    return this.loginClient;
  }

  public void setLoginClient(String loginClient) {
    this.loginClient = loginClient;
  }

  @Column(name = "MOT_PASSE_CLIENT", length = 20)
  public String getMotPasseClient() {
    return this.motPasseClient;
  }

  public void setMotPasseClient(String motPasseClient) {
    this.motPasseClient = motPasseClient;
  }

  @Column(name = "NOM_CLIENT", length = 20)
  public String getNomClient() {
    return this.nomClient;
  }

  public void setNomClient(String nomClient) {
    this.nomClient = nomClient;
  }

  public String getPrenomClient() {
    return this.prenomClient;
  }

  @Column(name = "PRENOM_CLIENT", length = 20)
  public void setPrenomClient(String prenomClient) {
    this.prenomClient = prenomClient;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
  public Set<Commande> getCommandes() {
    return this.commandes;
  }

  public void setCommandes(Set<Commande> commandes) {
    this.commandes = commandes;
  }
 
}