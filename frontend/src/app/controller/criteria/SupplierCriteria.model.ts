import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class SupplierCriteria  extends   BaseCriteria  {

    public id: number;
    public nom: string;
    public nomLike: string;
    public prenom: string;
    public prenomLike: string;
    public reference: string;
    public referenceLike: string;
    public email: string;
    public emailLike: string;

}
