import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class PurchaseOrderProductStatusDto  extends BaseDto{

    public id: number;
    public libelle: string;
    public code: string;

}
