package um.edu.mx.editor_texto_saas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EditorTextoSaasApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Test
	void contextLoads() throws Exception {
		try (Connection connection = dataSource.getConnection()) {
			assertEquals("EDITOR_USER", connection.getMetaData().getUserName());
		}
	}

}
