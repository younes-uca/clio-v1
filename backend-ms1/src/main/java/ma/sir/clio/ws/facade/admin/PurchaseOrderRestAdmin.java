package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.PurchaseOrder;
import ma.sir.clio.bean.history.PurchaseOrderHistory;
import ma.sir.clio.dao.criteria.core.PurchaseOrderCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderHistoryCriteria;
import ma.sir.clio.service.facade.admin.PurchaseOrderAdminService;
import ma.sir.clio.ws.converter.PurchaseOrderConverter;
import ma.sir.clio.ws.dto.PurchaseOrderDto;
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

@Api("Manages purchaseOrder services")
@RestController
@RequestMapping("/api/admin/purchaseOrder/")
public class PurchaseOrderRestAdmin  extends AbstractController<PurchaseOrder, PurchaseOrderDto, PurchaseOrderHistory, PurchaseOrderCriteria, PurchaseOrderHistoryCriteria, PurchaseOrderAdminService, PurchaseOrderConverter> {



    @ApiOperation("upload one purchaseOrder")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple purchaseOrders")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all purchaseOrders")
    @GetMapping("")
    public ResponseEntity<List<PurchaseOrderDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all purchaseOrders")
    @GetMapping("optimized")
    public ResponseEntity<List<PurchaseOrderDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a purchaseOrder by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PurchaseOrderDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  purchaseOrder")
    @PostMapping("")
    public ResponseEntity<PurchaseOrderDto> save(@RequestBody PurchaseOrderDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  purchaseOrder")
    @PutMapping("")
    public ResponseEntity<PurchaseOrderDto> update(@RequestBody PurchaseOrderDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of purchaseOrder")
    @PostMapping("multiple")
    public ResponseEntity<List<PurchaseOrderDto>> delete(@RequestBody List<PurchaseOrderDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified purchaseOrder")
    @DeleteMapping("")
    public ResponseEntity<PurchaseOrderDto> delete(@RequestBody PurchaseOrderDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified purchaseOrder")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple purchaseOrders by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by orderSupplierType id")
    @GetMapping("orderSupplierType/id/{id}")
    public List<PurchaseOrder> findByOrderSupplierTypeId(@PathVariable Long id){
        return service.findByOrderSupplierTypeId(id);
    }
    @ApiOperation("delete by orderSupplierType id")
    @DeleteMapping("orderSupplierType/id/{id}")
    public int deleteByOrderSupplierTypeId(@PathVariable Long id){
        return service.deleteByOrderSupplierTypeId(id);
    }
    @ApiOperation("find by criticality id")
    @GetMapping("criticality/id/{id}")
    public List<PurchaseOrder> findByCriticalityId(@PathVariable Long id){
        return service.findByCriticalityId(id);
    }
    @ApiOperation("delete by criticality id")
    @DeleteMapping("criticality/id/{id}")
    public int deleteByCriticalityId(@PathVariable Long id){
        return service.deleteByCriticalityId(id);
    }
    @ApiOperation("find by supplier id")
    @GetMapping("supplier/id/{id}")
    public List<PurchaseOrder> findBySupplierId(@PathVariable Long id){
        return service.findBySupplierId(id);
    }
    @ApiOperation("delete by supplier id")
    @DeleteMapping("supplier/id/{id}")
    public int deleteBySupplierId(@PathVariable Long id){
        return service.deleteBySupplierId(id);
    }
    @ApiOperation("find by recipient id")
    @GetMapping("recipient/id/{id}")
    public List<PurchaseOrder> findByRecipientId(@PathVariable Long id){
        return service.findByRecipientId(id);
    }
    @ApiOperation("delete by recipient id")
    @DeleteMapping("recipient/id/{id}")
    public int deleteByRecipientId(@PathVariable Long id){
        return service.deleteByRecipientId(id);
    }
    @ApiOperation("find by purchaser id")
    @GetMapping("purchaser/id/{id}")
    public List<PurchaseOrder> findByPurchaserId(@PathVariable Long id){
        return service.findByPurchaserId(id);
    }
    @ApiOperation("delete by purchaser id")
    @DeleteMapping("purchaser/id/{id}")
    public int deleteByPurchaserId(@PathVariable Long id){
        return service.deleteByPurchaserId(id);
    }
    @ApiOperation("find by currency id")
    @GetMapping("currency/id/{id}")
    public List<PurchaseOrder> findByCurrencyId(@PathVariable Long id){
        return service.findByCurrencyId(id);
    }
    @ApiOperation("delete by currency id")
    @DeleteMapping("currency/id/{id}")
    public int deleteByCurrencyId(@PathVariable Long id){
        return service.deleteByCurrencyId(id);
    }
    @ApiOperation("find by purchaseOrderStatus id")
    @GetMapping("purchaseOrderStatus/id/{id}")
    public List<PurchaseOrder> findByPurchaseOrderStatusId(@PathVariable Long id){
        return service.findByPurchaseOrderStatusId(id);
    }
    @ApiOperation("delete by purchaseOrderStatus id")
    @DeleteMapping("purchaseOrderStatus/id/{id}")
    public int deleteByPurchaseOrderStatusId(@PathVariable Long id){
        return service.deleteByPurchaseOrderStatusId(id);
    }
    @ApiOperation("find by purchaseRequest id")
    @GetMapping("purchaseRequest/id/{id}")
    public List<PurchaseOrder> findByPurchaseRequestId(@PathVariable Long id){
        return service.findByPurchaseRequestId(id);
    }
    @ApiOperation("delete by purchaseRequest id")
    @DeleteMapping("purchaseRequest/id/{id}")
    public int deleteByPurchaseRequestId(@PathVariable Long id){
        return service.deleteByPurchaseRequestId(id);
    }
    @ApiOperation("Finds a purchaseOrder and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<PurchaseOrderDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds purchaseOrders by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PurchaseOrderDto>> findByCriteria(@RequestBody PurchaseOrderCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated purchaseOrders by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PurchaseOrderCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseOrders by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PurchaseOrderCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets purchaseOrder data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PurchaseOrderCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets purchaseOrder history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets purchaseOrder paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PurchaseOrderHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseOrder history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PurchaseOrderHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets purchaseOrder history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PurchaseOrderHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PurchaseOrderRestAdmin (PurchaseOrderAdminService service, PurchaseOrderConverter converter) {
        super(service, converter);
    }


}