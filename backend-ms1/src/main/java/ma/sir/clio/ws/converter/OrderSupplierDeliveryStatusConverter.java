package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.OrderSupplierDeliveryStatusHistory;
import ma.sir.clio.bean.core.OrderSupplierDeliveryStatus;
import ma.sir.clio.ws.dto.OrderSupplierDeliveryStatusDto;

@Component
public class OrderSupplierDeliveryStatusConverter extends AbstractConverter<OrderSupplierDeliveryStatus, OrderSupplierDeliveryStatusDto, OrderSupplierDeliveryStatusHistory> {


    public  OrderSupplierDeliveryStatusConverter(){
        super(OrderSupplierDeliveryStatus.class, OrderSupplierDeliveryStatusDto.class, OrderSupplierDeliveryStatusHistory.class);
    }

    @Override
    public OrderSupplierDeliveryStatus toItem(OrderSupplierDeliveryStatusDto dto) {
        if (dto == null) {
            return null;
        } else {
        OrderSupplierDeliveryStatus item = new OrderSupplierDeliveryStatus();
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
    public OrderSupplierDeliveryStatusDto toDto(OrderSupplierDeliveryStatus item) {
        if (item == null) {
            return null;
        } else {
            OrderSupplierDeliveryStatusDto dto = new OrderSupplierDeliveryStatusDto();
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
