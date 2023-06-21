package  ma.sir.clio.dao.criteria.core;


import ma.sir.clio.zynerator.criteria.BaseCriteria;
import java.util.List;

public class StoreCriteria extends  BaseCriteria  {

    private String libelle;
    private String libelleLike;
    private String code;
    private String codeLike;



    public StoreCriteria(){}

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }


}
