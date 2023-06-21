package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.PurchaseOrderStatus;
import ma.sir.clio.bean.history.PurchaseOrderStatusHistory;
import ma.sir.clio.dao.criteria.core.PurchaseOrderStatusCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderStatusHistoryCriteria;
import ma.sir.clio.service.facade.admin.PurchaseOrderStatusAdminService;
import ma.sir.clio.ws.converter.PurchaseOrderStatusConverter;
import ma.sir.clio.ws.dto.PurchaseOrderStatusDto;
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

@Api("Manages purchaseOrderStatus services")
@RestController
@RequestMapping("/api/admin/purchaseOrderStatus/")
public class PurchaseOrderStatusRestAdmin  extends AbstractController<PurchaseOrderStatus, PurchaseOrderStatusDto, PurchaseOrderStatusHistory, PurchaseOrderStatusCriteria, PurchaseOrderStatusHistoryCriteria, PurchaseOrderStatusAdminService, PurchaseOrderStatusConverter> {



    @ApiOperation("upload one purchaseOrderStatus")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple purchaseOrderStatuss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all purchaseOrderStatuss")
    @GetMapping("")
    public ResponseEntity<List<PurchaseOrderStatusDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all purchaseOrderStatuss")
    @GetMapping("optimized")
    public ResponseEntity<List<PurchaseOrderStatusDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a purchaseOrderStatus by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PurchaseOrderStatusDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  purchaseOrderStatus")
    @PostMapping("")
    public ResponseEntity<PurchaseOrderStatusDto> save(@RequestBody PurchaseOrderStatusDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  purchaseOrderStatus")
    @PutMapping("")
    public ResponseEntity<PurchaseOrderStatusDto> update(@RequestBody PurchaseOrderStatusDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of purchaseOrderStatus")
    @PostMapping("multiple")
    public ResponseEntity<List<PurchaseOrderStatusDto>> delete(@RequestBody List<PurchaseOrderStatusDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified purchaseOrderStatus")
    @DeleteMapping("")
    public ResponseEntity<PurchaseOrderStatusDto> delete(@RequestBody PurchaseOrderStatusDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified purchaseOrderStatus")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple purchaseOrderStatuss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds purchaseOrderStatuss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PurchaseOrderStatusDto>> findByCriteria(@RequestBody PurchaseOrderStatusCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated purchaseOrderStatuss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PurchaseOrderStatusCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseOrderStatuss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PurchaseOrderStatusCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets purchaseOrderStatus data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PurchaseOrderStatusCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets purchaseOrderStatus history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets purchaseOrderStatus paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PurchaseOrderStatusHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseOrderStatus history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PurchaseOrderStatusHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets purchaseOrderStatus history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PurchaseOrderStatusHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PurchaseOrderStatusRestAdmin (PurchaseOrderStatusAdminService service, PurchaseOrderStatusConverter converter) {
        super(service, converter);
    }


}