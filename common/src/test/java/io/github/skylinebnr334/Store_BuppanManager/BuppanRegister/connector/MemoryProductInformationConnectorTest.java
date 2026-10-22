package io.github.skylinebnr334.Store_BuppanManager.BuppanRegister.connector;

import io.github.skylinebnr334.Store_BuppanManager.BuppanRegister.ProductInformation;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class MemoryProductInformationConnectorTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("beforeall");
    }
    @Test
    void testMain(){
        assertEquals(1,1,"A");
    }
    @Test
    void testMemoryPInfo(){
        IProductInformationConnector connector=new MemoryProductInformationConnector();

        //create sample data
        ProductInformation p1 = new ProductInformation();
        ProductInformation p2 = new ProductInformation();
        p1.setId("ID_1");
        p1.setDescription("desc_1");
        p1.setName("name_1");
        p1.setPrice(810);
        p2.setId("ID_2");
        p2.setDescription("desc_2");
        p2.setName("name_2");
        p2.setPrice(811);

        connector.AddProductInfo(p1);

        //only p1

        Optional<ProductInformation> opt_p1=connector.getProductById(p1.getId());
        assertTrue(opt_p1.isPresent());
        assertEquals(opt_p1.get(),p1);

        assertFalse(connector.getProductById("ID_2").isPresent());

        //p2
        connector.AddProductInfo(p2);

        assertTrue(connector.getProductById(p2.getId()).isPresent(),"Product 2 available");

        assertEquals(connector.getProductById(p2.getId()).get(),p2);

        ProductInformation p2_a=new ProductInformation();
        p2_a.setId(p2.getId());
        p2_a.setPrice(8183);
        p2_a.setName("P2DDDD");
        p2_a.setDescription("new_Desc");
        assertNotEquals(p2_a,p2);
        connector.setProductInfo(p2_a.getId(),p2_a);
        assertNotEquals(p2,connector.getProductById(p2.getId()).get());
        assertEquals(p2_a,connector.getProductById(p2.getId()).get());

        //2
        connector.deleteProductInfo(p2.getId());
        assertFalse(connector.getProductById(p2.getId()).isPresent());
    }
}
