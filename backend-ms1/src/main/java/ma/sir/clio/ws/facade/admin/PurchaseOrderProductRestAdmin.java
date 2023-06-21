package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.PurchaseOrderProduct;
import ma.sir.clio.bean.history.PurchaseOrderProductHistory;
import ma.sir.clio.dao.criteria.core.PurchaseOrderProductCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderProductHistoryCriteria;
import ma.sir.clio.service.facade.admin.PurchaseOrderProductAdminService;
import ma.sir.clio.ws.converter.PurchaseOrderProductConverter;
import ma.sir.clio.ws.dto.PurchaseOrderProductDto;
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

@Api("Manages purchaseOrderProduct services")
@RestController
@RequestMapping("/api/admin/purchaseOrderProduct/")
public class PurchaseOrderProductRestAdmin  extends AbstractController<PurchaseOrderProduct, PurchaseOrderProductDto, PurchaseOrderProductHistory, PurchaseOrderProductCriteria, PurchaseOrderProductHistoryCriteria, PurchaseOrderProductAdminService, PurchaseOrderProductConverter> {



    @ApiOperation("upload one purchaseOrderProduct")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple purchaseOrderProducts")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all purchaseOrderProducts")
    @GetMapping("")
    public ResponseEntity<List<PurchaseOrderProductDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a purchaseOrderProduct by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PurchaseOrderProductDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  purchaseOrderProduct")
    @PostMapping("")
    public ResponseEntity<PurchaseOrderProductDto> save(@RequestBody PurchaseOrderProductDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  purchaseOrderProduct")
    @PutMapping("")
    public ResponseEntity<PurchaseOrderProductDto> update(@RequestBody PurchaseOrderProductDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of purchaseOrderProduct")
    @PostMapping("multiple")
    public ResponseEntity<List<PurchaseOrderProductDto>> delete(@RequestBody List<PurchaseOrderProductDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified purchaseOrderProduct")
    @DeleteMapping("")
    public ResponseEntity<PurchaseOrderProductDto> delete(@RequestBody PurchaseOrderProductDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified purchaseOrderProduct")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple purchaseOrderProducts by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by product id")
    @GetMapping("product/id/{id}")
    public List<PurchaseOrderProduct> findByProductId(@PathVariable Long id){
        return service.findByProductId(id);
    }
    @ApiOperation("delete by product id")
    @DeleteMapping("product/id/{id}")
    public int deleteByProductId(@PathVariable Long id){
        return service.deleteByProductId(id);
    }
    @ApiOperation("find by purchaseOrder id")
    @GetMapping("purchaseOrder/id/{id}")
    public List<PurchaseOrderProduct> findByPurchaseOrderId(@PathVariable Long id){
        return service.findByPurchaseOrderId(id);
    }
    @ApiOperation("delete by purchaseOrder id")
    @DeleteMapping("purchaseOrder/id/{id}")
    public int deleteByPurchaseOrderId(@PathVariable Long id){
        return service.deleteByPurchaseOrderId(id);
    }
    @ApiOperation("find by purchaseOrderProductStatus id")
    @GetMapping("purchaseOrderProductStatus/id/{id}")
    public List<PurchaseOrderProduct> findByPurchaseOrderProductStatusId(@PathVariable Long id){
        return service.findByPurchaseOrderProductStatusId(id);
    }
    @ApiOperation("delete by purchaseOrderProductStatus id")
    @DeleteMapping("purchaseOrderProductStatus/id/{id}")
    public int deleteByPurchaseOrderProductStatusId(@PathVariable Long id){
        return service.deleteByPurchaseOrderProductStatusId(id);
    }
    @ApiOperation("find by unitePrice id")
    @GetMapping("unitePrice/id/{id}")
    public List<PurchaseOrderProduct> findByUnitePriceId(@PathVariable Long id){
        return service.findByUnitePriceId(id);
    }
    @ApiOperation("delete by unitePrice id")
    @DeleteMapping("unitePrice/id/{id}")
    public int deleteByUnitePriceId(@PathVariable Long id){
        return service.deleteByUnitePriceId(id);
    }
    @ApiOperation("Finds purchaseOrderProducts by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PurchaseOrderProductDto>> findByCriteria(@RequestBody PurchaseOrderProductCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated purchaseOrderProducts by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PurchaseOrderProductCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseOrderProducts by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PurchaseOrderProductCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets purchaseOrderProduct data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PurchaseOrderProductCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets purchaseOrderProduct history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets purchaseOrderProduct paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PurchaseOrderProductHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseOrderProduct history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PurchaseOrderProductHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets purchaseOrderProduct history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PurchaseOrderProductHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PurchaseOrderProductRestAdmin (PurchaseOrderProductAdminService service, PurchaseOrderProductConverter converter) {
        super(service, converter);
    }


}