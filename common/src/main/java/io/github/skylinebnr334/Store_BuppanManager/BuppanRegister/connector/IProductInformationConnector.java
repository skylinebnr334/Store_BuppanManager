package io.github.skylinebnr334.Store_BuppanManager.BuppanRegister.connector;

import io.github.skylinebnr334.Store_BuppanManager.BuppanRegister.ProductInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *  Productinformation Connector
 */
public interface IProductInformationConnector {
    /**
     * get ProductInformation List
     * @return ProductInformation List
     */
    public List<ProductInformation> getProducts();

    /**
     * get ProductInformation Stream
     * @return ProductInformation Stream
     */
    public Stream<ProductInformation> getProductsStream();

    /**
     * get Productinformation by id
     * @param id ProductInformation id
     * @return ProductInformation
     */
    public Optional<ProductInformation> getProductById(String id);

    /**
     * set ProductInformation
     * @param id id
     * @param pinfo ProductInformation
     */
    public void setProductInfo(String id,ProductInformation pinfo);

    /**
     * delete ProductInformation
     * @param id ProductInformation id
     */
    public void deleteProductInfo(String id);

    /**
     * Add ProductInformation
     * @param pinfo ProductInformation
     */
    public void AddProductInfo(ProductInformation pinfo);
}
