package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.clio.zynerator.util.ListUtil;

import ma.sir.clio.bean.core.PurchaseRequest;

import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.PurchaseOrderHistory;
import ma.sir.clio.bean.core.PurchaseOrder;
import ma.sir.clio.ws.dto.PurchaseOrderDto;

@Component
public class PurchaseOrderConverter extends AbstractConverter<PurchaseOrder, PurchaseOrderDto, PurchaseOrderHistory> {

    @Autowired
    private PurchaserConverter purchaserConverter ;
    @Autowired
    private SupplierConverter supplierConverter ;
    @Autowired
    private UnitePriceConverter unitePriceConverter ;
    @Autowired
    private OrderSupplierTypeConverter orderSupplierTypeConverter ;
    @Autowired
    private ProductConverter productConverter ;
    @Autowired
    private CriticalityConverter criticalityConverter ;
    @Autowired
    private PurchaseRequestConverter purchaseRequestConverter ;
    @Autowired
    private PurchaseOrderStatusConverter purchaseOrderStatusConverter ;
    @Autowired
    private PurchaseOrderProductStatusConverter purchaseOrderProductStatusConverter ;
    @Autowired
    private CurrencyConverter currencyConverter ;
    @Autowired
    private PurchaseOrderProductConverter purchaseOrderProductConverter ;
    @Autowired
    private RecipientConverter recipientConverter ;
    private boolean orderSupplierType;
    private boolean criticality;
    private boolean supplier;
    private boolean recipient;
    private boolean purchaser;
    private boolean currency;
    private boolean purchaseOrderStatus;
    private boolean purchaseRequest;
    private boolean PurchaseOrderProducts;

    public  PurchaseOrderConverter(){
        super(PurchaseOrder.class, PurchaseOrderDto.class, PurchaseOrderHistory.class);
        init(true);
    }

    @Override
    public PurchaseOrder toItem(PurchaseOrderDto dto) {
        if (dto == null) {
            return null;
        } else {
        PurchaseOrder item = new PurchaseOrder();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRefrence()))
                item.setRefrence(dto.getRefrence());
            if(StringUtil.isNotEmpty(dto.getDateOrderSupplier()))
                item.setDateOrderSupplier(DateUtil.stringEnToDate(dto.getDateOrderSupplier()));
            if(StringUtil.isNotEmpty(dto.getTotal()))
                item.setTotal(dto.getTotal());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(this.orderSupplierType && dto.getOrderSupplierType()!=null)
                item.setOrderSupplierType(orderSupplierTypeConverter.toItem(dto.getOrderSupplierType())) ;

            if(this.criticality && dto.getCriticality()!=null)
                item.setCriticality(criticalityConverter.toItem(dto.getCriticality())) ;

            if(this.supplier && dto.getSupplier()!=null)
                item.setSupplier(supplierConverter.toItem(dto.getSupplier())) ;

            if(this.recipient && dto.getRecipient()!=null)
                item.setRecipient(recipientConverter.toItem(dto.getRecipient())) ;

            if(this.purchaser && dto.getPurchaser()!=null)
                item.setPurchaser(purchaserConverter.toItem(dto.getPurchaser())) ;

            if(this.currency && dto.getCurrency()!=null)
                item.setCurrency(currencyConverter.toItem(dto.getCurrency())) ;

            if(this.purchaseOrderStatus && dto.getPurchaseOrderStatus()!=null)
                item.setPurchaseOrderStatus(purchaseOrderStatusConverter.toItem(dto.getPurchaseOrderStatus())) ;

            if(dto.getPurchaseRequest() != null && dto.getPurchaseRequest().getId() != null){
                item.setPurchaseRequest(new PurchaseRequest());
                item.getPurchaseRequest().setId(dto.getPurchaseRequest().getId());
            }


            if(this.PurchaseOrderProducts && ListUtil.isNotEmpty(dto.getPurchaseOrderProducts()))
                item.setPurchaseOrderProducts(purchaseOrderProductConverter.toItem(dto.getPurchaseOrderProducts()));

        return item;
        }
    }

    @Override
    public PurchaseOrderDto toDto(PurchaseOrder item) {
        if (item == null) {
            return null;
        } else {
            PurchaseOrderDto dto = new PurchaseOrderDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRefrence()))
                dto.setRefrence(item.getRefrence());
            if(item.getDateOrderSupplier()!=null)
                dto.setDateOrderSupplier(DateUtil.dateTimeToString(item.getDateOrderSupplier()));
            if(StringUtil.isNotEmpty(item.getTotal()))
                dto.setTotal(item.getTotal());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.orderSupplierType && item.getOrderSupplierType()!=null) {
            dto.setOrderSupplierType(orderSupplierTypeConverter.toDto(item.getOrderSupplierType())) ;
        }
        if(this.criticality && item.getCriticality()!=null) {
            dto.setCriticality(criticalityConverter.toDto(item.getCriticality())) ;
        }
        if(this.supplier && item.getSupplier()!=null) {
            dto.setSupplier(supplierConverter.toDto(item.getSupplier())) ;
        }
        if(this.recipient && item.getRecipient()!=null) {
            dto.setRecipient(recipientConverter.toDto(item.getRecipient())) ;
        }
        if(this.purchaser && item.getPurchaser()!=null) {
            dto.setPurchaser(purchaserConverter.toDto(item.getPurchaser())) ;
        }
        if(this.currency && item.getCurrency()!=null) {
            dto.setCurrency(currencyConverter.toDto(item.getCurrency())) ;
        }
        if(this.purchaseOrderStatus && item.getPurchaseOrderStatus()!=null) {
            dto.setPurchaseOrderStatus(purchaseOrderStatusConverter.toDto(item.getPurchaseOrderStatus())) ;
        }
        if(this.purchaseRequest && item.getPurchaseRequest()!=null) {
            dto.setPurchaseRequest(purchaseRequestConverter.toDto(item.getPurchaseRequest())) ;
        }
        if(this.PurchaseOrderProducts && ListUtil.isNotEmpty(item.getPurchaseOrderProducts())){
            purchaseOrderProductConverter.init(true);
            purchaseOrderProductConverter.setPurchaseOrder(false);
            dto.setPurchaseOrderProducts(purchaseOrderProductConverter.toDto(item.getPurchaseOrderProducts()));
            purchaseOrderProductConverter.setPurchaseOrder(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.PurchaseOrderProducts = value;
    }

    public void initObject(boolean value) {
        this.orderSupplierType = value;
        this.criticality = value;
        this.supplier = value;
        this.recipient = value;
        this.purchaser = value;
        this.currency = value;
        this.purchaseOrderStatus = value;
        this.purchaseRequest = value;
    }


    public PurchaserConverter getPurchaserConverter(){
        return this.purchaserConverter;
    }
    public void setPurchaserConverter(PurchaserConverter purchaserConverter ){
        this.purchaserConverter = purchaserConverter;
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
    public OrderSupplierTypeConverter getOrderSupplierTypeConverter(){
        return this.orderSupplierTypeConverter;
    }
    public void setOrderSupplierTypeConverter(OrderSupplierTypeConverter orderSupplierTypeConverter ){
        this.orderSupplierTypeConverter = orderSupplierTypeConverter;
    }
    public ProductConverter getProductConverter(){
        return this.productConverter;
    }
    public void setProductConverter(ProductConverter productConverter ){
        this.productConverter = productConverter;
    }
    public CriticalityConverter getCriticalityConverter(){
        return this.criticalityConverter;
    }
    public void setCriticalityConverter(CriticalityConverter criticalityConverter ){
        this.criticalityConverter = criticalityConverter;
    }
    public PurchaseRequestConverter getPurchaseRequestConverter(){
        return this.purchaseRequestConverter;
    }
    public void setPurchaseRequestConverter(PurchaseRequestConverter purchaseRequestConverter ){
        this.purchaseRequestConverter = purchaseRequestConverter;
    }
    public PurchaseOrderStatusConverter getPurchaseOrderStatusConverter(){
        return this.purchaseOrderStatusConverter;
    }
    public void setPurchaseOrderStatusConverter(PurchaseOrderStatusConverter purchaseOrderStatusConverter ){
        this.purchaseOrderStatusConverter = purchaseOrderStatusConverter;
    }
    public PurchaseOrderProductStatusConverter getPurchaseOrderProductStatusConverter(){
        return this.purchaseOrderProductStatusConverter;
    }
    public void setPurchaseOrderProductStatusConverter(PurchaseOrderProductStatusConverter purchaseOrderProductStatusConverter ){
        this.purchaseOrderProductStatusConverter = purchaseOrderProductStatusConverter;
    }
    public CurrencyConverter getCurrencyConverter(){
        return this.currencyConverter;
    }
    public void setCurrencyConverter(CurrencyConverter currencyConverter ){
        this.currencyConverter = currencyConverter;
    }
    public PurchaseOrderProductConverter getPurchaseOrderProductConverter(){
        return this.purchaseOrderProductConverter;
    }
    public void setPurchaseOrderProductConverter(PurchaseOrderProductConverter purchaseOrderProductConverter ){
        this.purchaseOrderProductConverter = purchaseOrderProductConverter;
    }
    public RecipientConverter getRecipientConverter(){
        return this.recipientConverter;
    }
    public void setRecipientConverter(RecipientConverter recipientConverter ){
        this.recipientConverter = recipientConverter;
    }
    public boolean  isOrderSupplierType(){
        return this.orderSupplierType;
    }
    public void  setOrderSupplierType(boolean orderSupplierType){
        this.orderSupplierType = orderSupplierType;
    }
    public boolean  isCriticality(){
        return this.criticality;
    }
    public void  setCriticality(boolean criticality){
        this.criticality = criticality;
    }
    public boolean  isSupplier(){
        return this.supplier;
    }
    public void  setSupplier(boolean supplier){
        this.supplier = supplier;
    }
    public boolean  isRecipient(){
        return this.recipient;
    }
    public void  setRecipient(boolean recipient){
        this.recipient = recipient;
    }
    public boolean  isPurchaser(){
        return this.purchaser;
    }
    public void  setPurchaser(boolean purchaser){
        this.purchaser = purchaser;
    }
    public boolean  isCurrency(){
        return this.currency;
    }
    public void  setCurrency(boolean currency){
        this.currency = currency;
    }
    public boolean  isPurchaseOrderStatus(){
        return this.purchaseOrderStatus;
    }
    public void  setPurchaseOrderStatus(boolean purchaseOrderStatus){
        this.purchaseOrderStatus = purchaseOrderStatus;
    }
    public boolean  isPurchaseRequest(){
        return this.purchaseRequest;
    }
    public void  setPurchaseRequest(boolean purchaseRequest){
        this.purchaseRequest = purchaseRequest;
    }
    public boolean  isPurchaseOrderProducts(){
        return this.PurchaseOrderProducts ;
    }
    public void  setPurchaseOrderProducts(boolean PurchaseOrderProducts ){
        this.PurchaseOrderProducts  = PurchaseOrderProducts ;
    }
}
