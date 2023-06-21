package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.clio.zynerator.util.ListUtil;

import ma.sir.clio.bean.core.PurchaseOrder;

import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.PurchaseOrderDeliveryHistory;
import ma.sir.clio.bean.core.PurchaseOrderDelivery;
import ma.sir.clio.ws.dto.PurchaseOrderDeliveryDto;

@Component
public class PurchaseOrderDeliveryConverter extends AbstractConverter<PurchaseOrderDelivery, PurchaseOrderDeliveryDto, PurchaseOrderDeliveryHistory> {

    @Autowired
    private PurchaseOrderConverter purchaseOrderConverter ;
    @Autowired
    private PurchaserConverter purchaserConverter ;
    @Autowired
    private OrderSupplierStatusConverter orderSupplierStatusConverter ;
    @Autowired
    private PurchaseOrderDeliveryProductConverter purchaseOrderDeliveryProductConverter ;
    @Autowired
    private OrderSupplierDeliveryStatusConverter orderSupplierDeliveryStatusConverter ;
    @Autowired
    private StoreConverter storeConverter ;
    @Autowired
    private ProductConverter productConverter ;
    private boolean purchaseOrder;
    private boolean orderSupplierStatus;
    private boolean purchaser;
    private boolean orderSupplierDeliveryStatus;
    private boolean purchaseOrderDeliveryProducts;

    public  PurchaseOrderDeliveryConverter(){
        super(PurchaseOrderDelivery.class, PurchaseOrderDeliveryDto.class, PurchaseOrderDeliveryHistory.class);
        init(true);
    }

    @Override
    public PurchaseOrderDelivery toItem(PurchaseOrderDeliveryDto dto) {
        if (dto == null) {
            return null;
        } else {
        PurchaseOrderDelivery item = new PurchaseOrderDelivery();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getTotal()))
                item.setTotal(dto.getTotal());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(StringUtil.isNotEmpty(dto.getDateDelivery()))
                item.setDateDelivery(DateUtil.stringEnToDate(dto.getDateDelivery()));
            if(StringUtil.isNotEmpty(dto.getInvoiceAck()))
                item.setInvoiceAck(DateUtil.stringEnToDate(dto.getInvoiceAck()));
            if(StringUtil.isNotEmpty(dto.getInvoiceAckNumber()))
                item.setInvoiceAckNumber(dto.getInvoiceAckNumber());
            if(StringUtil.isNotEmpty(dto.getInvoicePrNumber()))
                item.setInvoicePrNumber(dto.getInvoicePrNumber());
            if(StringUtil.isNotEmpty(dto.getInvoiceDate()))
                item.setInvoiceDate(DateUtil.stringEnToDate(dto.getInvoiceDate()));
            if(StringUtil.isNotEmpty(dto.getInvoiceAckDelivery()))
                item.setInvoiceAckDelivery(DateUtil.stringEnToDate(dto.getInvoiceAckDelivery()));
            if(StringUtil.isNotEmpty(dto.getDescriptionInvoice()))
                item.setDescriptionInvoice(dto.getDescriptionInvoice());
            if(StringUtil.isNotEmpty(dto.getInvoiceNumber()))
                item.setInvoiceNumber(dto.getInvoiceNumber());
            if(dto.getPurchaseOrder() != null && dto.getPurchaseOrder().getId() != null){
                item.setPurchaseOrder(new PurchaseOrder());
                item.getPurchaseOrder().setId(dto.getPurchaseOrder().getId());
            }

            if(this.orderSupplierStatus && dto.getOrderSupplierStatus()!=null)
                item.setOrderSupplierStatus(orderSupplierStatusConverter.toItem(dto.getOrderSupplierStatus())) ;

            if(this.purchaser && dto.getPurchaser()!=null)
                item.setPurchaser(purchaserConverter.toItem(dto.getPurchaser())) ;

            if(this.orderSupplierDeliveryStatus && dto.getOrderSupplierDeliveryStatus()!=null)
                item.setOrderSupplierDeliveryStatus(orderSupplierDeliveryStatusConverter.toItem(dto.getOrderSupplierDeliveryStatus())) ;


            if(this.purchaseOrderDeliveryProducts && ListUtil.isNotEmpty(dto.getPurchaseOrderDeliveryProducts()))
                item.setPurchaseOrderDeliveryProducts(purchaseOrderDeliveryProductConverter.toItem(dto.getPurchaseOrderDeliveryProducts()));

        return item;
        }
    }

    @Override
    public PurchaseOrderDeliveryDto toDto(PurchaseOrderDelivery item) {
        if (item == null) {
            return null;
        } else {
            PurchaseOrderDeliveryDto dto = new PurchaseOrderDeliveryDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getTotal()))
                dto.setTotal(item.getTotal());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
            if(item.getDateDelivery()!=null)
                dto.setDateDelivery(DateUtil.dateTimeToString(item.getDateDelivery()));
            if(item.getInvoiceAck()!=null)
                dto.setInvoiceAck(DateUtil.dateTimeToString(item.getInvoiceAck()));
            if(StringUtil.isNotEmpty(item.getInvoiceAckNumber()))
                dto.setInvoiceAckNumber(item.getInvoiceAckNumber());
            if(StringUtil.isNotEmpty(item.getInvoicePrNumber()))
                dto.setInvoicePrNumber(item.getInvoicePrNumber());
            if(item.getInvoiceDate()!=null)
                dto.setInvoiceDate(DateUtil.dateTimeToString(item.getInvoiceDate()));
            if(item.getInvoiceAckDelivery()!=null)
                dto.setInvoiceAckDelivery(DateUtil.dateTimeToString(item.getInvoiceAckDelivery()));
            if(StringUtil.isNotEmpty(item.getDescriptionInvoice()))
                dto.setDescriptionInvoice(item.getDescriptionInvoice());
            if(StringUtil.isNotEmpty(item.getInvoiceNumber()))
                dto.setInvoiceNumber(item.getInvoiceNumber());
        if(this.purchaseOrder && item.getPurchaseOrder()!=null) {
            dto.setPurchaseOrder(purchaseOrderConverter.toDto(item.getPurchaseOrder())) ;
        }
        if(this.orderSupplierStatus && item.getOrderSupplierStatus()!=null) {
            dto.setOrderSupplierStatus(orderSupplierStatusConverter.toDto(item.getOrderSupplierStatus())) ;
        }
        if(this.purchaser && item.getPurchaser()!=null) {
            dto.setPurchaser(purchaserConverter.toDto(item.getPurchaser())) ;
        }
        if(this.orderSupplierDeliveryStatus && item.getOrderSupplierDeliveryStatus()!=null) {
            dto.setOrderSupplierDeliveryStatus(orderSupplierDeliveryStatusConverter.toDto(item.getOrderSupplierDeliveryStatus())) ;
        }
        if(this.purchaseOrderDeliveryProducts && ListUtil.isNotEmpty(item.getPurchaseOrderDeliveryProducts())){
            purchaseOrderDeliveryProductConverter.init(true);
            purchaseOrderDeliveryProductConverter.setPurchaseOrderDelivery(false);
            dto.setPurchaseOrderDeliveryProducts(purchaseOrderDeliveryProductConverter.toDto(item.getPurchaseOrderDeliveryProducts()));
            purchaseOrderDeliveryProductConverter.setPurchaseOrderDelivery(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.purchaseOrderDeliveryProducts = value;
    }

    public void initObject(boolean value) {
        this.purchaseOrder = value;
        this.orderSupplierStatus = value;
        this.purchaser = value;
        this.orderSupplierDeliveryStatus = value;
    }


    public PurchaseOrderConverter getPurchaseOrderConverter(){
        return this.purchaseOrderConverter;
    }
    public void setPurchaseOrderConverter(PurchaseOrderConverter purchaseOrderConverter ){
        this.purchaseOrderConverter = purchaseOrderConverter;
    }
    public PurchaserConverter getPurchaserConverter(){
        return this.purchaserConverter;
    }
    public void setPurchaserConverter(PurchaserConverter purchaserConverter ){
        this.purchaserConverter = purchaserConverter;
    }
    public OrderSupplierStatusConverter getOrderSupplierStatusConverter(){
        return this.orderSupplierStatusConverter;
    }
    public void setOrderSupplierStatusConverter(OrderSupplierStatusConverter orderSupplierStatusConverter ){
        this.orderSupplierStatusConverter = orderSupplierStatusConverter;
    }
    public PurchaseOrderDeliveryProductConverter getPurchaseOrderDeliveryProductConverter(){
        return this.purchaseOrderDeliveryProductConverter;
    }
    public void setPurchaseOrderDeliveryProductConverter(PurchaseOrderDeliveryProductConverter purchaseOrderDeliveryProductConverter ){
        this.purchaseOrderDeliveryProductConverter = purchaseOrderDeliveryProductConverter;
    }
    public OrderSupplierDeliveryStatusConverter getOrderSupplierDeliveryStatusConverter(){
        return this.orderSupplierDeliveryStatusConverter;
    }
    public void setOrderSupplierDeliveryStatusConverter(OrderSupplierDeliveryStatusConverter orderSupplierDeliveryStatusConverter ){
        this.orderSupplierDeliveryStatusConverter = orderSupplierDeliveryStatusConverter;
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
    public boolean  isPurchaseOrder(){
        return this.purchaseOrder;
    }
    public void  setPurchaseOrder(boolean purchaseOrder){
        this.purchaseOrder = purchaseOrder;
    }
    public boolean  isOrderSupplierStatus(){
        return this.orderSupplierStatus;
    }
    public void  setOrderSupplierStatus(boolean orderSupplierStatus){
        this.orderSupplierStatus = orderSupplierStatus;
    }
    public boolean  isPurchaser(){
        return this.purchaser;
    }
    public void  setPurchaser(boolean purchaser){
        this.purchaser = purchaser;
    }
    public boolean  isOrderSupplierDeliveryStatus(){
        return this.orderSupplierDeliveryStatus;
    }
    public void  setOrderSupplierDeliveryStatus(boolean orderSupplierDeliveryStatus){
        this.orderSupplierDeliveryStatus = orderSupplierDeliveryStatus;
    }
    public boolean  isPurchaseOrderDeliveryProducts(){
        return this.purchaseOrderDeliveryProducts ;
    }
    public void  setPurchaseOrderDeliveryProducts(boolean purchaseOrderDeliveryProducts ){
        this.purchaseOrderDeliveryProducts  = purchaseOrderDeliveryProducts ;
    }
}
