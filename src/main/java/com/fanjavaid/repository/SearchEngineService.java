/**
 * 
 */
package com.fanjavaid.repository;

import java.util.List;

import com.fanjavaid.model.Document;
import com.fanjavaid.model.Type;
import com.fanjavaid.provider.SearchEngineProvider;

/**
 * @author fanjavaid
 *
 */
public class SearchEngineService {
	private SearchEngineProvider searchEngineProvider;

	public SearchEngineService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchEngineService(SearchEngineProvider searchEngineProvider) {
		super();
		this.searchEngineProvider = searchEngineProvider;
	}

	public SearchEngineProvider getSearchEngineProvider() {
		return searchEngineProvider;
	}

	public void setSearchEngineProvider(SearchEngineProvider searchEngineProvider) {
		this.searchEngineProvider = searchEngineProvider;
	}
	
	// Presentation Services	
	public List<Document> findByType(Type type) {
		return searchEngineProvider.findByType(type);
	}
	
	public List<Document> getAllDocuments() {
		return searchEngineProvider.listAll();
	}
}
