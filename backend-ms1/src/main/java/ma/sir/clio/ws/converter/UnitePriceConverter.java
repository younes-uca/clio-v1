package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.UnitePriceHistory;
import ma.sir.clio.bean.core.UnitePrice;
import ma.sir.clio.ws.dto.UnitePriceDto;

@Component
public class UnitePriceConverter extends AbstractConverter<UnitePrice, UnitePriceDto, UnitePriceHistory> {


    public  UnitePriceConverter(){
        super(UnitePrice.class, UnitePriceDto.class, UnitePriceHistory.class);
    }

    @Override
    public UnitePrice toItem(UnitePriceDto dto) {
        if (dto == null) {
            return null;
        } else {
        UnitePrice item = new UnitePrice();
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
    public UnitePriceDto toDto(UnitePrice item) {
        if (item == null) {
            return null;
        } else {
            UnitePriceDto dto = new UnitePriceDto();
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
