package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.PurchaserHistory;
import ma.sir.clio.bean.core.Purchaser;
import ma.sir.clio.ws.dto.PurchaserDto;

@Component
public class PurchaserConverter extends AbstractConverter<Purchaser, PurchaserDto, PurchaserHistory> {


    public  PurchaserConverter(){
        super(Purchaser.class, PurchaserDto.class, PurchaserHistory.class);
    }

    @Override
    public Purchaser toItem(PurchaserDto dto) {
        if (dto == null) {
            return null;
        } else {
        Purchaser item = new Purchaser();
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
    public PurchaserDto toDto(Purchaser item) {
        if (item == null) {
            return null;
        } else {
            PurchaserDto dto = new PurchaserDto();
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
