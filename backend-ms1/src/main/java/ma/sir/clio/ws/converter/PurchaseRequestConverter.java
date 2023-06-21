package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.clio.zynerator.util.ListUtil;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.PurchaseRequestHistory;
import ma.sir.clio.bean.core.PurchaseRequest;
import ma.sir.clio.ws.dto.PurchaseRequestDto;

@Component
public class PurchaseRequestConverter extends AbstractConverter<PurchaseRequest, PurchaseRequestDto, PurchaseRequestHistory> {

    @Autowired
    private SupplierConverter supplierConverter ;
    @Autowired
    private UnitePriceConverter unitePriceConverter ;
    @Autowired
    private PurchaseRequestStatusConverter purchaseRequestStatusConverter ;
    @Autowired
    private ProductConverter productConverter ;
    @Autowired
    private PurchaseRequestProductConverter purchaseRequestProductConverter ;
    @Autowired
    private PurchaseRequestProductStatusConverter purchaseRequestProductStatusConverter ;
    private boolean supplier;
    private boolean purchaseRequestStatus;
    private boolean purchaseRequestProducts;

    public  PurchaseRequestConverter(){
        super(PurchaseRequest.class, PurchaseRequestDto.class, PurchaseRequestHistory.class);
        init(true);
    }

    @Override
    public PurchaseRequest toItem(PurchaseRequestDto dto) {
        if (dto == null) {
            return null;
        } else {
        PurchaseRequest item = new PurchaseRequest();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRefrence()))
                item.setRefrence(dto.getRefrence());
            if(StringUtil.isNotEmpty(dto.getMontantDevis()))
                item.setMontantDevis(dto.getMontantDevis());
            if(StringUtil.isNotEmpty(dto.getDatePurchaseRequest()))
                item.setDatePurchaseRequest(DateUtil.stringEnToDate(dto.getDatePurchaseRequest()));
            if(StringUtil.isNotEmpty(dto.getDateLivraison()))
                item.setDateLivraison(DateUtil.stringEnToDate(dto.getDateLivraison()));
            if(StringUtil.isNotEmpty(dto.getMontantAchat()))
                item.setMontantAchat(dto.getMontantAchat());
            if(this.supplier && dto.getSupplier()!=null)
                item.setSupplier(supplierConverter.toItem(dto.getSupplier())) ;

            if(this.purchaseRequestStatus && dto.getPurchaseRequestStatus()!=null)
                item.setPurchaseRequestStatus(purchaseRequestStatusConverter.toItem(dto.getPurchaseRequestStatus())) ;


            if(this.purchaseRequestProducts && ListUtil.isNotEmpty(dto.getPurchaseRequestProducts()))
                item.setPurchaseRequestProducts(purchaseRequestProductConverter.toItem(dto.getPurchaseRequestProducts()));

        return item;
        }
    }

    @Override
    public PurchaseRequestDto toDto(PurchaseRequest item) {
        if (item == null) {
            return null;
        } else {
            PurchaseRequestDto dto = new PurchaseRequestDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRefrence()))
                dto.setRefrence(item.getRefrence());
            if(StringUtil.isNotEmpty(item.getMontantDevis()))
                dto.setMontantDevis(item.getMontantDevis());
            if(item.getDatePurchaseRequest()!=null)
                dto.setDatePurchaseRequest(DateUtil.dateTimeToString(item.getDatePurchaseRequest()));
            if(item.getDateLivraison()!=null)
                dto.setDateLivraison(DateUtil.dateTimeToString(item.getDateLivraison()));
            if(StringUtil.isNotEmpty(item.getMontantAchat()))
                dto.setMontantAchat(item.getMontantAchat());
        if(this.supplier && item.getSupplier()!=null) {
            dto.setSupplier(supplierConverter.toDto(item.getSupplier())) ;
        }
        if(this.purchaseRequestStatus && item.getPurchaseRequestStatus()!=null) {
            dto.setPurchaseRequestStatus(purchaseRequestStatusConverter.toDto(item.getPurchaseRequestStatus())) ;
        }
        if(this.purchaseRequestProducts && ListUtil.isNotEmpty(item.getPurchaseRequestProducts())){
            purchaseRequestProductConverter.init(true);
            purchaseRequestProductConverter.setPurchaseRequest(false);
            dto.setPurchaseRequestProducts(purchaseRequestProductConverter.toDto(item.getPurchaseRequestProducts()));
            purchaseRequestProductConverter.setPurchaseRequest(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.purchaseRequestProducts = value;
    }

    public void initObject(boolean value) {
        this.supplier = value;
        this.purchaseRequestStatus = value;
    }


    public SupplierConverter getSupplierConverter(){
        return this.supplierConverter;
    }
    public void setSupplierConverter(SupplierConverter supplierConverter ){
        this.supplierConverter = supplierConverter;
    }
    public UnitePriceConverter getUnitePriceConverter(){
        return this.unitePriceConverter;
    }
    public void setUnitePriceConverter(UnitePriceConverter unitePriceConverter ){
        this.unitePriceConverter = unitePriceConverter;
    }
    public PurchaseRequestStatusConverter getPurchaseRequestStatusConverter(){
        return this.purchaseRequestStatusConverter;
    }
    public void setPurchaseRequestStatusConverter(PurchaseRequestStatusConverter purchaseRequestStatusConverter ){
        this.purchaseRequestStatusConverter = purchaseRequestStatusConverter;
    }
    public ProductConverter getProductConverter(){
        return this.productConverter;
    }
    public void setProductConverter(ProductConverter productConverter ){
        this.productConverter = productConverter;
    }
    public PurchaseRequestProductConverter getPurchaseRequestProductConverter(){
        return this.purchaseRequestProductConverter;
    }
    public void setPurchaseRequestProductConverter(PurchaseRequestProductConverter purchaseRequestProductConverter ){
        this.purchaseRequestProductConverter = purchaseRequestProductConverter;
    }
    public PurchaseRequestProductStatusConverter getPurchaseRequestProductStatusConverter(){
        return this.purchaseRequestProductStatusConverter;
    }
    public void setPurchaseRequestProductStatusConverter(PurchaseRequestProductStatusConverter purchaseRequestProductStatusConverter ){
        this.purchaseRequestProductStatusConverter = purchaseRequestProductStatusConverter;
    }
    public boolean  isSupplier(){
        return this.supplier;
    }
    public void  setSupplier(boolean supplier){
        this.supplier = supplier;
    }
    public boolean  isPurchaseRequestStatus(){
        return this.purchaseRequestStatus;
    }
    public void  setPurchaseRequestStatus(boolean purchaseRequestStatus){
        this.purchaseRequestStatus = purchaseRequestStatus;
    }
    public boolean  isPurchaseRequestProducts(){
        return this.purchaseRequestProducts ;
    }
    public void  setPurchaseRequestProducts(boolean purchaseRequestProducts ){
        this.purchaseRequestProducts  = purchaseRequestProducts ;
    }
}
