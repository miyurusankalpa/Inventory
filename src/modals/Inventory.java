package modals;

import java.sql.SQLException;

import exception.*;

public interface Inventory {

		public void getdatafromdb(int i) throws SQLException;
		
		public String getdata() throws SQLException;
		
		public String createquery();
		
		public String deletequery();
		
		public String editquery();
		
		public void validate() throws ValidateException;
}
