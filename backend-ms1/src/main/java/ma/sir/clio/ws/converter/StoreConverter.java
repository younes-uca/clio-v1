package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.StoreHistory;
import ma.sir.clio.bean.core.Store;
import ma.sir.clio.ws.dto.StoreDto;

@Component
public class StoreConverter extends AbstractConverter<Store, StoreDto, StoreHistory> {


    public  StoreConverter(){
        super(Store.class, StoreDto.class, StoreHistory.class);
    }

    @Override
    public Store toItem(StoreDto dto) {
        if (dto == null) {
            return null;
        } else {
        Store item = new Store();
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
    public StoreDto toDto(Store item) {
        if (item == null) {
            return null;
        } else {
            StoreDto dto = new StoreDto();
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
