package io.github.skylinebnr334.Store_BuppanManager.BuppanRegister.connector;

import io.github.skylinebnr334.Store_BuppanManager.BuppanRegister.ProductInformation;

import java.util.*;
import java.util.stream.Stream;

public class MemoryProductInformationConnector implements IProductInformationConnector{

    private HashMap<String,ProductInformation> hashmap;
    @Override
    public List<ProductInformation> getProducts() {
        return hashmap.values().stream().toList();
    }

    @Override
    public Stream<ProductInformation> getProductsStream() {
        return hashmap.values().stream();
    }

    @Override
    public Optional<ProductInformation> getProductById(String id) {
        return
                Optional.ofNullable(
                hashmap.get(id));
    }

    @Override
    public void setProductInfo(String id, ProductInformation pinfo) {
        hashmap.put(id,pinfo);
    }

    @Override
    public void deleteProductInfo(String id) {
        hashmap.remove(id);
    }

    @Override
    public void AddProductInfo(ProductInformation pinfo) {
        hashmap.put(pinfo.getId(),pinfo);
    }
    public MemoryProductInformationConnector(){
        hashmap=new HashMap<String,ProductInformation>();
    }
}
