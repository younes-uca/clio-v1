package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.Purchaser;
import ma.sir.clio.bean.history.PurchaserHistory;
import ma.sir.clio.dao.criteria.core.PurchaserCriteria;
import ma.sir.clio.dao.criteria.history.PurchaserHistoryCriteria;
import ma.sir.clio.service.facade.admin.PurchaserAdminService;
import ma.sir.clio.ws.converter.PurchaserConverter;
import ma.sir.clio.ws.dto.PurchaserDto;
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

@Api("Manages purchaser services")
@RestController
@RequestMapping("/api/admin/purchaser/")
public class PurchaserRestAdmin  extends AbstractController<Purchaser, PurchaserDto, PurchaserHistory, PurchaserCriteria, PurchaserHistoryCriteria, PurchaserAdminService, PurchaserConverter> {



    @ApiOperation("upload one purchaser")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple purchasers")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all purchasers")
    @GetMapping("")
    public ResponseEntity<List<PurchaserDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all purchasers")
    @GetMapping("optimized")
    public ResponseEntity<List<PurchaserDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a purchaser by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PurchaserDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  purchaser")
    @PostMapping("")
    public ResponseEntity<PurchaserDto> save(@RequestBody PurchaserDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  purchaser")
    @PutMapping("")
    public ResponseEntity<PurchaserDto> update(@RequestBody PurchaserDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of purchaser")
    @PostMapping("multiple")
    public ResponseEntity<List<PurchaserDto>> delete(@RequestBody List<PurchaserDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified purchaser")
    @DeleteMapping("")
    public ResponseEntity<PurchaserDto> delete(@RequestBody PurchaserDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified purchaser")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple purchasers by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds purchasers by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PurchaserDto>> findByCriteria(@RequestBody PurchaserCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated purchasers by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PurchaserCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchasers by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PurchaserCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets purchaser data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PurchaserCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets purchaser history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets purchaser paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PurchaserHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports purchaser history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PurchaserHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets purchaser history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PurchaserHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PurchaserRestAdmin (PurchaserAdminService service, PurchaserConverter converter) {
        super(service, converter);
    }


}