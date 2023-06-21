package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.clio.bean.core.PurchaseOrderDelivery;

import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.PurchaseOrderDeliveryProductHistory;
import ma.sir.clio.bean.core.PurchaseOrderDeliveryProduct;
import ma.sir.clio.ws.dto.PurchaseOrderDeliveryProductDto;

@Component
public class PurchaseOrderDeliveryProductConverter extends AbstractConverter<PurchaseOrderDeliveryProduct, PurchaseOrderDeliveryProductDto, PurchaseOrderDeliveryProductHistory> {

    @Autowired
    private PurchaseOrderDeliveryConverter purchaseOrderDeliveryConverter ;
    @Autowired
    private StoreConverter storeConverter ;
    @Autowired
    private ProductConverter productConverter ;
    private boolean product;
    private boolean purchaseOrderDelivery;
    private boolean store;

    public  PurchaseOrderDeliveryProductConverter(){
        super(PurchaseOrderDeliveryProduct.class, PurchaseOrderDeliveryProductDto.class, PurchaseOrderDeliveryProductHistory.class);
    }

    @Override
    public PurchaseOrderDeliveryProduct toItem(PurchaseOrderDeliveryProductDto dto) {
        if (dto == null) {
            return null;
        } else {
        PurchaseOrderDeliveryProduct item = new PurchaseOrderDeliveryProduct();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getQantity()))
                item.setQantity(dto.getQantity());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(this.product && dto.getProduct()!=null)
                item.setProduct(productConverter.toItem(dto.getProduct())) ;

            if(dto.getPurchaseOrderDelivery() != null && dto.getPurchaseOrderDelivery().getId() != null){
                item.setPurchaseOrderDelivery(new PurchaseOrderDelivery());
                item.getPurchaseOrderDelivery().setId(dto.getPurchaseOrderDelivery().getId());
            }

            if(this.store && dto.getStore()!=null)
                item.setStore(storeConverter.toItem(dto.getStore())) ;



        return item;
        }
    }

    @Override
    public PurchaseOrderDeliveryProductDto toDto(PurchaseOrderDeliveryProduct item) {
        if (item == null) {
            return null;
        } else {
            PurchaseOrderDeliveryProductDto dto = new PurchaseOrderDeliveryProductDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getQantity()))
                dto.setQantity(item.getQantity());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.product && item.getProduct()!=null) {
            dto.setProduct(productConverter.toDto(item.getProduct())) ;
        }
        if(this.purchaseOrderDelivery && item.getPurchaseOrderDelivery()!=null) {
            dto.setPurchaseOrderDelivery(purchaseOrderDeliveryConverter.toDto(item.getPurchaseOrderDelivery())) ;
        }
        if(this.store && item.getStore()!=null) {
            dto.setStore(storeConverter.toDto(item.getStore())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.product = value;
        this.purchaseOrderDelivery = value;
        this.store = value;
    }


    public PurchaseOrderDeliveryConverter getPurchaseOrderDeliveryConverter(){
        return this.purchaseOrderDeliveryConverter;
    }
    public void setPurchaseOrderDeliveryConverter(PurchaseOrderDeliveryConverter purchaseOrderDeliveryConverter ){
        this.purchaseOrderDeliveryConverter = purchaseOrderDeliveryConverter;
    }
    public StoreConverter getStoreConverter(){
        return this.storeConverter;
    }
    public void setStoreConverter(StoreConverter storeConverter ){
        this.storeConverter = storeConverter;
    }
    public ProductConverter getProductConverter(){
        return this.productConverter;
    }
    public void setProductConverter(ProductConverter productConverter ){
        this.productConverter = productConverter;
    }
    public boolean  isProduct(){
        return this.product;
    }
    public void  setProduct(boolean product){
        this.product = product;
    }
    public boolean  isPurchaseOrderDelivery(){
        return this.purchaseOrderDelivery;
    }
    public void  setPurchaseOrderDelivery(boolean purchaseOrderDelivery){
        this.purchaseOrderDelivery = purchaseOrderDelivery;
    }
    public boolean  isStore(){
        return this.store;
    }
    public void  setStore(boolean store){
        this.store = store;
    }
}
