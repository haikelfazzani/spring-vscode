package com.example.demo.model;

public class Client {

  private Long idClient;
  private String loginClient;
  private String motPasseClient;
  private String nomClient;
  private String prenomClient;
  private String civiliteClient;
  private String dateNaissanceClient;
  private String numeroAdrClient;
  private String rueAdrClient;
  private String communeAdrClient;
  private String villeAdrClient;
  private String cpAdrClient;
  private String telClient;
  private String faxClient;
  private String gsmClient;
  private String emailClient;

  public Client() {

  }

  public Client(String loginClient, String motPasseClient, String nomClient, String prenomClient, String civiliteClient, String dateNaissanceClient, String numeroAdrClient, String rueAdrClient, String communeAdrClient, String villeAdrClient, String cpAdrClient, String telClient, String faxClient, String gsmClient, String emailClient) {
    this.loginClient = loginClient;
    this.motPasseClient = motPasseClient;
    this.nomClient = nomClient;
    this.prenomClient = prenomClient;
    this.civiliteClient = civiliteClient;
    this.dateNaissanceClient = dateNaissanceClient;
    this.numeroAdrClient = numeroAdrClient;
    this.rueAdrClient = rueAdrClient;
    this.communeAdrClient = communeAdrClient;
    this.villeAdrClient = villeAdrClient;
    this.cpAdrClient = cpAdrClient;
    this.telClient = telClient;
    this.faxClient = faxClient;
    this.gsmClient = gsmClient;
    this.emailClient = emailClient;
  }

  public Long getIdClient() {
    return this.idClient;
  }

  public void setIdClient(Long idClient) {
    this.idClient = idClient;
  }

  public String getLoginClient() {
    return this.loginClient;
  }

  public void setLoginClient(String loginClient) {
    this.loginClient = loginClient;
  }

  public String getMotPasseClient() {
    return this.motPasseClient;
  }

  public void setMotPasseClient(String motPasseClient) {
    this.motPasseClient = motPasseClient;
  }

  public String getNomClient() {
    return this.nomClient;
  }

  public void setNomClient(String nomClient) {
    this.nomClient = nomClient;
  }

  public String getPrenomClient() {
    return this.prenomClient;
  }

  public void setPrenomClient(String prenomClient) {
    this.prenomClient = prenomClient;
  }

  public String getCiviliteClient() {
    return this.civiliteClient;
  }

  public void setCiviliteClient(String civiliteClient) {
    this.civiliteClient = civiliteClient;
  }

  public String getDateNaissanceClient() {
    return this.dateNaissanceClient;
  }

  public void setDateNaissanceClient(String dateNaissanceClient) {
    this.dateNaissanceClient = dateNaissanceClient;
  }

  public String getNumeroAdrClient() {
    return this.numeroAdrClient;
  }

  public void setNumeroAdrClient(String numeroAdrClient) {
    this.numeroAdrClient = numeroAdrClient;
  }

  public String getRueAdrClient() {
    return this.rueAdrClient;
  }

  public void setRueAdrClient(String rueAdrClient) {
    this.rueAdrClient = rueAdrClient;
  }

  public String getCommuneAdrClient() {
    return this.communeAdrClient;
  }

  public void setCommuneAdrClient(String communeAdrClient) {
    this.communeAdrClient = communeAdrClient;
  }

  public String getVilleAdrClient() {
    return this.villeAdrClient;
  }

  public void setVilleAdrClient(String villeAdrClient) {
    this.villeAdrClient = villeAdrClient;
  }

  public String getCpAdrClient() {
    return this.cpAdrClient;
  }

  public void setCpAdrClient(String cpAdrClient) {
    this.cpAdrClient = cpAdrClient;
  }

  public String getTelClient() {
    return this.telClient;
  }

  public void setTelClient(String telClient) {
    this.telClient = telClient;
  }

  public String getFaxClient() {
    return this.faxClient;
  }

  public void setFaxClient(String faxClient) {
    this.faxClient = faxClient;
  }

  public String getGsmClient() {
    return this.gsmClient;
  }

  public void setGsmClient(String gsmClient) {
    this.gsmClient = gsmClient;
  }

  public String getEmailClient() {
    return this.emailClient;
  }

  public void setEmailClient(String emailClient) {
    this.emailClient = emailClient;
  }
}