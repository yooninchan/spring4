package com.apress.isf.java.service;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;

import java.util.List;

/**
 * Created by yun-inchan on 2014. 10. 24..
 */
public interface SearchEngine {
    public List<Document> findByType(Type documentType);
    public List<Document> listAll();
}
