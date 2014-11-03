package com.apress.isf.spring.annotated.data;

import com.apress.isf.java.model.Document;
import com.apress.isf.spring.data.DocumentDAO;

/**
 * Created by yun-inchan on 2014. 10. 29..
 */
public class AnnotatedDocumentRepository implements DocumentDAO {
    @Override
    public Document[] getAll() {
        return new Document[0];
    }
}
