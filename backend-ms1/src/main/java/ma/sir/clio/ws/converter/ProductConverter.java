package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.ProductHistory;
import ma.sir.clio.bean.core.Product;
import ma.sir.clio.ws.dto.ProductDto;

@Component
public class ProductConverter extends AbstractConverter<Product, ProductDto, ProductHistory> {

    @Autowired
    private ProductFamilyConverter productFamilyConverter ;
    private boolean productFamily;

    public  ProductConverter(){
        super(Product.class, ProductDto.class, ProductHistory.class);
    }

    @Override
    public Product toItem(ProductDto dto) {
        if (dto == null) {
            return null;
        } else {
        Product item = new Product();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getPartNumber()))
                item.setPartNumber(dto.getPartNumber());
            if(this.productFamily && dto.getProductFamily()!=null)
                item.setProductFamily(productFamilyConverter.toItem(dto.getProductFamily())) ;



        return item;
        }
    }

    @Override
    public ProductDto toDto(Product item) {
        if (item == null) {
            return null;
        } else {
            ProductDto dto = new ProductDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getPartNumber()))
                dto.setPartNumber(item.getPartNumber());
        if(this.productFamily && item.getProductFamily()!=null) {
            dto.setProductFamily(productFamilyConverter.toDto(item.getProductFamily())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.productFamily = value;
    }


    public ProductFamilyConverter getProductFamilyConverter(){
        return this.productFamilyConverter;
    }
    public void setProductFamilyConverter(ProductFamilyConverter productFamilyConverter ){
        this.productFamilyConverter = productFamilyConverter;
    }
    public boolean  isProductFamily(){
        return this.productFamily;
    }
    public void  setProductFamily(boolean productFamily){
        this.productFamily = productFamily;
    }
}
