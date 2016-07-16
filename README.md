# CRUDSpringBootJdbcPropertiesFile
This examples uses springboot (autowired, autocomponentscan) intelligent annotations to
allow not used beans.xml,dis-patcher-servlet.xml. only required in pom.xml.


The main concept for this CRUD applicatio is /users connects the mysql server.
all the server propoerites are stored in application.properties as below.

spring.datasource.url=jdbc:mysql://localhost:3306/user
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.jdbc.Driver

Here we have used the JdbcTemplate class to interact with database, which is called in
DAO or now Repository Layer. as 

@Repository
public class UserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public Collection<User> findAll() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.query("select * from user", 
				new BeanPropertyRowMapper<User>(User.class));
	}
}
