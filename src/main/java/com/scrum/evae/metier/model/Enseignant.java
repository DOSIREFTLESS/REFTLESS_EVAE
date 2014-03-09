package com.scrum.evae.metier.model;

	
	import java.io.Serializable;
	
	
	public class Enseignant implements Serializable {
	    private static final long serialVersionUID = 1L;
	    
	    
	    private int noEnseignant;
	    
	    private String type;
	    
	    private String sexe;
	    
	    private String nom;
	    
	    private String prenom;
	    
	    private String adresse;
	    
	    private String cp;
	   
	    private String ville;
	    
	    private String pays;
	  
	    private String telPort;
	 
	    private String encPersoTel;
	  
	    private String encUboTel;
	  
	    private String encPersoEmail;

	    private String encUboEmail;
	  
	    private String intNoInsee;
	  
	    private String intSocNom;
	  
	    private String intSocAdresse;

	    private String intSocCp;
	 
	    private String intSocVille;
	  
	    private String intSocPays;
	    
	    private String intFonction;
	  
	    private String intProfEmail;
	   
	    private String intProfTel;

	    public Enseignant() {
	    }

	    public Enseignant(int noEnseignant) {
	        this.noEnseignant = noEnseignant;
	    }

	    public Enseignant(Integer noEnseignant, String type, String sexe, String nom, String prenom, String adresse, String cp, String ville, String pays) {
	        this.noEnseignant = noEnseignant;
	        this.type = type;
	        this.sexe = sexe;
	        this.nom = nom;
	        this.prenom = prenom;
	        this.adresse = adresse;
	        this.cp = cp;
	        this.ville = ville;
	        this.pays = pays;
	    }

	    public Integer getNoEnseignant() {
	        return noEnseignant;
	    }

	    public void setNoEnseignant(Integer noEnseignant) {
	        this.noEnseignant = noEnseignant;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public String getSexe() {
	        return sexe;
	    }

	    public void setSexe(String sexe) {
	        this.sexe = sexe;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public String getPrenom() {
	        return prenom;
	    }

	    public void setPrenom(String prenom) {
	        this.prenom = prenom;
	    }

	    public String getAdresse() {
	        return adresse;
	    }

	    public void setAdresse(String adresse) {
	        this.adresse = adresse;
	    }

	    public String getCp() {
	        return cp;
	    }

	    public void setCp(String cp) {
	        this.cp = cp;
	    }

	    public String getVille() {
	        return ville;
	    }

	    public void setVille(String ville) {
	        this.ville = ville;
	    }

	    public String getPays() {
	        return pays;
	    }

	    public void setPays(String pays) {
	        this.pays = pays;
	    }

	    public String getTelPort() {
	        return telPort;
	    }

	    public void setTelPort(String telPort) {
	        this.telPort = telPort;
	    }

	    public String getEncPersoTel() {
	        return encPersoTel;
	    }

	    public void setEncPersoTel(String encPersoTel) {
	        this.encPersoTel = encPersoTel;
	    }

	    public String getEncUboTel() {
	        return encUboTel;
	    }

	    public void setEncUboTel(String encUboTel) {
	        this.encUboTel = encUboTel;
	    }

	    public String getEncPersoEmail() {
	        return encPersoEmail;
	    }

	    public void setEncPersoEmail(String encPersoEmail) {
	        this.encPersoEmail = encPersoEmail;
	    }

	    public String getEncUboEmail() {
	        return encUboEmail;
	    }

	    public void setEncUboEmail(String encUboEmail) {
	        this.encUboEmail = encUboEmail;
	    }

	    public String getIntNoInsee() {
	        return intNoInsee;
	    }

	    public void setIntNoInsee(String intNoInsee) {
	        this.intNoInsee = intNoInsee;
	    }

	    public String getIntSocNom() {
	        return intSocNom;
	    }

	    public void setIntSocNom(String intSocNom) {
	        this.intSocNom = intSocNom;
	    }

	    public String getIntSocAdresse() {
	        return intSocAdresse;
	    }

	    public void setIntSocAdresse(String intSocAdresse) {
	        this.intSocAdresse = intSocAdresse;
	    }

	    public String getIntSocCp() {
	        return intSocCp;
	    }

	    public void setIntSocCp(String intSocCp) {
	        this.intSocCp = intSocCp;
	    }

	    public String getIntSocVille() {
	        return intSocVille;
	    }

	    public void setIntSocVille(String intSocVille) {
	        this.intSocVille = intSocVille;
	    }

	    public String getIntSocPays() {
	        return intSocPays;
	    }

	    public void setIntSocPays(String intSocPays) {
	        this.intSocPays = intSocPays;
	    }

	    public String getIntFonction() {
	        return intFonction;
	    }

	    public void setIntFonction(String intFonction) {
	        this.intFonction = intFonction;
	    }

	    public String getIntProfEmail() {
	        return intProfEmail;
	    }

	    public void setIntProfEmail(String intProfEmail) {
	        this.intProfEmail = intProfEmail;
	    }

	    public String getIntProfTel() {
	        return intProfTel;
	    }

	    public void setIntProfTel(String intProfTel) {
	        this.intProfTel = intProfTel;
	    }

		@Override
		public String toString() {
			return "Enseignant [noEnseignant=" + noEnseignant + ", type="
					+ type + ", sexe=" + sexe + ", nom=" + nom + ", prenom="
					+ prenom + ", adresse=" + adresse + ", cp=" + cp
					+ ", ville=" + ville + ", pays=" + pays + ", telPort="
					+ telPort + ", encPersoTel=" + encPersoTel + ", encUboTel="
					+ encUboTel + ", encPersoEmail=" + encPersoEmail
					+ ", encUboEmail=" + encUboEmail + ", intNoInsee="
					+ intNoInsee + ", intSocNom=" + intSocNom
					+ ", intSocAdresse=" + intSocAdresse + ", intSocCp="
					+ intSocCp + ", intSocVille=" + intSocVille
					+ ", intSocPays=" + intSocPays + ", intFonction="
					+ intFonction + ", intProfEmail=" + intProfEmail
					+ ", intProfTel=" + intProfTel + "]\n";
		}

	   
	   
	    
	}



