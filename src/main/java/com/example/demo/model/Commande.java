package com.example.demo.model;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="commande")
public class Commande {
  
  private Long idCommande;
	private Client client;
	private Produit produit;
	private Long qteCommande;
	private Date dateCommande;
	private Long etatCommande;

	public Commande() {
	}

	public Commande(Long idCommande, Client client, Produit produit) {
		this.idCommande = idCommande;
		this.client = client;
		this.produit = produit;
	}

	public Commande(Long idCommande, Client client, Produit produit, Long qteCommande, Date dateCommande,
			Long etatCommande) {
		this.idCommande = idCommande;
		this.client = client;
		this.produit = produit;
		this.qteCommande = qteCommande;
		this.dateCommande = dateCommande;
		this.etatCommande = etatCommande;
	}
	
	@Id
	@Column(name = "ID_COMMANDE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="COMMANDE_gen_seq")
    @SequenceGenerator(name="COMMANDE_gen_seq", sequenceName="COMMANDE_SEQ", allocationSize=1)

	public Long getIdCommande() {
		return this.idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CLIENT", nullable = false)
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PRODUIT",  nullable = false)
	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@Column(name = "QTE_COMMANDE", precision = 22, scale = 0)
	public Long getQteCommande() {
		return this.qteCommande;
	}

	public void setQteCommande(Long qteCommande) {
		this.qteCommande = qteCommande;
	}

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Column(name = "DATE_COMMANDE", length = 10)
	public Date getDateCommande() {
		return this.dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	@Column(name = "ETAT_COMMANDE", precision = 22, scale = 0)
	public Long getEtatCommande() {
		return this.etatCommande;
	}

	public void setEtatCommande(Long etatCommande) {
		this.etatCommande = etatCommande;
	}
}
