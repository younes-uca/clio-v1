package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.PurchaseRequestProductStatusHistory;
import ma.sir.clio.bean.core.PurchaseRequestProductStatus;
import ma.sir.clio.ws.dto.PurchaseRequestProductStatusDto;

@Component
public class PurchaseRequestProductStatusConverter extends AbstractConverter<PurchaseRequestProductStatus, PurchaseRequestProductStatusDto, PurchaseRequestProductStatusHistory> {


    public  PurchaseRequestProductStatusConverter(){
        super(PurchaseRequestProductStatus.class, PurchaseRequestProductStatusDto.class, PurchaseRequestProductStatusHistory.class);
    }

    @Override
    public PurchaseRequestProductStatus toItem(PurchaseRequestProductStatusDto dto) {
        if (dto == null) {
            return null;
        } else {
        PurchaseRequestProductStatus item = new PurchaseRequestProductStatus();
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
    public PurchaseRequestProductStatusDto toDto(PurchaseRequestProductStatus item) {
        if (item == null) {
            return null;
        } else {
            PurchaseRequestProductStatusDto dto = new PurchaseRequestProductStatusDto();
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
