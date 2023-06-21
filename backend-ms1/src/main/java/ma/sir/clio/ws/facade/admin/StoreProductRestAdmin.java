package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.StoreProduct;
import ma.sir.clio.bean.history.StoreProductHistory;
import ma.sir.clio.dao.criteria.core.StoreProductCriteria;
import ma.sir.clio.dao.criteria.history.StoreProductHistoryCriteria;
import ma.sir.clio.service.facade.admin.StoreProductAdminService;
import ma.sir.clio.ws.converter.StoreProductConverter;
import ma.sir.clio.ws.dto.StoreProductDto;
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

@Api("Manages storeProduct services")
@RestController
@RequestMapping("/api/admin/storeProduct/")
public class StoreProductRestAdmin  extends AbstractController<StoreProduct, StoreProductDto, StoreProductHistory, StoreProductCriteria, StoreProductHistoryCriteria, StoreProductAdminService, StoreProductConverter> {



    @ApiOperation("upload one storeProduct")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple storeProducts")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all storeProducts")
    @GetMapping("")
    public ResponseEntity<List<StoreProductDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a storeProduct by id")
    @GetMapping("id/{id}")
    public ResponseEntity<StoreProductDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  storeProduct")
    @PostMapping("")
    public ResponseEntity<StoreProductDto> save(@RequestBody StoreProductDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  storeProduct")
    @PutMapping("")
    public ResponseEntity<StoreProductDto> update(@RequestBody StoreProductDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of storeProduct")
    @PostMapping("multiple")
    public ResponseEntity<List<StoreProductDto>> delete(@RequestBody List<StoreProductDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified storeProduct")
    @DeleteMapping("")
    public ResponseEntity<StoreProductDto> delete(@RequestBody StoreProductDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified storeProduct")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple storeProducts by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by store id")
    @GetMapping("store/id/{id}")
    public List<StoreProduct> findByStoreId(@PathVariable Long id){
        return service.findByStoreId(id);
    }
    @ApiOperation("delete by store id")
    @DeleteMapping("store/id/{id}")
    public int deleteByStoreId(@PathVariable Long id){
        return service.deleteByStoreId(id);
    }
    @ApiOperation("find by product id")
    @GetMapping("product/id/{id}")
    public List<StoreProduct> findByProductId(@PathVariable Long id){
        return service.findByProductId(id);
    }
    @ApiOperation("delete by product id")
    @DeleteMapping("product/id/{id}")
    public int deleteByProductId(@PathVariable Long id){
        return service.deleteByProductId(id);
    }
    @ApiOperation("Finds storeProducts by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<StoreProductDto>> findByCriteria(@RequestBody StoreProductCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated storeProducts by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody StoreProductCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports storeProducts by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody StoreProductCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets storeProduct data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody StoreProductCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets storeProduct history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets storeProduct paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody StoreProductHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports storeProduct history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody StoreProductHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets storeProduct history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody StoreProductHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public StoreProductRestAdmin (StoreProductAdminService service, StoreProductConverter converter) {
        super(service, converter);
    }


}