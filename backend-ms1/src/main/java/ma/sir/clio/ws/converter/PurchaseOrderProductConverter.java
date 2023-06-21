package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.clio.bean.core.PurchaseOrder;

import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.PurchaseOrderProductHistory;
import ma.sir.clio.bean.core.PurchaseOrderProduct;
import ma.sir.clio.ws.dto.PurchaseOrderProductDto;

@Component
public class PurchaseOrderProductConverter extends AbstractConverter<PurchaseOrderProduct, PurchaseOrderProductDto, PurchaseOrderProductHistory> {

    @Autowired
    private PurchaseOrderConverter purchaseOrderConverter ;
    @Autowired
    private PurchaseOrderProductStatusConverter purchaseOrderProductStatusConverter ;
    @Autowired
    private UnitePriceConverter unitePriceConverter ;
    @Autowired
    private ProductConverter productConverter ;
    private boolean product;
    private boolean purchaseOrder;
    private boolean purchaseOrderProductStatus;
    private boolean unitePrice;

    public  PurchaseOrderProductConverter(){
        super(PurchaseOrderProduct.class, PurchaseOrderProductDto.class, PurchaseOrderProductHistory.class);
    }

    @Override
    public PurchaseOrderProduct toItem(PurchaseOrderProductDto dto) {
        if (dto == null) {
            return null;
        } else {
        PurchaseOrderProduct item = new PurchaseOrderProduct();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getQantity()))
                item.setQantity(dto.getQantity());
            if(StringUtil.isNotEmpty(dto.getQantityDelivered()))
                item.setQantityDelivered(dto.getQantityDelivered());
            if(StringUtil.isNotEmpty(dto.getPrice()))
                item.setPrice(dto.getPrice());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(this.product && dto.getProduct()!=null)
                item.setProduct(productConverter.toItem(dto.getProduct())) ;

            if(dto.getPurchaseOrder() != null && dto.getPurchaseOrder().getId() != null){
                item.setPurchaseOrder(new PurchaseOrder());
                item.getPurchaseOrder().setId(dto.getPurchaseOrder().getId());
            }

            if(this.purchaseOrderProductStatus && dto.getPurchaseOrderProductStatus()!=null)
                item.setPurchaseOrderProductStatus(purchaseOrderProductStatusConverter.toItem(dto.getPurchaseOrderProductStatus())) ;

            if(this.unitePrice && dto.getUnitePrice()!=null)
                item.setUnitePrice(unitePriceConverter.toItem(dto.getUnitePrice())) ;



        return item;
        }
    }

    @Override
    public PurchaseOrderProductDto toDto(PurchaseOrderProduct item) {
        if (item == null) {
            return null;
        } else {
            PurchaseOrderProductDto dto = new PurchaseOrderProductDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getQantity()))
                dto.setQantity(item.getQantity());
            if(StringUtil.isNotEmpty(item.getQantityDelivered()))
                dto.setQantityDelivered(item.getQantityDelivered());
            if(StringUtil.isNotEmpty(item.getPrice()))
                dto.setPrice(item.getPrice());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.product && item.getProduct()!=null) {
            dto.setProduct(productConverter.toDto(item.getProduct())) ;
        }
        if(this.purchaseOrder && item.getPurchaseOrder()!=null) {
            dto.setPurchaseOrder(purchaseOrderConverter.toDto(item.getPurchaseOrder())) ;
        }
        if(this.purchaseOrderProductStatus && item.getPurchaseOrderProductStatus()!=null) {
            dto.setPurchaseOrderProductStatus(purchaseOrderProductStatusConverter.toDto(item.getPurchaseOrderProductStatus())) ;
        }
        if(this.unitePrice && item.getUnitePrice()!=null) {
            dto.setUnitePrice(unitePriceConverter.toDto(item.getUnitePrice())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.product = value;
        this.purchaseOrder = value;
        this.purchaseOrderProductStatus = value;
        this.unitePrice = value;
    }


    public PurchaseOrderConverter getPurchaseOrderConverter(){
        return this.purchaseOrderConverter;
    }
    public void setPurchaseOrderConverter(PurchaseOrderConverter purchaseOrderConverter ){
        this.purchaseOrderConverter = purchaseOrderConverter;
    }
    public PurchaseOrderProductStatusConverter getPurchaseOrderProductStatusConverter(){
        return this.purchaseOrderProductStatusConverter;
    }
    public void setPurchaseOrderProductStatusConverter(PurchaseOrderProductStatusConverter purchaseOrderProductStatusConverter ){
        this.purchaseOrderProductStatusConverter = purchaseOrderProductStatusConverter;
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
    public boolean  isProduct(){
        return this.product;
    }
    public void  setProduct(boolean product){
        this.product = product;
    }
    public boolean  isPurchaseOrder(){
        return this.purchaseOrder;
    }
    public void  setPurchaseOrder(boolean purchaseOrder){
        this.purchaseOrder = purchaseOrder;
    }
    public boolean  isPurchaseOrderProductStatus(){
        return this.purchaseOrderProductStatus;
    }
    public void  setPurchaseOrderProductStatus(boolean purchaseOrderProductStatus){
        this.purchaseOrderProductStatus = purchaseOrderProductStatus;
    }
    public boolean  isUnitePrice(){
        return this.unitePrice;
    }
    public void  setUnitePrice(boolean unitePrice){
        this.unitePrice = unitePrice;
    }
}
