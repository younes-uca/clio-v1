package  ma.sir.clio;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.*;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.cache.annotation.EnableCaching;


import ma.sir.clio.bean.core.*;
import ma.sir.clio.service.facade.admin.*;

import ma.sir.clio.zynerator.security.common.AuthoritiesConstants;
import ma.sir.clio.zynerator.security.bean.User;
import ma.sir.clio.zynerator.security.bean.Permission;
import ma.sir.clio.zynerator.security.bean.Role;
import ma.sir.clio.zynerator.security.service.facade.UserService;
import ma.sir.clio.zynerator.security.service.facade.RoleService;


import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCaching
//@EnableFeignClients("ma.sir.clio.required.facade")
public class ClioApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx=SpringApplication.run(ClioApplication.class, args);
    }


    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService) {
    return (args) -> {
        if(true){



    // Role admin

        User userForAdmin = new User("admin");

        Role roleForAdmin = new Role();
        roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
        List<Permission> permissionsForAdmin = new ArrayList<>();
        addPermissionForAdmin(permissionsForAdmin);
        roleForAdmin.setPermissions(permissionsForAdmin);
        if(userForAdmin.getRoles()==null)
            userForAdmin.setRoles(new ArrayList<>());

        userForAdmin.getRoles().add(roleForAdmin);
        userService.save(userForAdmin);
            }
        };
    }




    private static String fakeString(String attributeName, int i) {
        return attributeName + i;
    }

    private static Long fakeLong(String attributeName, int i) {
        return  10L * i;
    }
    private static Integer fakeInteger(String attributeName, int i) {
        return  10 * i;
    }

    private static Double fakeDouble(String attributeName, int i) {
        return 10D * i;
    }

    private static BigDecimal fakeBigDecimal(String attributeName, int i) {
        return  BigDecimal.valueOf(i*1L*10);
    }

    private static Boolean fakeBoolean(String attributeName, int i) {
        return i % 2 == 0 ? true : false;
    }
    private static LocalDateTime fakeLocalDateTime(String attributeName, int i) {
        return LocalDateTime.now().plusDays(i);
    }
    private static void addPermissionForAdmin(List<Permission> permissions){
        permissions.add(new Permission("Currency.edit"));
        permissions.add(new Permission("Currency.list"));
        permissions.add(new Permission("Currency.view"));
        permissions.add(new Permission("Currency.add"));
        permissions.add(new Permission("Currency.delete"));
        permissions.add(new Permission("PurchaseOrderDeliveryProduct.edit"));
        permissions.add(new Permission("PurchaseOrderDeliveryProduct.list"));
        permissions.add(new Permission("PurchaseOrderDeliveryProduct.view"));
        permissions.add(new Permission("PurchaseOrderDeliveryProduct.add"));
        permissions.add(new Permission("PurchaseOrderDeliveryProduct.delete"));
        permissions.add(new Permission("OrderSupplierType.edit"));
        permissions.add(new Permission("OrderSupplierType.list"));
        permissions.add(new Permission("OrderSupplierType.view"));
        permissions.add(new Permission("OrderSupplierType.add"));
        permissions.add(new Permission("OrderSupplierType.delete"));
        permissions.add(new Permission("Supplier.edit"));
        permissions.add(new Permission("Supplier.list"));
        permissions.add(new Permission("Supplier.view"));
        permissions.add(new Permission("Supplier.add"));
        permissions.add(new Permission("Supplier.delete"));
        permissions.add(new Permission("Recipient.edit"));
        permissions.add(new Permission("Recipient.list"));
        permissions.add(new Permission("Recipient.view"));
        permissions.add(new Permission("Recipient.add"));
        permissions.add(new Permission("Recipient.delete"));
        permissions.add(new Permission("PurchaseRequestStatus.edit"));
        permissions.add(new Permission("PurchaseRequestStatus.list"));
        permissions.add(new Permission("PurchaseRequestStatus.view"));
        permissions.add(new Permission("PurchaseRequestStatus.add"));
        permissions.add(new Permission("PurchaseRequestStatus.delete"));
        permissions.add(new Permission("Store.edit"));
        permissions.add(new Permission("Store.list"));
        permissions.add(new Permission("Store.view"));
        permissions.add(new Permission("Store.add"));
        permissions.add(new Permission("Store.delete"));
        permissions.add(new Permission("Criticality.edit"));
        permissions.add(new Permission("Criticality.list"));
        permissions.add(new Permission("Criticality.view"));
        permissions.add(new Permission("Criticality.add"));
        permissions.add(new Permission("Criticality.delete"));
        permissions.add(new Permission("OrderSupplierDeliveryStatus.edit"));
        permissions.add(new Permission("OrderSupplierDeliveryStatus.list"));
        permissions.add(new Permission("OrderSupplierDeliveryStatus.view"));
        permissions.add(new Permission("OrderSupplierDeliveryStatus.add"));
        permissions.add(new Permission("OrderSupplierDeliveryStatus.delete"));
        permissions.add(new Permission("Product.edit"));
        permissions.add(new Permission("Product.list"));
        permissions.add(new Permission("Product.view"));
        permissions.add(new Permission("Product.add"));
        permissions.add(new Permission("Product.delete"));
        permissions.add(new Permission("PurchaseRequestProductStatus.edit"));
        permissions.add(new Permission("PurchaseRequestProductStatus.list"));
        permissions.add(new Permission("PurchaseRequestProductStatus.view"));
        permissions.add(new Permission("PurchaseRequestProductStatus.add"));
        permissions.add(new Permission("PurchaseRequestProductStatus.delete"));
        permissions.add(new Permission("PurchaseRequestProduct.edit"));
        permissions.add(new Permission("PurchaseRequestProduct.list"));
        permissions.add(new Permission("PurchaseRequestProduct.view"));
        permissions.add(new Permission("PurchaseRequestProduct.add"));
        permissions.add(new Permission("PurchaseRequestProduct.delete"));
        permissions.add(new Permission("ProductFamily.edit"));
        permissions.add(new Permission("ProductFamily.list"));
        permissions.add(new Permission("ProductFamily.view"));
        permissions.add(new Permission("ProductFamily.add"));
        permissions.add(new Permission("ProductFamily.delete"));
        permissions.add(new Permission("PurchaseRequest.edit"));
        permissions.add(new Permission("PurchaseRequest.list"));
        permissions.add(new Permission("PurchaseRequest.view"));
        permissions.add(new Permission("PurchaseRequest.add"));
        permissions.add(new Permission("PurchaseRequest.delete"));
        permissions.add(new Permission("OrderSupplierStatus.edit"));
        permissions.add(new Permission("OrderSupplierStatus.list"));
        permissions.add(new Permission("OrderSupplierStatus.view"));
        permissions.add(new Permission("OrderSupplierStatus.add"));
        permissions.add(new Permission("OrderSupplierStatus.delete"));
        permissions.add(new Permission("StoreProduct.edit"));
        permissions.add(new Permission("StoreProduct.list"));
        permissions.add(new Permission("StoreProduct.view"));
        permissions.add(new Permission("StoreProduct.add"));
        permissions.add(new Permission("StoreProduct.delete"));
        permissions.add(new Permission("Purchaser.edit"));
        permissions.add(new Permission("Purchaser.list"));
        permissions.add(new Permission("Purchaser.view"));
        permissions.add(new Permission("Purchaser.add"));
        permissions.add(new Permission("Purchaser.delete"));
        permissions.add(new Permission("PurchaseOrderProductStatus.edit"));
        permissions.add(new Permission("PurchaseOrderProductStatus.list"));
        permissions.add(new Permission("PurchaseOrderProductStatus.view"));
        permissions.add(new Permission("PurchaseOrderProductStatus.add"));
        permissions.add(new Permission("PurchaseOrderProductStatus.delete"));
        permissions.add(new Permission("UnitePrice.edit"));
        permissions.add(new Permission("UnitePrice.list"));
        permissions.add(new Permission("UnitePrice.view"));
        permissions.add(new Permission("UnitePrice.add"));
        permissions.add(new Permission("UnitePrice.delete"));
        permissions.add(new Permission("PurchaseOrderStatus.edit"));
        permissions.add(new Permission("PurchaseOrderStatus.list"));
        permissions.add(new Permission("PurchaseOrderStatus.view"));
        permissions.add(new Permission("PurchaseOrderStatus.add"));
        permissions.add(new Permission("PurchaseOrderStatus.delete"));
        permissions.add(new Permission("PurchaseOrder.edit"));
        permissions.add(new Permission("PurchaseOrder.list"));
        permissions.add(new Permission("PurchaseOrder.view"));
        permissions.add(new Permission("PurchaseOrder.add"));
        permissions.add(new Permission("PurchaseOrder.delete"));
        permissions.add(new Permission("PurchaseOrderDelivery.edit"));
        permissions.add(new Permission("PurchaseOrderDelivery.list"));
        permissions.add(new Permission("PurchaseOrderDelivery.view"));
        permissions.add(new Permission("PurchaseOrderDelivery.add"));
        permissions.add(new Permission("PurchaseOrderDelivery.delete"));
        permissions.add(new Permission("PurchaseOrderProduct.edit"));
        permissions.add(new Permission("PurchaseOrderProduct.list"));
        permissions.add(new Permission("PurchaseOrderProduct.view"));
        permissions.add(new Permission("PurchaseOrderProduct.add"));
        permissions.add(new Permission("PurchaseOrderProduct.delete"));
    }

}


