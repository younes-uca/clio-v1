package  ma.sir.clio.ws.dto;

import ma.sir.clio.zynerator.audit.Log;
import ma.sir.clio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplierDto  extends AuditBaseDto {

    private String nom  ;
    private String prenom  ;
    private String reference  ;
    private String email  ;




    public SupplierDto(){
        super();
    }



    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    @Log
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    @Log
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }

    @Log
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }






}
