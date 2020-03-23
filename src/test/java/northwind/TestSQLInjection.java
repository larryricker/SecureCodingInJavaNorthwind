package northwind;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class TestSQLInjection {
	private static final Logger LOGGER = LogManager.getLogger(TestSQLInjection.class.getClass());
	private Connection con;

	@BeforeAll
	static void setupAllTests() {
		
	}
	@AfterAll
	static void shutdownAllTests() {
		
	}
	@BeforeEach
	void beforeTheTest() {
	    // Initialization code like set up database etc....
		LOGGER.info("OrderSearch.init()");
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		String propertiesFilename = "application.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFilename);
		if (inputStream != null) {
			try {
				prop.load(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				LOGGER.error("property file: " + propertiesFilename + " not found!");
				return;
			}
		} else {
			LOGGER.error("property file: " + propertiesFilename + " not found!");
			return;
		}
		String url = prop.getProperty("spring.datasource.url");
		String user = prop.getProperty("spring.datasource.username");
		String password = prop.getProperty("spring.datasource.password");
		
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@AfterEach
	void afterTheTest() {

	}
	
	@Test
	void test() {
    	LOGGER.info("OrderSearch.doPost()");
        String customerID = "VINET";
        String message = "";
 
        try {
        	String sql = "select * from orders where \"CustomerID\" = '" + customerID + "'"; 
        	LOGGER.info("\nsql:\n" + sql + "\n");
            Statement st = con.createStatement(); 
            ResultSet rs = st.executeQuery(sql);
            
            //Retrieving the ResultSetMetaData object
            ResultSetMetaData rsmd = rs.getMetaData();
            //getting the column type
            int column_count = rsmd.getColumnCount();
            // Extract data from result set
            while(rs.next()){
               //Retrieve by column name
            	for (int i = 1; i< column_count; i++) {
            		message += rs.getString(i) + " ";
            	}
            }
        	LOGGER.info(message);

            rs.close();
            con.close(); 

//            RequestDispatcher dispatcher 
//              = request.getRequestDispatcher("index.jsp");
//            dispatcher.forward(request, response);
        } catch (Exception e) {
        	LOGGER.error(e);
        }

//		fail("Not yet implemented");
	}

}
