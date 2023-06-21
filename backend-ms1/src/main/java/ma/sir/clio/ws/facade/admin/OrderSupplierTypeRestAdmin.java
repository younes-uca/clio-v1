package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.OrderSupplierType;
import ma.sir.clio.bean.history.OrderSupplierTypeHistory;
import ma.sir.clio.dao.criteria.core.OrderSupplierTypeCriteria;
import ma.sir.clio.dao.criteria.history.OrderSupplierTypeHistoryCriteria;
import ma.sir.clio.service.facade.admin.OrderSupplierTypeAdminService;
import ma.sir.clio.ws.converter.OrderSupplierTypeConverter;
import ma.sir.clio.ws.dto.OrderSupplierTypeDto;
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

@Api("Manages orderSupplierType services")
@RestController
@RequestMapping("/api/admin/orderSupplierType/")
public class OrderSupplierTypeRestAdmin  extends AbstractController<OrderSupplierType, OrderSupplierTypeDto, OrderSupplierTypeHistory, OrderSupplierTypeCriteria, OrderSupplierTypeHistoryCriteria, OrderSupplierTypeAdminService, OrderSupplierTypeConverter> {



    @ApiOperation("upload one orderSupplierType")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple orderSupplierTypes")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all orderSupplierTypes")
    @GetMapping("")
    public ResponseEntity<List<OrderSupplierTypeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all orderSupplierTypes")
    @GetMapping("optimized")
    public ResponseEntity<List<OrderSupplierTypeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a orderSupplierType by id")
    @GetMapping("id/{id}")
    public ResponseEntity<OrderSupplierTypeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  orderSupplierType")
    @PostMapping("")
    public ResponseEntity<OrderSupplierTypeDto> save(@RequestBody OrderSupplierTypeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  orderSupplierType")
    @PutMapping("")
    public ResponseEntity<OrderSupplierTypeDto> update(@RequestBody OrderSupplierTypeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of orderSupplierType")
    @PostMapping("multiple")
    public ResponseEntity<List<OrderSupplierTypeDto>> delete(@RequestBody List<OrderSupplierTypeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified orderSupplierType")
    @DeleteMapping("")
    public ResponseEntity<OrderSupplierTypeDto> delete(@RequestBody OrderSupplierTypeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified orderSupplierType")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple orderSupplierTypes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds orderSupplierTypes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<OrderSupplierTypeDto>> findByCriteria(@RequestBody OrderSupplierTypeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated orderSupplierTypes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody OrderSupplierTypeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports orderSupplierTypes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody OrderSupplierTypeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets orderSupplierType data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody OrderSupplierTypeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets orderSupplierType history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets orderSupplierType paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody OrderSupplierTypeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports orderSupplierType history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody OrderSupplierTypeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets orderSupplierType history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody OrderSupplierTypeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public OrderSupplierTypeRestAdmin (OrderSupplierTypeAdminService service, OrderSupplierTypeConverter converter) {
        super(service, converter);
    }


}