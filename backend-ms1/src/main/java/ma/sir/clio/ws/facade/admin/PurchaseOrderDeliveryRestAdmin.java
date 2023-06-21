package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.PurchaseOrderDelivery;
import ma.sir.clio.bean.history.PurchaseOrderDeliveryHistory;
import ma.sir.clio.dao.criteria.core.PurchaseOrderDeliveryCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderDeliveryHistoryCriteria;
import ma.sir.clio.service.facade.admin.PurchaseOrderDeliveryAdminService;
import ma.sir.clio.ws.converter.PurchaseOrderDeliveryConverter;
import ma.sir.clio.ws.dto.PurchaseOrderDeliveryDto;
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

@Api("Manages purchaseOrderDelivery services")
@RestController
@RequestMapping("/api/admin/purchaseOrderDelivery/")
public class PurchaseOrderDeliveryRestAdmin  extends AbstractController<PurchaseOrderDelivery, PurchaseOrderDeliveryDto, PurchaseOrderDeliveryHistory, PurchaseOrderDeliveryCriteria, PurchaseOrderDeliveryHistoryCriteria, PurchaseOrderDeliveryAdminService, PurchaseOrderDeliveryConverter> {



    @ApiOperation("upload one purchaseOrderDelivery")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple purchaseOrderDeliverys")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all purchaseOrderDeliverys")
    @GetMapping("")
    public ResponseEntity<List<PurchaseOrderDeliveryDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a purchaseOrderDelivery by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PurchaseOrderDeliveryDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  purchaseOrderDelivery")
    @PostMapping("")
    public ResponseEntity<PurchaseOrderDeliveryDto> save(@RequestBody PurchaseOrderDeliveryDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  purchaseOrderDelivery")
    @PutMapping("")
    public ResponseEntity<PurchaseOrderDeliveryDto> update(@RequestBody PurchaseOrderDeliveryDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of purchaseOrderDelivery")
    @PostMapping("multiple")
    public ResponseEntity<List<PurchaseOrderDeliveryDto>> delete(@RequestBody List<PurchaseOrderDeliveryDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified purchaseOrderDelivery")
    @DeleteMapping("")
    public ResponseEntity<PurchaseOrderDeliveryDto> delete(@RequestBody PurchaseOrderDeliveryDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified purchaseOrderDelivery")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple purchaseOrderDeliverys by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by purchaseOrder id")
    @GetMapping("purchaseOrder/id/{id}")
    public List<PurchaseOrderDelivery> findByPurchaseOrderId(@PathVariable Long id){
        return service.findByPurchaseOrderId(id);
    }
    @ApiOperation("delete by purchaseOrder id")
    @DeleteMapping("purchaseOrder/id/{id}")
    public int deleteByPurchaseOrderId(@PathVariable Long id){
        return service.deleteByPurchaseOrderId(id);
    }
    @ApiOperation("find by orderSupplierStatus id")
    @GetMapping("orderSupplierStatus/id/{id}")
    public List<PurchaseOrderDelivery> findByOrderSupplierStatusId(@PathVariable Long id){
        return service.findByOrderSupplierStatusId(id);
    }
    @ApiOperation("delete by orderSupplierStatus id")
    @DeleteMapping("orderSupplierStatus/id/{id}")
    public int deleteByOrderSupplierStatusId(@PathVariable Long id){
        return service.deleteByOrderSupplierStatusId(id);
    }
    @ApiOperation("find by purchaser id")
    @GetMapping("purchaser/id/{id}")
    public List<PurchaseOrderDelivery> findByPurchaserId(@PathVariable Long id){
        return service.findByPurchaserId(id);
    }
    @ApiOperation("delete by purchaser id")
    @DeleteMapping("purchaser/id/{id}")
    public int deleteByPurchaserId(@PathVariable Long id){
        return service.deleteByPurchaserId(id);
    }
    @ApiOperation("find by orderSupplierDeliveryStatus id")
    @GetMapping("orderSupplierDeliveryStatus/id/{id}")
    public List<PurchaseOrderDelivery> findByOrderSupplierDeliveryStatusId(@PathVariable Long id){
        return service.findByOrderSupplierDeliveryStatusId(id);
    }
    @ApiOperation("delete by orderSupplierDeliveryStatus id")
    @DeleteMapping("orderSupplierDeliveryStatus/id/{id}")
    public int deleteByOrderSupplierDeliveryStatusId(@PathVariable Long id){
        return service.deleteByOrderSupplierDeliveryStatusId(id);
    }
    @ApiOperation("Finds a purchaseOrderDelivery and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<PurchaseOrderDeliveryDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds purchaseOrderDeliverys by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PurchaseOrderDeliveryDto>> findByCriteria(@RequestBody PurchaseOrderDeliveryCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated purchaseOrderDeliverys by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PurchaseOrderDeliveryCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseOrderDeliverys by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PurchaseOrderDeliveryCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets purchaseOrderDelivery data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PurchaseOrderDeliveryCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets purchaseOrderDelivery history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets purchaseOrderDelivery paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PurchaseOrderDeliveryHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseOrderDelivery history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PurchaseOrderDeliveryHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets purchaseOrderDelivery history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PurchaseOrderDeliveryHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PurchaseOrderDeliveryRestAdmin (PurchaseOrderDeliveryAdminService service, PurchaseOrderDeliveryConverter converter) {
        super(service, converter);
    }


}