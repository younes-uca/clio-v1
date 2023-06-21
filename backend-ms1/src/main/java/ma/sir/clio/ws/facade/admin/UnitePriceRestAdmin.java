package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.UnitePrice;
import ma.sir.clio.bean.history.UnitePriceHistory;
import ma.sir.clio.dao.criteria.core.UnitePriceCriteria;
import ma.sir.clio.dao.criteria.history.UnitePriceHistoryCriteria;
import ma.sir.clio.service.facade.admin.UnitePriceAdminService;
import ma.sir.clio.ws.converter.UnitePriceConverter;
import ma.sir.clio.ws.dto.UnitePriceDto;
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

@Api("Manages unitePrice services")
@RestController
@RequestMapping("/api/admin/unitePrice/")
public class UnitePriceRestAdmin  extends AbstractController<UnitePrice, UnitePriceDto, UnitePriceHistory, UnitePriceCriteria, UnitePriceHistoryCriteria, UnitePriceAdminService, UnitePriceConverter> {



    @ApiOperation("upload one unitePrice")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple unitePrices")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all unitePrices")
    @GetMapping("")
    public ResponseEntity<List<UnitePriceDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all unitePrices")
    @GetMapping("optimized")
    public ResponseEntity<List<UnitePriceDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a unitePrice by id")
    @GetMapping("id/{id}")
    public ResponseEntity<UnitePriceDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  unitePrice")
    @PostMapping("")
    public ResponseEntity<UnitePriceDto> save(@RequestBody UnitePriceDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  unitePrice")
    @PutMapping("")
    public ResponseEntity<UnitePriceDto> update(@RequestBody UnitePriceDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of unitePrice")
    @PostMapping("multiple")
    public ResponseEntity<List<UnitePriceDto>> delete(@RequestBody List<UnitePriceDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified unitePrice")
    @DeleteMapping("")
    public ResponseEntity<UnitePriceDto> delete(@RequestBody UnitePriceDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified unitePrice")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple unitePrices by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds unitePrices by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<UnitePriceDto>> findByCriteria(@RequestBody UnitePriceCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated unitePrices by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody UnitePriceCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports unitePrices by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody UnitePriceCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets unitePrice data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody UnitePriceCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets unitePrice history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets unitePrice paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody UnitePriceHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports unitePrice history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody UnitePriceHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets unitePrice history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody UnitePriceHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public UnitePriceRestAdmin (UnitePriceAdminService service, UnitePriceConverter converter) {
        super(service, converter);
    }


}