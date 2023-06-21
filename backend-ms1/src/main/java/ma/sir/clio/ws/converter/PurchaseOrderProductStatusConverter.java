package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.PurchaseOrderProductStatusHistory;
import ma.sir.clio.bean.core.PurchaseOrderProductStatus;
import ma.sir.clio.ws.dto.PurchaseOrderProductStatusDto;

@Component
public class PurchaseOrderProductStatusConverter extends AbstractConverter<PurchaseOrderProductStatus, PurchaseOrderProductStatusDto, PurchaseOrderProductStatusHistory> {


    public  PurchaseOrderProductStatusConverter(){
        super(PurchaseOrderProductStatus.class, PurchaseOrderProductStatusDto.class, PurchaseOrderProductStatusHistory.class);
    }

    @Override
    public PurchaseOrderProductStatus toItem(PurchaseOrderProductStatusDto dto) {
        if (dto == null) {
            return null;
        } else {
        PurchaseOrderProductStatus item = new PurchaseOrderProductStatus();
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
    public PurchaseOrderProductStatusDto toDto(PurchaseOrderProductStatus item) {
        if (item == null) {
            return null;
        } else {
            PurchaseOrderProductStatusDto dto = new PurchaseOrderProductStatusDto();
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
