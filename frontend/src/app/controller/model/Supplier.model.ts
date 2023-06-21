import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class SupplierDto  extends BaseDto{

    public id: number;
    public nom: string;
    public prenom: string;
    public reference: string;
    public email: string;

}
