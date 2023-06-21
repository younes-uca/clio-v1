package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.clio.bean.core.PurchaseRequest;

import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.PurchaseRequestProductHistory;
import ma.sir.clio.bean.core.PurchaseRequestProduct;
import ma.sir.clio.ws.dto.PurchaseRequestProductDto;

@Component
public class PurchaseRequestProductConverter extends AbstractConverter<PurchaseRequestProduct, PurchaseRequestProductDto, PurchaseRequestProductHistory> {

    @Autowired
    private PurchaseRequestConverter purchaseRequestConverter ;
    @Autowired
    private UnitePriceConverter unitePriceConverter ;
    @Autowired
    private ProductConverter productConverter ;
    @Autowired
    private PurchaseRequestProductStatusConverter purchaseRequestProductStatusConverter ;
    private boolean product;
    private boolean purchaseRequest;
    private boolean unitePrice;
    private boolean purchaseRequestProductStatus;

    public  PurchaseRequestProductConverter(){
        super(PurchaseRequestProduct.class, PurchaseRequestProductDto.class, PurchaseRequestProductHistory.class);
    }

    @Override
    public PurchaseRequestProduct toItem(PurchaseRequestProductDto dto) {
        if (dto == null) {
            return null;
        } else {
        PurchaseRequestProduct item = new PurchaseRequestProduct();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getQantity()))
                item.setQantity(dto.getQantity());
            if(StringUtil.isNotEmpty(dto.getQantityOrdred()))
                item.setQantityOrdred(dto.getQantityOrdred());
            if(StringUtil.isNotEmpty(dto.getQantityDelivered()))
                item.setQantityDelivered(dto.getQantityDelivered());
            if(StringUtil.isNotEmpty(dto.getPrice()))
                item.setPrice(dto.getPrice());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(this.product && dto.getProduct()!=null)
                item.setProduct(productConverter.toItem(dto.getProduct())) ;

            if(dto.getPurchaseRequest() != null && dto.getPurchaseRequest().getId() != null){
                item.setPurchaseRequest(new PurchaseRequest());
                item.getPurchaseRequest().setId(dto.getPurchaseRequest().getId());
            }

            if(this.unitePrice && dto.getUnitePrice()!=null)
                item.setUnitePrice(unitePriceConverter.toItem(dto.getUnitePrice())) ;

            if(this.purchaseRequestProductStatus && dto.getPurchaseRequestProductStatus()!=null)
                item.setPurchaseRequestProductStatus(purchaseRequestProductStatusConverter.toItem(dto.getPurchaseRequestProductStatus())) ;



        return item;
        }
    }

    @Override
    public PurchaseRequestProductDto toDto(PurchaseRequestProduct item) {
        if (item == null) {
            return null;
        } else {
            PurchaseRequestProductDto dto = new PurchaseRequestProductDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getQantity()))
                dto.setQantity(item.getQantity());
            if(StringUtil.isNotEmpty(item.getQantityOrdred()))
                dto.setQantityOrdred(item.getQantityOrdred());
            if(StringUtil.isNotEmpty(item.getQantityDelivered()))
                dto.setQantityDelivered(item.getQantityDelivered());
            if(StringUtil.isNotEmpty(item.getPrice()))
                dto.setPrice(item.getPrice());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.product && item.getProduct()!=null) {
            dto.setProduct(productConverter.toDto(item.getProduct())) ;
        }
        if(this.purchaseRequest && item.getPurchaseRequest()!=null) {
            dto.setPurchaseRequest(purchaseRequestConverter.toDto(item.getPurchaseRequest())) ;
        }
        if(this.unitePrice && item.getUnitePrice()!=null) {
            dto.setUnitePrice(unitePriceConverter.toDto(item.getUnitePrice())) ;
        }
        if(this.purchaseRequestProductStatus && item.getPurchaseRequestProductStatus()!=null) {
            dto.setPurchaseRequestProductStatus(purchaseRequestProductStatusConverter.toDto(item.getPurchaseRequestProductStatus())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.product = value;
        this.purchaseRequest = value;
        this.unitePrice = value;
        this.purchaseRequestProductStatus = value;
    }


    public PurchaseRequestConverter getPurchaseRequestConverter(){
        return this.purchaseRequestConverter;
    }
    public void setPurchaseRequestConverter(PurchaseRequestConverter purchaseRequestConverter ){
        this.purchaseRequestConverter = purchaseRequestConverter;
    }
    public UnitePriceConverter getUnitePriceConverter(){
        return this.unitePriceConverter;
    }
    public void setUnitePriceConverter(UnitePriceConverter unitePriceConverter ){
        this.unitePriceConverter = unitePriceConverter;
    }
    public ProductConverter getProductConverter(){
        return this.productConverter;
    }
    public void setProductConverter(ProductConverter productConverter ){
        this.productConverter = productConverter;
    }
    public PurchaseRequestProductStatusConverter getPurchaseRequestProductStatusConverter(){
        return this.purchaseRequestProductStatusConverter;
    }
    public void setPurchaseRequestProductStatusConverter(PurchaseRequestProductStatusConverter purchaseRequestProductStatusConverter ){
        this.purchaseRequestProductStatusConverter = purchaseRequestProductStatusConverter;
    }
    public boolean  isProduct(){
        return this.product;
    }
    public void  setProduct(boolean product){
        this.product = product;
    }
    public boolean  isPurchaseRequest(){
        return this.purchaseRequest;
    }
    public void  setPurchaseRequest(boolean purchaseRequest){
        this.purchaseRequest = purchaseRequest;
    }
    public boolean  isUnitePrice(){
        return this.unitePrice;
    }
    public void  setUnitePrice(boolean unitePrice){
        this.unitePrice = unitePrice;
    }
    public boolean  isPurchaseRequestProductStatus(){
        return this.purchaseRequestProductStatus;
    }
    public void  setPurchaseRequestProductStatus(boolean purchaseRequestProductStatus){
        this.purchaseRequestProductStatus = purchaseRequestProductStatus;
    }
}
