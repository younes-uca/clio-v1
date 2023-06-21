package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.PurchaseRequestProductStatus;
import ma.sir.clio.bean.history.PurchaseRequestProductStatusHistory;
import ma.sir.clio.dao.criteria.core.PurchaseRequestProductStatusCriteria;
import ma.sir.clio.dao.criteria.history.PurchaseRequestProductStatusHistoryCriteria;
import ma.sir.clio.service.facade.admin.PurchaseRequestProductStatusAdminService;
import ma.sir.clio.ws.converter.PurchaseRequestProductStatusConverter;
import ma.sir.clio.ws.dto.PurchaseRequestProductStatusDto;
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

@Api("Manages purchaseRequestProductStatus services")
@RestController
@RequestMapping("/api/admin/purchaseRequestProductStatus/")
public class PurchaseRequestProductStatusRestAdmin  extends AbstractController<PurchaseRequestProductStatus, PurchaseRequestProductStatusDto, PurchaseRequestProductStatusHistory, PurchaseRequestProductStatusCriteria, PurchaseRequestProductStatusHistoryCriteria, PurchaseRequestProductStatusAdminService, PurchaseRequestProductStatusConverter> {



    @ApiOperation("upload one purchaseRequestProductStatus")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple purchaseRequestProductStatuss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all purchaseRequestProductStatuss")
    @GetMapping("")
    public ResponseEntity<List<PurchaseRequestProductStatusDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all purchaseRequestProductStatuss")
    @GetMapping("optimized")
    public ResponseEntity<List<PurchaseRequestProductStatusDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a purchaseRequestProductStatus by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PurchaseRequestProductStatusDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  purchaseRequestProductStatus")
    @PostMapping("")
    public ResponseEntity<PurchaseRequestProductStatusDto> save(@RequestBody PurchaseRequestProductStatusDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  purchaseRequestProductStatus")
    @PutMapping("")
    public ResponseEntity<PurchaseRequestProductStatusDto> update(@RequestBody PurchaseRequestProductStatusDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of purchaseRequestProductStatus")
    @PostMapping("multiple")
    public ResponseEntity<List<PurchaseRequestProductStatusDto>> delete(@RequestBody List<PurchaseRequestProductStatusDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified purchaseRequestProductStatus")
    @DeleteMapping("")
    public ResponseEntity<PurchaseRequestProductStatusDto> delete(@RequestBody PurchaseRequestProductStatusDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified purchaseRequestProductStatus")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple purchaseRequestProductStatuss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds purchaseRequestProductStatuss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PurchaseRequestProductStatusDto>> findByCriteria(@RequestBody PurchaseRequestProductStatusCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated purchaseRequestProductStatuss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PurchaseRequestProductStatusCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseRequestProductStatuss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PurchaseRequestProductStatusCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets purchaseRequestProductStatus data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PurchaseRequestProductStatusCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets purchaseRequestProductStatus history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets purchaseRequestProductStatus paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PurchaseRequestProductStatusHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaseRequestProductStatus history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PurchaseRequestProductStatusHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets purchaseRequestProductStatus history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PurchaseRequestProductStatusHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PurchaseRequestProductStatusRestAdmin (PurchaseRequestProductStatusAdminService service, PurchaseRequestProductStatusConverter converter) {
        super(service, converter);
    }


}