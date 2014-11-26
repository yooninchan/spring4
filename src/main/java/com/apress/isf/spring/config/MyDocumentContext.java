package com.apress.isf.spring.config;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.java.service.SearchEngine;
import com.apress.isf.java.service.SearchEngineService;
import com.apress.isf.spring.data.DocumentDAO;
import com.apress.isf.spring.data.DocumentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yun-inchan on 2014. 11. 26..
 */

@Configuration
public class MyDocumentContext {

    private Map<String, Document> documents = new HashMap<String, Document>();
    private Map<String, Type> types = new HashMap<String, Type>();

    @Bean
    public Type webType(){
        return getTypeFromMap("web");
    }

    @Bean
    public SearchEngine engine(){
        SearchEngineService engine = new SearchEngineService();
        engine.setDocumentDAO(documentDAO());

        return engine;
    }

    private DocumentDAO documentDAO() {
        DocumentRepository documentDAO = new DocumentRepository();
        documentDAO.setDoc1(getDocumentFromMap("doc1"));
        documentDAO.setDoc2(getDocumentFromMap("doc2"));
        documentDAO.setDoc3(getDocumentFromMap("doc3"));
        documentDAO.setDoc4(getDocumentFromMap("doc4"));
        return documentDAO;
    }

    private Document getDocumentFromMap(String documentKey) {
        return documents.get(documentKey);
    }

    private Type getTypeFromMap(String typeKey) {
        return types.get(typeKey);
    }
}
