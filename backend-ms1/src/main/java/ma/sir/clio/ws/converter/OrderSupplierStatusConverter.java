package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.OrderSupplierStatusHistory;
import ma.sir.clio.bean.core.OrderSupplierStatus;
import ma.sir.clio.ws.dto.OrderSupplierStatusDto;

@Component
public class OrderSupplierStatusConverter extends AbstractConverter<OrderSupplierStatus, OrderSupplierStatusDto, OrderSupplierStatusHistory> {


    public  OrderSupplierStatusConverter(){
        super(OrderSupplierStatus.class, OrderSupplierStatusDto.class, OrderSupplierStatusHistory.class);
    }

    @Override
    public OrderSupplierStatus toItem(OrderSupplierStatusDto dto) {
        if (dto == null) {
            return null;
        } else {
        OrderSupplierStatus item = new OrderSupplierStatus();
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
    public OrderSupplierStatusDto toDto(OrderSupplierStatus item) {
        if (item == null) {
            return null;
        } else {
            OrderSupplierStatusDto dto = new OrderSupplierStatusDto();
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
