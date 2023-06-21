package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.PurchaseRequestProduct;
import ma.sir.clio.bean.history.PurchaseRequestProductHistory;
import ma.sir.clio.dao.criteria.core.PurchaseRequestProductCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseRequestProductHistoryCriteria;
import ma.sir.clio.service.facade.admin.PurchaseRequestProductAdminService;
import ma.sir.clio.ws.converter.PurchaseRequestProductConverter;
import ma.sir.clio.ws.dto.PurchaseRequestProductDto;
import ma.sir.clio.zynerator.controller.AbstractController;
import ma.sir.clio.zynerator.dto.AuditEntityDto;
import ma.sir.clio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.clio.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.sir.clio.zynerator.dto.FileTempDto;

@Api("Manages purchaseRequestProduct services")
@RestController
@RequestMapping("/api/admin/purchaseRequestProduct/")
public class PurchaseRequestProductRestAdmin  extends AbstractController<PurchaseRequestProduct, PurchaseRequestProductDto, PurchaseRequestProductHistory, PurchaseRequestProductCriteria, PurchaseRequestProductHistoryCriteria, PurchaseRequestProductAdminService, PurchaseRequestProductConverter> {



    @ApiOperation("upload one purchaseRequestProduct")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple purchaseRequestProducts")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all purchaseRequestProducts")
    @GetMapping("")
    public ResponseEntity<List<PurchaseRequestProductDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a purchaseRequestProduct by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PurchaseRequestProductDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  purchaseRequestProduct")
    @PostMapping("")
    public ResponseEntity<PurchaseRequestProductDto> save(@RequestBody PurchaseRequestProductDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  purchaseRequestProduct")
    @PutMapping("")
    public ResponseEntity<PurchaseRequestProductDto> update(@RequestBody PurchaseRequestProductDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of purchaseRequestProduct")
    @PostMapping("multiple")
    public ResponseEntity<List<PurchaseRequestProductDto>> delete(@RequestBody List<PurchaseRequestProductDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified purchaseRequestProduct")
    @DeleteMapping("")
    public ResponseEntity<PurchaseRequestProductDto> delete(@RequestBody PurchaseRequestProductDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified purchaseRequestProduct")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple purchaseRequestProducts by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by product id")
    @GetMapping("product/id/{id}")
    public List<PurchaseRequestProduct> findByProductId(@PathVariable Long id){
        return service.findByProductId(id);
    }
    @ApiOperation("delete by product id")
    @DeleteMapping("product/id/{id}")
    public int deleteByProductId(@PathVariable Long id){
        return service.deleteByProductId(id);
    }
    @ApiOperation("find by purchaseRequest id")
    @GetMapping("purchaseRequest/id/{id}")
    public List<PurchaseRequestProduct> findByPurchaseRequestId(@PathVariable Long id){
        return service.findByPurchaseRequestId(id);
    }
    @ApiOperation("delete by purchaseRequest id")
    @DeleteMapping("purchaseRequest/id/{id}")
    public int deleteByPurchaseRequestId(@PathVariable Long id){
        return service.deleteByPurchaseRequestId(id);
    }
    @ApiOperation("find by unitePrice id")
    @GetMapping("unitePrice/id/{id}")
    public List<PurchaseRequestProduct> findByUnitePriceId(@PathVariable Long id){
        return service.findByUnitePriceId(id);
    }
    @ApiOperation("delete by unitePrice id")
    @DeleteMapping("unitePrice/id/{id}")
    public int deleteByUnitePriceId(@PathVariable Long id){
        return service.deleteByUnitePriceId(id);
    }
    @ApiOperation("find by purchaseRequestProductStatus id")
    @GetMapping("purchaseRequestProductStatus/id/{id}")
    public List<PurchaseRequestProduct> findByPurchaseRequestProductStatusId(@PathVariable Long id){
        return service.findByPurchaseRequestProductStatusId(id);
    }
    @ApiOperation("delete by purchaseRequestProductStatus id")
    @DeleteMapping("purchaseRequestProductStatus/id/{id}")
    public int deleteByPurchaseRequestProductStatusId(@PathVariable Long id){
        return service.deleteByPurchaseRequestProductStatusId(id);
    }
    @ApiOperation("Finds purchaseRequestProducts by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PurchaseRequestProductDto>> findByCriteria(@RequestBody PurchaseRequestProductCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated purchaseRequestProducts by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PurchaseRequestProductCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseRequestProducts by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PurchaseRequestProductCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets purchaseRequestProduct data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PurchaseRequestProductCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets purchaseRequestProduct history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets purchaseRequestProduct paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PurchaseRequestProductHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseRequestProduct history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PurchaseRequestProductHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets purchaseRequestProduct history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PurchaseRequestProductHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PurchaseRequestProductRestAdmin (PurchaseRequestProductAdminService service, PurchaseRequestProductConverter converter) {
        super(service, converter);
    }


}