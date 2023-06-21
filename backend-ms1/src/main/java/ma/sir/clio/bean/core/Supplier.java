package ma.sir.clio.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "supplier")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="supplier_seq",sequenceName="supplier_seq",allocationSize=1, initialValue = 1)
public class Supplier   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String prenom;
    @Column(length = 500)
    private String reference;
    @Column(length = 500)
    private String email;



    public Supplier(){
        super();
    }

    public Supplier(Long id,String reference){
        this.id = id;
        this.reference = reference ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="supplier_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Transient
    public String getLabel() {
        label = reference;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return id != null && id.equals(supplier.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

