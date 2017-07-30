package br.com.caiofrota.modelutil.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.caiofrota.modelutil.exceptions.EntityNullException;
import br.com.caiofrota.modelutil.exceptions.PrimaryKeyNullException;
import br.com.caiofrota.modelutil.test.domain.TestingEntity;
import br.com.caiofrota.modelutil.test.repository.TestingRepository;

/**
 * Test GenericRepository.
 * 
 * @author Caio Frota <contato@caiofrota.com.br>
 * @version 1.0
 * @since 1.0
 */
@ContextConfiguration(locations = { "classpath:spring-context.xml", "classpath:spring-data.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGenericRepository {

	@Autowired
	private TestingRepository repository;

	@Test
	public void case010_saveObjectShouldBeSaved() {
		TestingEntity object = new TestingEntity();
		object.setDescription("My Test!");
		repository.save(object);
	}

	@Test(expected = EntityNullException.class)
	public void case020_saveNullShouldThrowException() {
		repository.save(null);
	}

	@Test
	public void case030_updateObjectSholdBeUpdated() {
		TestingEntity object = new TestingEntity();
		object.setId(1l);
		object.setDescription("My Test Updated!");
		repository.update(object);
	}

	@Test(expected = EntityNullException.class)
	public void case040_updateNullShouldThrowException() {
		repository.update(null);
	}

	@Test
	public void case050_findByPrimaryKeyShouldFind() {
		repository.findByPrimaryKey(1L);
	}

	@Test(expected = PrimaryKeyNullException.class)
	public void case060_findByPrimaryKeyNullShouldThrowException() {
		repository.findByPrimaryKey(null);
	}

	@Test
	public void case070_deleteObjectSholdBeUpdated() {
		TestingEntity object = new TestingEntity();
		object.setId(1l);
		repository.delete(object);
	}

	@Test(expected = EntityNullException.class)
	public void case080_deleteNullShouldThrowException() {
		repository.delete(null);
	}

}
