package com.apress.isf.spring.annotated.data;

import com.apress.isf.java.model.Document;
import com.apress.isf.spring.data.DocumentDAO;
import org.springframework.stereotype.Repository;

/**
 * Created by yun-inchan on 2014. 10. 29..
 */

@Repository("documentDAO")
public class AnnotatedDocumentRepository implements DocumentDAO {

    public Document[] getAll() {

        return new Document[0];
    }
}
