import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fanjavaid.model.Document;
import com.fanjavaid.model.Type;
import com.fanjavaid.repository.SearchEngineService;

/**
 * 
 */

/**
 * @author fanjavaid
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SearchEngineTest {
	
	@Autowired
	private SearchEngineService engineProxy;
	
	@Test
	public void searchByTypeTest() {
		Type pdf = new Type("PDF", ".pdf");
		List<Document> results = engineProxy.findByType(pdf);
		
		Assert.assertEquals(2, results.size());
		Assert.assertNotNull(results);
	}
	
	@Test
	public void getAllDocumentsTest() {
		List<Document> documents = engineProxy.getAllDocuments();
		
		Assert.assertNotNull(documents);
		Assert.assertEquals(4, documents.size());
	}
}
