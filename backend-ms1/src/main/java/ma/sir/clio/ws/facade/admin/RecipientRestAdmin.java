package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.Recipient;
import ma.sir.clio.bean.history.RecipientHistory;
import ma.sir.clio.dao.criteria.core.RecipientCriteria;
import ma.sir.clio.dao.criteria.history.RecipientHistoryCriteria;
import ma.sir.clio.service.facade.admin.RecipientAdminService;
import ma.sir.clio.ws.converter.RecipientConverter;
import ma.sir.clio.ws.dto.RecipientDto;
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

@Api("Manages recipient services")
@RestController
@RequestMapping("/api/admin/recipient/")
public class RecipientRestAdmin  extends AbstractController<Recipient, RecipientDto, RecipientHistory, RecipientCriteria, RecipientHistoryCriteria, RecipientAdminService, RecipientConverter> {



    @ApiOperation("upload one recipient")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple recipients")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all recipients")
    @GetMapping("")
    public ResponseEntity<List<RecipientDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all recipients")
    @GetMapping("optimized")
    public ResponseEntity<List<RecipientDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a recipient by id")
    @GetMapping("id/{id}")
    public ResponseEntity<RecipientDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  recipient")
    @PostMapping("")
    public ResponseEntity<RecipientDto> save(@RequestBody RecipientDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  recipient")
    @PutMapping("")
    public ResponseEntity<RecipientDto> update(@RequestBody RecipientDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of recipient")
    @PostMapping("multiple")
    public ResponseEntity<List<RecipientDto>> delete(@RequestBody List<RecipientDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified recipient")
    @DeleteMapping("")
    public ResponseEntity<RecipientDto> delete(@RequestBody RecipientDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified recipient")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple recipients by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds recipients by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<RecipientDto>> findByCriteria(@RequestBody RecipientCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated recipients by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody RecipientCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports recipients by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody RecipientCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets recipient data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody RecipientCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets recipient history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets recipient paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody RecipientHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports recipient history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody RecipientHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets recipient history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody RecipientHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public RecipientRestAdmin (RecipientAdminService service, RecipientConverter converter) {
        super(service, converter);
    }


}