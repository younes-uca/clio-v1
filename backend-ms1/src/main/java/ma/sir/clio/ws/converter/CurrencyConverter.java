package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.CurrencyHistory;
import ma.sir.clio.bean.core.Currency;
import ma.sir.clio.ws.dto.CurrencyDto;

@Component
public class CurrencyConverter extends AbstractConverter<Currency, CurrencyDto, CurrencyHistory> {


    public  CurrencyConverter(){
        super(Currency.class, CurrencyDto.class, CurrencyHistory.class);
    }

    @Override
    public Currency toItem(CurrencyDto dto) {
        if (dto == null) {
            return null;
        } else {
        Currency item = new Currency();
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
    public CurrencyDto toDto(Currency item) {
        if (item == null) {
            return null;
        } else {
            CurrencyDto dto = new CurrencyDto();
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
