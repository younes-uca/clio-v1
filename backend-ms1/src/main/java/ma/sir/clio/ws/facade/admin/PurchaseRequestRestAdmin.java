package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.PurchaseRequest;
import ma.sir.clio.bean.history.PurchaseRequestHistory;
import ma.sir.clio.dao.criteria.core.PurchaseRequestCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseRequestHistoryCriteria;
import ma.sir.clio.service.facade.admin.PurchaseRequestAdminService;
import ma.sir.clio.ws.converter.PurchaseRequestConverter;
import ma.sir.clio.ws.dto.PurchaseRequestDto;
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

@Api("Manages purchaseRequest services")
@RestController
@RequestMapping("/api/admin/purchaseRequest/")
public class PurchaseRequestRestAdmin  extends AbstractController<PurchaseRequest, PurchaseRequestDto, PurchaseRequestHistory, PurchaseRequestCriteria, PurchaseRequestHistoryCriteria, PurchaseRequestAdminService, PurchaseRequestConverter> {



    @ApiOperation("upload one purchaseRequest")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple purchaseRequests")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all purchaseRequests")
    @GetMapping("")
    public ResponseEntity<List<PurchaseRequestDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all purchaseRequests")
    @GetMapping("optimized")
    public ResponseEntity<List<PurchaseRequestDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a purchaseRequest by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PurchaseRequestDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  purchaseRequest")
    @PostMapping("")
    public ResponseEntity<PurchaseRequestDto> save(@RequestBody PurchaseRequestDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  purchaseRequest")
    @PutMapping("")
    public ResponseEntity<PurchaseRequestDto> update(@RequestBody PurchaseRequestDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of purchaseRequest")
    @PostMapping("multiple")
    public ResponseEntity<List<PurchaseRequestDto>> delete(@RequestBody List<PurchaseRequestDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified purchaseRequest")
    @DeleteMapping("")
    public ResponseEntity<PurchaseRequestDto> delete(@RequestBody PurchaseRequestDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified purchaseRequest")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple purchaseRequests by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by supplier id")
    @GetMapping("supplier/id/{id}")
    public List<PurchaseRequest> findBySupplierId(@PathVariable Long id){
        return service.findBySupplierId(id);
    }
    @ApiOperation("delete by supplier id")
    @DeleteMapping("supplier/id/{id}")
    public int deleteBySupplierId(@PathVariable Long id){
        return service.deleteBySupplierId(id);
    }
    @ApiOperation("find by purchaseRequestStatus id")
    @GetMapping("purchaseRequestStatus/id/{id}")
    public List<PurchaseRequest> findByPurchaseRequestStatusId(@PathVariable Long id){
        return service.findByPurchaseRequestStatusId(id);
    }
    @ApiOperation("delete by purchaseRequestStatus id")
    @DeleteMapping("purchaseRequestStatus/id/{id}")
    public int deleteByPurchaseRequestStatusId(@PathVariable Long id){
        return service.deleteByPurchaseRequestStatusId(id);
    }
    @ApiOperation("Finds a purchaseRequest and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<PurchaseRequestDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds purchaseRequests by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PurchaseRequestDto>> findByCriteria(@RequestBody PurchaseRequestCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated purchaseRequests by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PurchaseRequestCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseRequests by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PurchaseRequestCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets purchaseRequest data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PurchaseRequestCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets purchaseRequest history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets purchaseRequest paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PurchaseRequestHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseRequest history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PurchaseRequestHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets purchaseRequest history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PurchaseRequestHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PurchaseRequestRestAdmin (PurchaseRequestAdminService service, PurchaseRequestConverter converter) {
        super(service, converter);
    }


}