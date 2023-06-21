package ma.sir.clio.bean.core;

import java.util.Objects;
import java.util.List;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.clio.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "purchase_request")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="purchase_request_seq",sequenceName="purchase_request_seq",allocationSize=1, initialValue = 1)
public class PurchaseRequest   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String refrence;
    private BigDecimal montantDevis = BigDecimal.ZERO;
    private LocalDateTime datePurchaseRequest ;
    private LocalDateTime dateLivraison ;
    private BigDecimal montantAchat = BigDecimal.ZERO;

    private Supplier supplier ;
    
    private PurchaseRequestStatus purchaseRequestStatus ;
    

    private List<PurchaseRequestProduct> purchaseRequestProducts ;

    public PurchaseRequest(){
        super();
    }

    public PurchaseRequest(Long id,String refrence){
        this.id = id;
        this.refrence = refrence ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="purchase_request_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getRefrence(){
        return this.refrence;
    }
    public void setRefrence(String refrence){
        this.refrence = refrence;
    }
    public BigDecimal getMontantDevis(){
        return this.montantDevis;
    }
    public void setMontantDevis(BigDecimal montantDevis){
        this.montantDevis = montantDevis;
    }
    public LocalDateTime getDatePurchaseRequest(){
        return this.datePurchaseRequest;
    }
    public void setDatePurchaseRequest(LocalDateTime datePurchaseRequest){
        this.datePurchaseRequest = datePurchaseRequest;
    }
    public LocalDateTime getDateLivraison(){
        return this.dateLivraison;
    }
    public void setDateLivraison(LocalDateTime dateLivraison){
        this.dateLivraison = dateLivraison;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Supplier getSupplier(){
        return this.supplier;
    }
    public void setSupplier(Supplier supplier){
        this.supplier = supplier;
    }
    public BigDecimal getMontantAchat(){
        return this.montantAchat;
    }
    public void setMontantAchat(BigDecimal montantAchat){
        this.montantAchat = montantAchat;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public PurchaseRequestStatus getPurchaseRequestStatus(){
        return this.purchaseRequestStatus;
    }
    public void setPurchaseRequestStatus(PurchaseRequestStatus purchaseRequestStatus){
        this.purchaseRequestStatus = purchaseRequestStatus;
    }
    @OneToMany(mappedBy = "purchaseRequest")
    public List<PurchaseRequestProduct> getPurchaseRequestProducts(){
        return this.purchaseRequestProducts;
    }
    public void setPurchaseRequestProducts(List<PurchaseRequestProduct> purchaseRequestProducts){
        this.purchaseRequestProducts = purchaseRequestProducts;
    }

    @Transient
    public String getLabel() {
        label = refrence;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseRequest purchaseRequest = (PurchaseRequest) o;
        return id != null && id.equals(purchaseRequest.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

