package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.OrderSupplierStatus;
import ma.sir.clio.bean.history.OrderSupplierStatusHistory;
import ma.sir.clio.dao.criteria.core.OrderSupplierStatusCriteria;
import ma.sir.clio.dao.criteria.history.OrderSupplierStatusHistoryCriteria;
import ma.sir.clio.service.facade.admin.OrderSupplierStatusAdminService;
import ma.sir.clio.ws.converter.OrderSupplierStatusConverter;
import ma.sir.clio.ws.dto.OrderSupplierStatusDto;
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

@Api("Manages orderSupplierStatus services")
@RestController
@RequestMapping("/api/admin/orderSupplierStatus/")
public class OrderSupplierStatusRestAdmin  extends AbstractController<OrderSupplierStatus, OrderSupplierStatusDto, OrderSupplierStatusHistory, OrderSupplierStatusCriteria, OrderSupplierStatusHistoryCriteria, OrderSupplierStatusAdminService, OrderSupplierStatusConverter> {



    @ApiOperation("upload one orderSupplierStatus")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple orderSupplierStatuss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all orderSupplierStatuss")
    @GetMapping("")
    public ResponseEntity<List<OrderSupplierStatusDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all orderSupplierStatuss")
    @GetMapping("optimized")
    public ResponseEntity<List<OrderSupplierStatusDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a orderSupplierStatus by id")
    @GetMapping("id/{id}")
    public ResponseEntity<OrderSupplierStatusDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  orderSupplierStatus")
    @PostMapping("")
    public ResponseEntity<OrderSupplierStatusDto> save(@RequestBody OrderSupplierStatusDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  orderSupplierStatus")
    @PutMapping("")
    public ResponseEntity<OrderSupplierStatusDto> update(@RequestBody OrderSupplierStatusDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of orderSupplierStatus")
    @PostMapping("multiple")
    public ResponseEntity<List<OrderSupplierStatusDto>> delete(@RequestBody List<OrderSupplierStatusDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified orderSupplierStatus")
    @DeleteMapping("")
    public ResponseEntity<OrderSupplierStatusDto> delete(@RequestBody OrderSupplierStatusDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified orderSupplierStatus")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple orderSupplierStatuss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds orderSupplierStatuss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<OrderSupplierStatusDto>> findByCriteria(@RequestBody OrderSupplierStatusCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated orderSupplierStatuss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody OrderSupplierStatusCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports orderSupplierStatuss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody OrderSupplierStatusCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets orderSupplierStatus data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody OrderSupplierStatusCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets orderSupplierStatus history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets orderSupplierStatus paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody OrderSupplierStatusHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports orderSupplierStatus history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody OrderSupplierStatusHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets orderSupplierStatus history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody OrderSupplierStatusHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public OrderSupplierStatusRestAdmin (OrderSupplierStatusAdminService service, OrderSupplierStatusConverter converter) {
        super(service, converter);
    }


}