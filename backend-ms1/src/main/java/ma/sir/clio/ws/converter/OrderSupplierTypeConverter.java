package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.OrderSupplierTypeHistory;
import ma.sir.clio.bean.core.OrderSupplierType;
import ma.sir.clio.ws.dto.OrderSupplierTypeDto;

@Component
public class OrderSupplierTypeConverter extends AbstractConverter<OrderSupplierType, OrderSupplierTypeDto, OrderSupplierTypeHistory> {


    public  OrderSupplierTypeConverter(){
        super(OrderSupplierType.class, OrderSupplierTypeDto.class, OrderSupplierTypeHistory.class);
    }

    @Override
    public OrderSupplierType toItem(OrderSupplierTypeDto dto) {
        if (dto == null) {
            return null;
        } else {
        OrderSupplierType item = new OrderSupplierType();
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
    public OrderSupplierTypeDto toDto(OrderSupplierType item) {
        if (item == null) {
            return null;
        } else {
            OrderSupplierTypeDto dto = new OrderSupplierTypeDto();
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
