package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.PurchaseRequestStatus;
import ma.sir.clio.bean.history.PurchaseRequestStatusHistory;
import ma.sir.clio.dao.criteria.core.PurchaseRequestStatusCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseRequestStatusHistoryCriteria;
import ma.sir.clio.service.facade.admin.PurchaseRequestStatusAdminService;
import ma.sir.clio.ws.converter.PurchaseRequestStatusConverter;
import ma.sir.clio.ws.dto.PurchaseRequestStatusDto;
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

@Api("Manages purchaseRequestStatus services")
@RestController
@RequestMapping("/api/admin/purchaseRequestStatus/")
public class PurchaseRequestStatusRestAdmin  extends AbstractController<PurchaseRequestStatus, PurchaseRequestStatusDto, PurchaseRequestStatusHistory, PurchaseRequestStatusCriteria, PurchaseRequestStatusHistoryCriteria, PurchaseRequestStatusAdminService, PurchaseRequestStatusConverter> {



    @ApiOperation("upload one purchaseRequestStatus")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple purchaseRequestStatuss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all purchaseRequestStatuss")
    @GetMapping("")
    public ResponseEntity<List<PurchaseRequestStatusDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all purchaseRequestStatuss")
    @GetMapping("optimized")
    public ResponseEntity<List<PurchaseRequestStatusDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a purchaseRequestStatus by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PurchaseRequestStatusDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  purchaseRequestStatus")
    @PostMapping("")
    public ResponseEntity<PurchaseRequestStatusDto> save(@RequestBody PurchaseRequestStatusDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  purchaseRequestStatus")
    @PutMapping("")
    public ResponseEntity<PurchaseRequestStatusDto> update(@RequestBody PurchaseRequestStatusDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of purchaseRequestStatus")
    @PostMapping("multiple")
    public ResponseEntity<List<PurchaseRequestStatusDto>> delete(@RequestBody List<PurchaseRequestStatusDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified purchaseRequestStatus")
    @DeleteMapping("")
    public ResponseEntity<PurchaseRequestStatusDto> delete(@RequestBody PurchaseRequestStatusDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified purchaseRequestStatus")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple purchaseRequestStatuss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds purchaseRequestStatuss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PurchaseRequestStatusDto>> findByCriteria(@RequestBody PurchaseRequestStatusCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated purchaseRequestStatuss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PurchaseRequestStatusCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseRequestStatuss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PurchaseRequestStatusCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets purchaseRequestStatus data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PurchaseRequestStatusCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets purchaseRequestStatus history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets purchaseRequestStatus paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PurchaseRequestStatusHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseRequestStatus history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PurchaseRequestStatusHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets purchaseRequestStatus history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PurchaseRequestStatusHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PurchaseRequestStatusRestAdmin (PurchaseRequestStatusAdminService service, PurchaseRequestStatusConverter converter) {
        super(service, converter);
    }


}