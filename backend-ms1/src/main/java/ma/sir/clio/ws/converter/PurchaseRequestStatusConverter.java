package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.PurchaseRequestStatusHistory;
import ma.sir.clio.bean.core.PurchaseRequestStatus;
import ma.sir.clio.ws.dto.PurchaseRequestStatusDto;

@Component
public class PurchaseRequestStatusConverter extends AbstractConverter<PurchaseRequestStatus, PurchaseRequestStatusDto, PurchaseRequestStatusHistory> {


    public  PurchaseRequestStatusConverter(){
        super(PurchaseRequestStatus.class, PurchaseRequestStatusDto.class, PurchaseRequestStatusHistory.class);
    }

    @Override
    public PurchaseRequestStatus toItem(PurchaseRequestStatusDto dto) {
        if (dto == null) {
            return null;
        } else {
        PurchaseRequestStatus item = new PurchaseRequestStatus();
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
    public PurchaseRequestStatusDto toDto(PurchaseRequestStatus item) {
        if (item == null) {
            return null;
        } else {
            PurchaseRequestStatusDto dto = new PurchaseRequestStatusDto();
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
