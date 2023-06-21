package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.StoreProductHistory;
import ma.sir.clio.bean.core.StoreProduct;
import ma.sir.clio.ws.dto.StoreProductDto;

@Component
public class StoreProductConverter extends AbstractConverter<StoreProduct, StoreProductDto, StoreProductHistory> {

    @Autowired
    private StoreConverter storeConverter ;
    @Autowired
    private ProductConverter productConverter ;
    private boolean store;
    private boolean product;

    public  StoreProductConverter(){
        super(StoreProduct.class, StoreProductDto.class, StoreProductHistory.class);
    }

    @Override
    public StoreProduct toItem(StoreProductDto dto) {
        if (dto == null) {
            return null;
        } else {
        StoreProduct item = new StoreProduct();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getQantity()))
                item.setQantity(dto.getQantity());
            if(this.store && dto.getStore()!=null)
                item.setStore(storeConverter.toItem(dto.getStore())) ;

            if(this.product && dto.getProduct()!=null)
                item.setProduct(productConverter.toItem(dto.getProduct())) ;



        return item;
        }
    }

    @Override
    public StoreProductDto toDto(StoreProduct item) {
        if (item == null) {
            return null;
        } else {
            StoreProductDto dto = new StoreProductDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getQantity()))
                dto.setQantity(item.getQantity());
        if(this.store && item.getStore()!=null) {
            dto.setStore(storeConverter.toDto(item.getStore())) ;
        }
        if(this.product && item.getProduct()!=null) {
            dto.setProduct(productConverter.toDto(item.getProduct())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.store = value;
        this.product = value;
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
    public boolean  isStore(){
        return this.store;
    }
    public void  setStore(boolean store){
        this.store = store;
    }
    public boolean  isProduct(){
        return this.product;
    }
    public void  setProduct(boolean product){
        this.product = product;
    }
}
