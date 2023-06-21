package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.Currency;
import ma.sir.clio.bean.history.CurrencyHistory;
import ma.sir.clio.dao.criteria.core.CurrencyCriteria;
import ma.sir.clio.dao.criteria.history.CurrencyHistoryCriteria;
import ma.sir.clio.service.facade.admin.CurrencyAdminService;
import ma.sir.clio.ws.converter.CurrencyConverter;
import ma.sir.clio.ws.dto.CurrencyDto;
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

@Api("Manages currency services")
@RestController
@RequestMapping("/api/admin/currency/")
public class CurrencyRestAdmin  extends AbstractController<Currency, CurrencyDto, CurrencyHistory, CurrencyCriteria, CurrencyHistoryCriteria, CurrencyAdminService, CurrencyConverter> {



    @ApiOperation("upload one currency")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple currencys")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all currencys")
    @GetMapping("")
    public ResponseEntity<List<CurrencyDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all currencys")
    @GetMapping("optimized")
    public ResponseEntity<List<CurrencyDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a currency by id")
    @GetMapping("id/{id}")
    public ResponseEntity<CurrencyDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  currency")
    @PostMapping("")
    public ResponseEntity<CurrencyDto> save(@RequestBody CurrencyDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  currency")
    @PutMapping("")
    public ResponseEntity<CurrencyDto> update(@RequestBody CurrencyDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of currency")
    @PostMapping("multiple")
    public ResponseEntity<List<CurrencyDto>> delete(@RequestBody List<CurrencyDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified currency")
    @DeleteMapping("")
    public ResponseEntity<CurrencyDto> delete(@RequestBody CurrencyDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified currency")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple currencys by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds currencys by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<CurrencyDto>> findByCriteria(@RequestBody CurrencyCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated currencys by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CurrencyCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports currencys by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody CurrencyCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets currency data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody CurrencyCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets currency history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets currency paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CurrencyHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports currency history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CurrencyHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets currency history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CurrencyHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public CurrencyRestAdmin (CurrencyAdminService service, CurrencyConverter converter) {
        super(service, converter);
    }


}