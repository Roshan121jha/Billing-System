package com.initialwebtech.billing.system.desktop.service;

import java.net.URI;

public interface ProductService {

    public URI addProduct(String id, String details, String company, int quantity);
}
