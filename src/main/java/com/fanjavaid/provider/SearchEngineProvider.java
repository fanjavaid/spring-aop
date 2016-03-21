/**
 * 
 */
package com.fanjavaid.provider;

import java.util.List;

import com.fanjavaid.model.Document;
import com.fanjavaid.model.Type;

/**
 * @author fanjavaid
 *
 */
public interface SearchEngineProvider {
	List<Document> findByType(Type type);
	List<Document> listAll();
}
