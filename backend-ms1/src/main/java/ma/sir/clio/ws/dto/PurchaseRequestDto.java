package  ma.sir.clio.ws.dto;

import ma.sir.clio.zynerator.audit.Log;
import ma.sir.clio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseRequestDto  extends AuditBaseDto {

    private String refrence  ;
    private BigDecimal montantDevis  ;
    private String datePurchaseRequest ;
    private String dateLivraison ;
    private BigDecimal montantAchat  ;

    private SupplierDto supplier ;
    private PurchaseRequestStatusDto purchaseRequestStatus ;

    private List<PurchaseRequestProductDto> purchaseRequestProducts ;


    public PurchaseRequestDto(){
        super();
    }



    @Log
    public String getRefrence(){
        return this.refrence;
    }
    public void setRefrence(String refrence){
        this.refrence = refrence;
    }

    @Log
    public BigDecimal getMontantDevis(){
        return this.montantDevis;
    }
    public void setMontantDevis(BigDecimal montantDevis){
        this.montantDevis = montantDevis;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDatePurchaseRequest(){
        return this.datePurchaseRequest;
    }
    public void setDatePurchaseRequest(String datePurchaseRequest){
        this.datePurchaseRequest = datePurchaseRequest;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateLivraison(){
        return this.dateLivraison;
    }
    public void setDateLivraison(String dateLivraison){
        this.dateLivraison = dateLivraison;
    }

    @Log
    public BigDecimal getMontantAchat(){
        return this.montantAchat;
    }
    public void setMontantAchat(BigDecimal montantAchat){
        this.montantAchat = montantAchat;
    }


    public SupplierDto getSupplier(){
        return this.supplier;
    }

    public void setSupplier(SupplierDto supplier){
        this.supplier = supplier;
    }
    public PurchaseRequestStatusDto getPurchaseRequestStatus(){
        return this.purchaseRequestStatus;
    }

    public void setPurchaseRequestStatus(PurchaseRequestStatusDto purchaseRequestStatus){
        this.purchaseRequestStatus = purchaseRequestStatus;
    }



    public List<PurchaseRequestProductDto> getPurchaseRequestProducts(){
        return this.purchaseRequestProducts;
    }

    public void setPurchaseRequestProducts(List<PurchaseRequestProductDto> purchaseRequestProducts){
        this.purchaseRequestProducts = purchaseRequestProducts;
    }

}
