package br.com.caiofrota.modelutil.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.caiofrota.modelutil.bundle.ModelBundle;

/**
 * Test ModelBundle.
 * 
 * @author Caio Frota <contato@caiofrota.com.br>
 * @version 1.0
 * @since 1.0
 */
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestModelBundle {

	@Autowired
	protected ModelBundle resourceBundle;

	@Test
	public void case010_FindMessageShouldBeOk() {
		resourceBundle.message("TEST");
	}

}