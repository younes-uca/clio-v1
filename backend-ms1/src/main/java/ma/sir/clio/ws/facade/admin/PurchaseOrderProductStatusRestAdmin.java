package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.PurchaseOrderProductStatus;
import ma.sir.clio.bean.history.PurchaseOrderProductStatusHistory;
import ma.sir.clio.dao.criteria.core.PurchaseOrderProductStatusCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseOrderProductStatusHistoryCriteria;
import ma.sir.clio.service.facade.admin.PurchaseOrderProductStatusAdminService;
import ma.sir.clio.ws.converter.PurchaseOrderProductStatusConverter;
import ma.sir.clio.ws.dto.PurchaseOrderProductStatusDto;
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

@Api("Manages purchaseOrderProductStatus services")
@RestController
@RequestMapping("/api/admin/purchaseOrderProductStatus/")
public class PurchaseOrderProductStatusRestAdmin  extends AbstractController<PurchaseOrderProductStatus, PurchaseOrderProductStatusDto, PurchaseOrderProductStatusHistory, PurchaseOrderProductStatusCriteria, PurchaseOrderProductStatusHistoryCriteria, PurchaseOrderProductStatusAdminService, PurchaseOrderProductStatusConverter> {



    @ApiOperation("upload one purchaseOrderProductStatus")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple purchaseOrderProductStatuss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all purchaseOrderProductStatuss")
    @GetMapping("")
    public ResponseEntity<List<PurchaseOrderProductStatusDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all purchaseOrderProductStatuss")
    @GetMapping("optimized")
    public ResponseEntity<List<PurchaseOrderProductStatusDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a purchaseOrderProductStatus by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PurchaseOrderProductStatusDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  purchaseOrderProductStatus")
    @PostMapping("")
    public ResponseEntity<PurchaseOrderProductStatusDto> save(@RequestBody PurchaseOrderProductStatusDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  purchaseOrderProductStatus")
    @PutMapping("")
    public ResponseEntity<PurchaseOrderProductStatusDto> update(@RequestBody PurchaseOrderProductStatusDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of purchaseOrderProductStatus")
    @PostMapping("multiple")
    public ResponseEntity<List<PurchaseOrderProductStatusDto>> delete(@RequestBody List<PurchaseOrderProductStatusDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified purchaseOrderProductStatus")
    @DeleteMapping("")
    public ResponseEntity<PurchaseOrderProductStatusDto> delete(@RequestBody PurchaseOrderProductStatusDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified purchaseOrderProductStatus")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple purchaseOrderProductStatuss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds purchaseOrderProductStatuss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PurchaseOrderProductStatusDto>> findByCriteria(@RequestBody PurchaseOrderProductStatusCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated purchaseOrderProductStatuss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PurchaseOrderProductStatusCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseOrderProductStatuss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PurchaseOrderProductStatusCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets purchaseOrderProductStatus data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PurchaseOrderProductStatusCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets purchaseOrderProductStatus history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets purchaseOrderProductStatus paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PurchaseOrderProductStatusHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseOrderProductStatus history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PurchaseOrderProductStatusHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets purchaseOrderProductStatus history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PurchaseOrderProductStatusHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PurchaseOrderProductStatusRestAdmin (PurchaseOrderProductStatusAdminService service, PurchaseOrderProductStatusConverter converter) {
        super(service, converter);
    }


}