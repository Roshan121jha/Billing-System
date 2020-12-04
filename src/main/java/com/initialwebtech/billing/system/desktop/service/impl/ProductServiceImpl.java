package com.initialwebtech.billing.system.desktop.service.impl;

import com.initialwebtech.billing.system.desktop.service.ProductService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public URI addProduct(String id, String details, String company, int quantity) {
        return null;
    }
}
