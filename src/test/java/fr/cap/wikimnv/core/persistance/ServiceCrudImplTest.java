package fr.cap.wikimnv.core.persistance;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.cap.wikimnv.core.commons.exception.MNVException;
import fr.cap.wikimnv.core.pojo.TypeStructure;


public class ServiceCrudImplTest {
	
	IServiceCRUD sc;

	public ServiceCrudImplTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		sc = (IServiceCRUD) applicationContext.getBean("ServicePersistance");	
	}
	


//	@Test
//	public void testServiceCrudImpl() {
//		fail("Not yet implemented");
//	}
//
	@Test
	public void testLister() {
		
		try {
		  sc.lister(TypeStructure.ARTICLE);
		} catch (MNVException e) {
			fail(e.getMessage());
		}
		
	}
//
//	@Test
//	public void testSauver() {
//		fail("Not yet implemented");
//	}
//
	@Test
	public void testFaireRequete() {
		
		Meta m1 = new Meta("id", "cd030");
		Meta m2 = new Meta("date_depart", "10/02/2015");
		Meta m3 = new Meta("date_fin", "7/08/2015");
		
		List<Meta> listeMeta = new ArrayList<Meta>();
		listeMeta.add(m1);
		listeMeta.add(m2);
		listeMeta.add(m3);
		
		try {
			  sc.faireRequete(Query.PROFIL_SELECT_COUNTARTICLESECRIT, listeMeta );
			} catch (MNVException e) {
				fail(e.getMessage());
			}
	}
//
//	@Test
//	public void testLire() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSupprimer() {
//		fail("Not yet implemented");
//	}

}
