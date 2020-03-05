package northwind.entity;

import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Repository
public class CustomersJDBCRepository {

	private static final Logger LOGGER = LogManager.getLogger(CustomersJDBCRepository.class.getClass());

    @Autowired
    protected JdbcTemplate jdbc;

    public Customers getCustomer(String customerID) {
    	LOGGER.info("CustomerJDBCRepository.getCustomers()");
        return jdbc.queryForObject("SELECT * FROM customers WHERE customerID=?", customerMapper, customerID);
    }

    public List<Customers> getCustomers(String[] ids) {
    	LOGGER.info("CustomerJDBCRepository.getCustomers()");
        String inIds = StringUtils.arrayToCommaDelimitedString(ObjectUtils.toObjectArray(ids));
        return jdbc.query("SELECT * FROM customers WHERE customerID IN (" + inIds + ")", customerMapper);
    }

    private static final RowMapper<Customers> customerMapper = new RowMapper<Customers>() {
        public Customers mapRow(ResultSet rs, int rowNum) throws SQLException {
            Customers customers = new Customers(rs.getString("customerID")
            		, rs.getString("companyName")
            		, rs.getString("contactName")
            		, rs.getString("contactTitle")
            		, rs.getString("address")
            		, rs.getString("city")
            		, rs.getString("region")
            		, rs.getString("postalCode")
            		, rs.getString("country")
            		, rs.getString("phone")
            		, rs.getString("fax")
            );
//            customers.setContactName(rs.getString("contactName"));
            return customers;
        }
    };
	
}
