package com.example.demo.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Categorie")
public class Categorie {
  
  private Long  idCateg;
	private String codeCateg;
	private String libelleCateg;
	private Set<Produit> produits;

	public Categorie() {
	}

	public Categorie(Long  idCateg) {
		this.idCateg = idCateg;
	}

	public Categorie(Long  idCateg, String codeCateg, String libelleCateg, Set<Produit> produits) {
		this.idCateg = idCateg;
		this.codeCateg = codeCateg;
		this.libelleCateg = libelleCateg;
		this.produits = produits;
	}

	@Id

	@Column(name = "ID_CATEG")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="CATEGORIE_gen_seq")
    @SequenceGenerator(name="CATEGORIE_gen_seq", sequenceName="CATEGORIE_SEQ", allocationSize=1)

	public Long  getIdCateg() {
		return this.idCateg;
	}

	public void setIdCateg(Long  idCateg) {
		this.idCateg = idCateg;
	}

	@Column(name = "CODE_CATEG", length = 10)
	public String getCodeCateg() {
		return this.codeCateg;
	}

	public void setCodeCateg(String codeCateg) {
		this.codeCateg = codeCateg;
	}

	@Column(name = "LIBELLE_CATEG", length = 50)
	public String getLibelleCateg() {
		return this.libelleCateg;
	}

	public void setLibelleCateg(String libelleCateg) {
		this.libelleCateg = libelleCateg;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categorie", orphanRemoval = true)
	public Set<Produit> getProduits() {
		return this.produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

}
