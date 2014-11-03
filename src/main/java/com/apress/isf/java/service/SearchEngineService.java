package com.apress.isf.java.service;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.spring.data.DocumentDAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yun-inchan on 2014. 10. 29..
 */
public class SearchEngineService implements SearchEngine {

    private DocumentDAO documentDAO;

    public DocumentDAO getDocumentDAO() {
        return documentDAO;
    }

    public void setDocumentDAO(DocumentDAO documentDAO) {
        this.documentDAO = documentDAO;
    }

    public List<Document> findByType(Type documentType){
        List<Document> result = new ArrayList<Document>();

        for(Document doc : listAll()){
            if(doc.getType().getName().equals(documentType.getName()))
                result.add(doc);
        }

        return result;
    }

    public List<Document> listAll(){
        return Arrays.asList(documentDAO.getAll());
    }
}
