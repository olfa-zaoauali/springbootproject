package com.olfa.springbootproject.model;
import javax.persistence.*;
@Entity
@Table(name = "client")
public class modelCRM {
    private long Id ;
    private String nom ;
    private String prenom ;
    private String email ;
    private String locale ;
    private String numTel ;

    public modelCRM(){

    }
    public modelCRM(long id , String nom , String prenom , String email , String locale , String numTel ){
        this.Id = id ;
        this.nom = nom ;
        this.prenom = prenom ;
        this.email = email ;
        this.locale = locale ;
        this.numTel = numTel ;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId(){
        return this.Id ;
    }
    public void setId(long Id){
       this.Id=Id ;
    }
    public String getNom(){
        return this.nom ;
    }
    public void setNom(String nom){
        this.nom=nom ;
    }
    public String getPrenom(){
        return this.prenom ;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom ;
    }
    public String  getAdrsmail(){
        return this.email ;
    }
    public void setAdrsmail(String email){
        this.email=email;
    }
    public String  getLocale(){
        return this.locale ;
    }
    public void setLocale(String locale){
        this.locale=locale;
    }
    public String getNumTel(){
        return this.numTel ;
    }
    public void setNumTel(String numTel){
        this.numTel=numTel ;
    }
    @Override
    public String toString(){
        return "client:{" +
                "id=" + Id +
                ", nom='" + nom + '\'' +
                ", prenom='" +prenom + '\'' +
                ", email="+email+ '\'' +
                ", locale="+locale+ '\'' +
                ", numTel="+numTel+ '\'' +
                '}';

    }
}
