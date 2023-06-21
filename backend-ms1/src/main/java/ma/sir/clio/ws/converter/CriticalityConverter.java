package  ma.sir.clio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.clio.zynerator.util.StringUtil;
import ma.sir.clio.zynerator.converter.AbstractConverter;
import ma.sir.clio.zynerator.util.DateUtil;
import ma.sir.clio.bean.history.CriticalityHistory;
import ma.sir.clio.bean.core.Criticality;
import ma.sir.clio.ws.dto.CriticalityDto;

@Component
public class CriticalityConverter extends AbstractConverter<Criticality, CriticalityDto, CriticalityHistory> {


    public  CriticalityConverter(){
        super(Criticality.class, CriticalityDto.class, CriticalityHistory.class);
    }

    @Override
    public Criticality toItem(CriticalityDto dto) {
        if (dto == null) {
            return null;
        } else {
        Criticality item = new Criticality();
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
    public CriticalityDto toDto(Criticality item) {
        if (item == null) {
            return null;
        } else {
            CriticalityDto dto = new CriticalityDto();
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
