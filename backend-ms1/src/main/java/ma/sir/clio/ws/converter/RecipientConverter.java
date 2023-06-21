package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.RecipientHistory;
import ma.sir.clio.bean.core.Recipient;
import ma.sir.clio.ws.dto.RecipientDto;

@Component
public class RecipientConverter extends AbstractConverter<Recipient, RecipientDto, RecipientHistory> {


    public  RecipientConverter(){
        super(Recipient.class, RecipientDto.class, RecipientHistory.class);
    }

    @Override
    public Recipient toItem(RecipientDto dto) {
        if (dto == null) {
            return null;
        } else {
        Recipient item = new Recipient();
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
    public RecipientDto toDto(Recipient item) {
        if (item == null) {
            return null;
        } else {
            RecipientDto dto = new RecipientDto();
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
