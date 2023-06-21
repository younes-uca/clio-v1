package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.Criticality;
import ma.sir.clio.bean.history.CriticalityHistory;
import ma.sir.clio.dao.criteria.core.CriticalityCriteria;
import ma.sir.clio.dao.criteria.history.CriticalityHistoryCriteria;
import ma.sir.clio.service.facade.admin.CriticalityAdminService;
import ma.sir.clio.ws.converter.CriticalityConverter;
import ma.sir.clio.ws.dto.CriticalityDto;
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

@Api("Manages criticality services")
@RestController
@RequestMapping("/api/admin/criticality/")
public class CriticalityRestAdmin  extends AbstractController<Criticality, CriticalityDto, CriticalityHistory, CriticalityCriteria, CriticalityHistoryCriteria, CriticalityAdminService, CriticalityConverter> {



    @ApiOperation("upload one criticality")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple criticalitys")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all criticalitys")
    @GetMapping("")
    public ResponseEntity<List<CriticalityDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all criticalitys")
    @GetMapping("optimized")
    public ResponseEntity<List<CriticalityDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a criticality by id")
    @GetMapping("id/{id}")
    public ResponseEntity<CriticalityDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  criticality")
    @PostMapping("")
    public ResponseEntity<CriticalityDto> save(@RequestBody CriticalityDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  criticality")
    @PutMapping("")
    public ResponseEntity<CriticalityDto> update(@RequestBody CriticalityDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of criticality")
    @PostMapping("multiple")
    public ResponseEntity<List<CriticalityDto>> delete(@RequestBody List<CriticalityDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified criticality")
    @DeleteMapping("")
    public ResponseEntity<CriticalityDto> delete(@RequestBody CriticalityDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified criticality")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple criticalitys by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds criticalitys by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<CriticalityDto>> findByCriteria(@RequestBody CriticalityCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated criticalitys by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CriticalityCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports criticalitys by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody CriticalityCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets criticality data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody CriticalityCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets criticality history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets criticality paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CriticalityHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports criticality history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CriticalityHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets criticality history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CriticalityHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public CriticalityRestAdmin (CriticalityAdminService service, CriticalityConverter converter) {
        super(service, converter);
    }


}