import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet(name = "ordersServlet", urlPatterns = "ordersServlet")
public class OrderServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3692337945741216998L;
	private static final Logger LOGGER = LogManager.getLogger(OrderServlet.class.getClass());
	private Connection con;
	public void init() throws ServletException {
		super.init();
	}
	
    @Override
    protected void doPost(HttpServletRequest request, 
      HttpServletResponse response)
      throws ServletException, IOException {
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
			try {
				Statement st = con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	LOGGER.info("OrderSearch.doPost()");
        String customerID = request.getParameter("customerID");
 
        try {
        	String sql = "select * from orders where \"CustomerID\" = '" + customerID + "'"; 
        	LOGGER.info("\nsql:\n" + sql + "\n");
            String message = "";
            Statement st = con.createStatement(); 
            ResultSet rs = st.executeQuery(sql);

            //Retrieving the ResultSetMetaData object
            ResultSetMetaData rsmd = rs.getMetaData();
            //getting the column type
            int column_count = rsmd.getColumnCount();		            // Extract data from result set
            while(rs.next()){
               //Retrieve by column name
            	for (int i = 1; i< column_count; i++) {
            		message += rs.getString(i) + " ";
            	}
            	message += "\n";
            }
//        	System.out.println(message);

            rs.close();
            con.close(); 
            response.setContentLength(message.length());
 
            response.getOutputStream().write(message.getBytes());
            
        } catch (Exception e) {
        	LOGGER.error(e);
            response.sendRedirect("error.xhtml");
        }
    }
 
}