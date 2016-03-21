/**
 * 
 */
package com.fanjavaid.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fanjavaid.model.Document;
import com.fanjavaid.model.Type;
import com.fanjavaid.provider.SearchEngineProvider;

/**
 * @author fanjavaid
 *
 */
public class SearchEngineRepository implements SearchEngineProvider {

	/* (non-Javadoc)
	 * @see com.fanjavaid.provider.SearchEngineProvider#findByType(com.fanjavaid.model.Type)
	 */
	public List<Document> findByType(Type type) {
		// TODO Auto-generated method stub
		List<Document> results = new ArrayList<Document>();
		for (Document document : storages()) {
			if (document.getType().getExtention().equals(type.getExtention())) {
				results.add(document);
			}
		}
		
		return results;
	}

	/* (non-Javadoc)
	 * @see com.fanjavaid.provider.SearchEngineProvider#listAll()
	 */
	public List<Document> listAll() {
		// TODO Auto-generated method stub
		return storages();
	}
	
	private List<Document> storages() {
		List<Document> documents = new ArrayList<Document>();
		
		// Type
		Type pdf = new Type("PDF", ".pdf");
		Type docx = new Type("Office 2007 Document", "docx");
		Type csv = new Type("CSV", ".csv");
		
		// Document
		Document doc1 = new Document("Spring MVC Cookbook", pdf, new Date());
		Document doc2 = new Document("Export 20160110", csv, new Date());
		Document doc3 = new Document("MySQL Tutorials", docx, new Date());
		Document doc4 = new Document("Beginning Hibernate", pdf, new Date());
		
		documents.add(doc1);
		documents.add(doc2);
		documents.add(doc3);
		documents.add(doc4);
		
		return documents;
	}

}
