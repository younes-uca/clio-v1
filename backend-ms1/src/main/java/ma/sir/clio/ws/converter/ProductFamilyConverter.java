package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.ProductFamilyHistory;
import ma.sir.clio.bean.core.ProductFamily;
import ma.sir.clio.ws.dto.ProductFamilyDto;

@Component
public class ProductFamilyConverter extends AbstractConverter<ProductFamily, ProductFamilyDto, ProductFamilyHistory> {


    public  ProductFamilyConverter(){
        super(ProductFamily.class, ProductFamilyDto.class, ProductFamilyHistory.class);
    }

    @Override
    public ProductFamily toItem(ProductFamilyDto dto) {
        if (dto == null) {
            return null;
        } else {
        ProductFamily item = new ProductFamily();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());


        return item;
        }
    }

    @Override
    public ProductFamilyDto toDto(ProductFamily item) {
        if (item == null) {
            return null;
        } else {
            ProductFamilyDto dto = new ProductFamilyDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
