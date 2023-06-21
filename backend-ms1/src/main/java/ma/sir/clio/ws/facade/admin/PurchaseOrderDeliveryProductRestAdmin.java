package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.PurchaseOrderDeliveryProduct;
import ma.sir.clio.bean.history.PurchaseOrderDeliveryProductHistory;
import ma.sir.clio.dao.criteria.core.PurchaseOrderDeliveryProductCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderDeliveryProductHistoryCriteria;
import ma.sir.clio.service.facade.admin.PurchaseOrderDeliveryProductAdminService;
import ma.sir.clio.ws.converter.PurchaseOrderDeliveryProductConverter;
import ma.sir.clio.ws.dto.PurchaseOrderDeliveryProductDto;
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

@Api("Manages purchaseOrderDeliveryProduct services")
@RestController
@RequestMapping("/api/admin/purchaseOrderDeliveryProduct/")
public class PurchaseOrderDeliveryProductRestAdmin  extends AbstractController<PurchaseOrderDeliveryProduct, PurchaseOrderDeliveryProductDto, PurchaseOrderDeliveryProductHistory, PurchaseOrderDeliveryProductCriteria, PurchaseOrderDeliveryProductHistoryCriteria, PurchaseOrderDeliveryProductAdminService, PurchaseOrderDeliveryProductConverter> {



    @ApiOperation("upload one purchaseOrderDeliveryProduct")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple purchaseOrderDeliveryProducts")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all purchaseOrderDeliveryProducts")
    @GetMapping("")
    public ResponseEntity<List<PurchaseOrderDeliveryProductDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a purchaseOrderDeliveryProduct by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PurchaseOrderDeliveryProductDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  purchaseOrderDeliveryProduct")
    @PostMapping("")
    public ResponseEntity<PurchaseOrderDeliveryProductDto> save(@RequestBody PurchaseOrderDeliveryProductDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  purchaseOrderDeliveryProduct")
    @PutMapping("")
    public ResponseEntity<PurchaseOrderDeliveryProductDto> update(@RequestBody PurchaseOrderDeliveryProductDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of purchaseOrderDeliveryProduct")
    @PostMapping("multiple")
    public ResponseEntity<List<PurchaseOrderDeliveryProductDto>> delete(@RequestBody List<PurchaseOrderDeliveryProductDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified purchaseOrderDeliveryProduct")
    @DeleteMapping("")
    public ResponseEntity<PurchaseOrderDeliveryProductDto> delete(@RequestBody PurchaseOrderDeliveryProductDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified purchaseOrderDeliveryProduct")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple purchaseOrderDeliveryProducts by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by product id")
    @GetMapping("product/id/{id}")
    public List<PurchaseOrderDeliveryProduct> findByProductId(@PathVariable Long id){
        return service.findByProductId(id);
    }
    @ApiOperation("delete by product id")
    @DeleteMapping("product/id/{id}")
    public int deleteByProductId(@PathVariable Long id){
        return service.deleteByProductId(id);
    }
    @ApiOperation("find by purchaseOrderDelivery id")
    @GetMapping("purchaseOrderDelivery/id/{id}")
    public List<PurchaseOrderDeliveryProduct> findByPurchaseOrderDeliveryId(@PathVariable Long id){
        return service.findByPurchaseOrderDeliveryId(id);
    }
    @ApiOperation("delete by purchaseOrderDelivery id")
    @DeleteMapping("purchaseOrderDelivery/id/{id}")
    public int deleteByPurchaseOrderDeliveryId(@PathVariable Long id){
        return service.deleteByPurchaseOrderDeliveryId(id);
    }
    @ApiOperation("find by store id")
    @GetMapping("store/id/{id}")
    public List<PurchaseOrderDeliveryProduct> findByStoreId(@PathVariable Long id){
        return service.findByStoreId(id);
    }
    @ApiOperation("delete by store id")
    @DeleteMapping("store/id/{id}")
    public int deleteByStoreId(@PathVariable Long id){
        return service.deleteByStoreId(id);
    }
    @ApiOperation("Finds purchaseOrderDeliveryProducts by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PurchaseOrderDeliveryProductDto>> findByCriteria(@RequestBody PurchaseOrderDeliveryProductCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated purchaseOrderDeliveryProducts by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PurchaseOrderDeliveryProductCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseOrderDeliveryProducts by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PurchaseOrderDeliveryProductCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets purchaseOrderDeliveryProduct data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PurchaseOrderDeliveryProductCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets purchaseOrderDeliveryProduct history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets purchaseOrderDeliveryProduct paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PurchaseOrderDeliveryProductHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseOrderDeliveryProduct history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PurchaseOrderDeliveryProductHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets purchaseOrderDeliveryProduct history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PurchaseOrderDeliveryProductHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PurchaseOrderDeliveryProductRestAdmin (PurchaseOrderDeliveryProductAdminService service, PurchaseOrderDeliveryProductConverter converter) {
        super(service, converter);
    }


}