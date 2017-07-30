package br.com.caiofrota.modelutil.test.repository;

import org.springframework.stereotype.Repository;

import br.com.caiofrota.modelutil.repositories.impl.GenericRepositoryImpl;
import br.com.caiofrota.modelutil.test.domain.TestingEntity;

/**
 * Test repository.
 * 
 * @author Caio Frota <contato@caiofrota.com.br>
 * @version 1.0
 * @since 1.0
 */
@Repository
public class TestingRepository extends GenericRepositoryImpl<TestingEntity, Long> {

	private static final long serialVersionUID = 4575959798206651226L;

}
