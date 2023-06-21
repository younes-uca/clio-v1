package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.SupplierHistory;
import ma.sir.clio.bean.core.Supplier;
import ma.sir.clio.ws.dto.SupplierDto;

@Component
public class SupplierConverter extends AbstractConverter<Supplier, SupplierDto, SupplierHistory> {


    public  SupplierConverter(){
        super(Supplier.class, SupplierDto.class, SupplierHistory.class);
    }

    @Override
    public Supplier toItem(SupplierDto dto) {
        if (dto == null) {
            return null;
        } else {
        Supplier item = new Supplier();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());


        return item;
        }
    }

    @Override
    public SupplierDto toDto(Supplier item) {
        if (item == null) {
            return null;
        } else {
            SupplierDto dto = new SupplierDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());
            if(StringUtil.isNotEmpty(item.getEmail()))
                dto.setEmail(item.getEmail());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
