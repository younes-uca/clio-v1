package  ma.sir.clio.dao.criteria.core;


import ma.sir.clio.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class PurchaseOrderDeliveryCriteria extends  BaseCriteria  {

    private String total;
    private String totalMin;
    private String totalMax;
    private String description;
    private String descriptionLike;
    private LocalDateTime dateDelivery;
    private LocalDateTime dateDeliveryFrom;
    private LocalDateTime dateDeliveryTo;
    private LocalDateTime invoiceAck;
    private LocalDateTime invoiceAckFrom;
    private LocalDateTime invoiceAckTo;
    private String invoiceAckNumber;
    private String invoiceAckNumberLike;
    private String invoicePrNumber;
    private String invoicePrNumberLike;
    private LocalDateTime invoiceDate;
    private LocalDateTime invoiceDateFrom;
    private LocalDateTime invoiceDateTo;
    private LocalDateTime invoiceAckDelivery;
    private LocalDateTime invoiceAckDeliveryFrom;
    private LocalDateTime invoiceAckDeliveryTo;
    private String descriptionInvoice;
    private String descriptionInvoiceLike;
    private String invoiceNumber;
    private String invoiceNumberLike;

    private PurchaseOrderCriteria purchaseOrder ;
    private List<PurchaseOrderCriteria> purchaseOrders ;
    private OrderSupplierStatusCriteria orderSupplierStatus ;
    private List<OrderSupplierStatusCriteria> orderSupplierStatuss ;
    private PurchaserCriteria purchaser ;
    private List<PurchaserCriteria> purchasers ;
    private OrderSupplierDeliveryStatusCriteria orderSupplierDeliveryStatus ;
    private List<OrderSupplierDeliveryStatusCriteria> orderSupplierDeliveryStatuss ;


    public PurchaseOrderDeliveryCriteria(){}

    public String getTotal(){
        return this.total;
    }
    public void setTotal(String total){
        this.total = total;
    }   
    public String getTotalMin(){
        return this.totalMin;
    }
    public void setTotalMin(String totalMin){
        this.totalMin = totalMin;
    }
    public String getTotalMax(){
        return this.totalMax;
    }
    public void setTotalMax(String totalMax){
        this.totalMax = totalMax;
    }
      
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
    }

    public LocalDateTime getDateDelivery(){
        return this.dateDelivery;
    }
    public void setDateDelivery(LocalDateTime dateDelivery){
        this.dateDelivery = dateDelivery;
    }
    public LocalDateTime getDateDeliveryFrom(){
        return this.dateDeliveryFrom;
    }
    public void setDateDeliveryFrom(LocalDateTime dateDeliveryFrom){
        this.dateDeliveryFrom = dateDeliveryFrom;
    }
    public LocalDateTime getDateDeliveryTo(){
        return this.dateDeliveryTo;
    }
    public void setDateDeliveryTo(LocalDateTime dateDeliveryTo){
        this.dateDeliveryTo = dateDeliveryTo;
    }
    public LocalDateTime getInvoiceAck(){
        return this.invoiceAck;
    }
    public void setInvoiceAck(LocalDateTime invoiceAck){
        this.invoiceAck = invoiceAck;
    }
    public LocalDateTime getInvoiceAckFrom(){
        return this.invoiceAckFrom;
    }
    public void setInvoiceAckFrom(LocalDateTime invoiceAckFrom){
        this.invoiceAckFrom = invoiceAckFrom;
    }
    public LocalDateTime getInvoiceAckTo(){
        return this.invoiceAckTo;
    }
    public void setInvoiceAckTo(LocalDateTime invoiceAckTo){
        this.invoiceAckTo = invoiceAckTo;
    }
    public String getInvoiceAckNumber(){
        return this.invoiceAckNumber;
    }
    public void setInvoiceAckNumber(String invoiceAckNumber){
        this.invoiceAckNumber = invoiceAckNumber;
    }
    public String getInvoiceAckNumberLike(){
        return this.invoiceAckNumberLike;
    }
    public void setInvoiceAckNumberLike(String invoiceAckNumberLike){
        this.invoiceAckNumberLike = invoiceAckNumberLike;
    }

    public String getInvoicePrNumber(){
        return this.invoicePrNumber;
    }
    public void setInvoicePrNumber(String invoicePrNumber){
        this.invoicePrNumber = invoicePrNumber;
    }
    public String getInvoicePrNumberLike(){
        return this.invoicePrNumberLike;
    }
    public void setInvoicePrNumberLike(String invoicePrNumberLike){
        this.invoicePrNumberLike = invoicePrNumberLike;
    }

    public LocalDateTime getInvoiceDate(){
        return this.invoiceDate;
    }
    public void setInvoiceDate(LocalDateTime invoiceDate){
        this.invoiceDate = invoiceDate;
    }
    public LocalDateTime getInvoiceDateFrom(){
        return this.invoiceDateFrom;
    }
    public void setInvoiceDateFrom(LocalDateTime invoiceDateFrom){
        this.invoiceDateFrom = invoiceDateFrom;
    }
    public LocalDateTime getInvoiceDateTo(){
        return this.invoiceDateTo;
    }
    public void setInvoiceDateTo(LocalDateTime invoiceDateTo){
        this.invoiceDateTo = invoiceDateTo;
    }
    public LocalDateTime getInvoiceAckDelivery(){
        return this.invoiceAckDelivery;
    }
    public void setInvoiceAckDelivery(LocalDateTime invoiceAckDelivery){
        this.invoiceAckDelivery = invoiceAckDelivery;
    }
    public LocalDateTime getInvoiceAckDeliveryFrom(){
        return this.invoiceAckDeliveryFrom;
    }
    public void setInvoiceAckDeliveryFrom(LocalDateTime invoiceAckDeliveryFrom){
        this.invoiceAckDeliveryFrom = invoiceAckDeliveryFrom;
    }
    public LocalDateTime getInvoiceAckDeliveryTo(){
        return this.invoiceAckDeliveryTo;
    }
    public void setInvoiceAckDeliveryTo(LocalDateTime invoiceAckDeliveryTo){
        this.invoiceAckDeliveryTo = invoiceAckDeliveryTo;
    }
    public String getDescriptionInvoice(){
        return this.descriptionInvoice;
    }
    public void setDescriptionInvoice(String descriptionInvoice){
        this.descriptionInvoice = descriptionInvoice;
    }
    public String getDescriptionInvoiceLike(){
        return this.descriptionInvoiceLike;
    }
    public void setDescriptionInvoiceLike(String descriptionInvoiceLike){
        this.descriptionInvoiceLike = descriptionInvoiceLike;
    }

    public String getInvoiceNumber(){
        return this.invoiceNumber;
    }
    public void setInvoiceNumber(String invoiceNumber){
        this.invoiceNumber = invoiceNumber;
    }
    public String getInvoiceNumberLike(){
        return this.invoiceNumberLike;
    }
    public void setInvoiceNumberLike(String invoiceNumberLike){
        this.invoiceNumberLike = invoiceNumberLike;
    }


    public PurchaseOrderCriteria getPurchaseOrder(){
        return this.purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrderCriteria purchaseOrder){
        this.purchaseOrder = purchaseOrder;
    }
    public List<PurchaseOrderCriteria> getPurchaseOrders(){
        return this.purchaseOrders;
    }

    public void setPurchaseOrders(List<PurchaseOrderCriteria> purchaseOrders){
        this.purchaseOrders = purchaseOrders;
    }
    public OrderSupplierStatusCriteria getOrderSupplierStatus(){
        return this.orderSupplierStatus;
    }

    public void setOrderSupplierStatus(OrderSupplierStatusCriteria orderSupplierStatus){
        this.orderSupplierStatus = orderSupplierStatus;
    }
    public List<OrderSupplierStatusCriteria> getOrderSupplierStatuss(){
        return this.orderSupplierStatuss;
    }

    public void setOrderSupplierStatuss(List<OrderSupplierStatusCriteria> orderSupplierStatuss){
        this.orderSupplierStatuss = orderSupplierStatuss;
    }
    public PurchaserCriteria getPurchaser(){
        return this.purchaser;
    }

    public void setPurchaser(PurchaserCriteria purchaser){
        this.purchaser = purchaser;
    }
    public List<PurchaserCriteria> getPurchasers(){
        return this.purchasers;
    }

    public void setPurchasers(List<PurchaserCriteria> purchasers){
        this.purchasers = purchasers;
    }
    public OrderSupplierDeliveryStatusCriteria getOrderSupplierDeliveryStatus(){
        return this.orderSupplierDeliveryStatus;
    }

    public void setOrderSupplierDeliveryStatus(OrderSupplierDeliveryStatusCriteria orderSupplierDeliveryStatus){
        this.orderSupplierDeliveryStatus = orderSupplierDeliveryStatus;
    }
    public List<OrderSupplierDeliveryStatusCriteria> getOrderSupplierDeliveryStatuss(){
        return this.orderSupplierDeliveryStatuss;
    }

    public void setOrderSupplierDeliveryStatuss(List<OrderSupplierDeliveryStatusCriteria> orderSupplierDeliveryStatuss){
        this.orderSupplierDeliveryStatuss = orderSupplierDeliveryStatuss;
    }
}
