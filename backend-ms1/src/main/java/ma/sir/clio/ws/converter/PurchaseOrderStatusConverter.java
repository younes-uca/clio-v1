package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.PurchaseOrderStatusHistory;
import ma.sir.clio.bean.core.PurchaseOrderStatus;
import ma.sir.clio.ws.dto.PurchaseOrderStatusDto;

@Component
public class PurchaseOrderStatusConverter extends AbstractConverter<PurchaseOrderStatus, PurchaseOrderStatusDto, PurchaseOrderStatusHistory> {


    public  PurchaseOrderStatusConverter(){
        super(PurchaseOrderStatus.class, PurchaseOrderStatusDto.class, PurchaseOrderStatusHistory.class);
    }

    @Override
    public PurchaseOrderStatus toItem(PurchaseOrderStatusDto dto) {
        if (dto == null) {
            return null;
        } else {
        PurchaseOrderStatus item = new PurchaseOrderStatus();
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
    public PurchaseOrderStatusDto toDto(PurchaseOrderStatus item) {
        if (item == null) {
            return null;
        } else {
            PurchaseOrderStatusDto dto = new PurchaseOrderStatusDto();
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
