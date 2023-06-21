package  ma.sir.clio.ws.dto;

import ma.sir.clio.zynerator.audit.Log;
import ma.sir.clio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto  extends AuditBaseDto {

    private String partNumber  ;

    private ProductFamilyDto productFamily ;



    public ProductDto(){
        super();
    }



    @Log
    public String getPartNumber(){
        return this.partNumber;
    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }


    public ProductFamilyDto getProductFamily(){
        return this.productFamily;
    }

    public void setProductFamily(ProductFamilyDto productFamily){
        this.productFamily = productFamily;
    }




}
