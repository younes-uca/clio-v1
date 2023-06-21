import {ProductFamilyDto} from './ProductFamily.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class ProductDto  extends BaseDto{

    public id: number;
    public partNumber: string;
    public productFamily: ProductFamilyDto ;

}
