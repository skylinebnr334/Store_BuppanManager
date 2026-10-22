package io.github.skylinebnr334.Store_BuppanManager.BuppanRegister.connector;

import io.github.skylinebnr334.Store_BuppanManager.BuppanRegister.ProductInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public interface IProductInformationConnector {
    public List<ProductInformation> getProducts();
    public Stream<ProductInformation> getProductsStream();
    public Optional<ProductInformation> getProductById(String id);
    public void setProductInfo(String id,ProductInformation pinfo);
    public void deleteProductInfo(String id);
    public void AddProductInfo(ProductInformation pinfo);
}
