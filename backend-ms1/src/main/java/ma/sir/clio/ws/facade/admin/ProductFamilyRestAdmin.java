package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.ProductFamily;
import ma.sir.clio.bean.history.ProductFamilyHistory;
import ma.sir.clio.dao.criteria.core.ProductFamilyCriteria;
import ma.sir.clio.dao.criteria.history.ProductFamilyHistoryCriteria;
import ma.sir.clio.service.facade.admin.ProductFamilyAdminService;
import ma.sir.clio.ws.converter.ProductFamilyConverter;
import ma.sir.clio.ws.dto.ProductFamilyDto;
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

@Api("Manages productFamily services")
@RestController
@RequestMapping("/api/admin/productFamily/")
public class ProductFamilyRestAdmin  extends AbstractController<ProductFamily, ProductFamilyDto, ProductFamilyHistory, ProductFamilyCriteria, ProductFamilyHistoryCriteria, ProductFamilyAdminService, ProductFamilyConverter> {



    @ApiOperation("upload one productFamily")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple productFamilys")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all productFamilys")
    @GetMapping("")
    public ResponseEntity<List<ProductFamilyDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all productFamilys")
    @GetMapping("optimized")
    public ResponseEntity<List<ProductFamilyDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a productFamily by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ProductFamilyDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  productFamily")
    @PostMapping("")
    public ResponseEntity<ProductFamilyDto> save(@RequestBody ProductFamilyDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  productFamily")
    @PutMapping("")
    public ResponseEntity<ProductFamilyDto> update(@RequestBody ProductFamilyDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of productFamily")
    @PostMapping("multiple")
    public ResponseEntity<List<ProductFamilyDto>> delete(@RequestBody List<ProductFamilyDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified productFamily")
    @DeleteMapping("")
    public ResponseEntity<ProductFamilyDto> delete(@RequestBody ProductFamilyDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified productFamily")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple productFamilys by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds productFamilys by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ProductFamilyDto>> findByCriteria(@RequestBody ProductFamilyCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated productFamilys by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ProductFamilyCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports productFamilys by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ProductFamilyCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets productFamily data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ProductFamilyCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets productFamily history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets productFamily paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ProductFamilyHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports productFamily history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ProductFamilyHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets productFamily history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ProductFamilyHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ProductFamilyRestAdmin (ProductFamilyAdminService service, ProductFamilyConverter converter) {
        super(service, converter);
    }


}