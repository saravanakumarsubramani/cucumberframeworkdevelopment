package utilities;

import java.util.Map;
import java.util.TreeMap;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelHandler {

	public static Map<String,String> getTestdataInmap(String Testdatafile,String SheetName,String Testcaseid) throws Exception{
	Map<String,String> TestdataInMap=new TreeMap<String,String>();
	String query=null;
	query=String.format("SELECT * FROM %s WHERE Run='YES' and TestCaseID='%s'",SheetName,Testcaseid);
	Fillo fillo=new Fillo();
	Connection conn=null;
	Recordset recordset=null;
	try {
		conn=fillo.getConnection(Testdatafile);
		recordset=conn.executeQuery(query);
		while(recordset.next())
		{
			for(String field:recordset.getFieldNames()) {
				TestdataInMap.put(field,recordset.getField(field));
			}
		}
	}
	catch(FilloException e) {
		e.printStackTrace();
		throw new Exception("Test data cannot find");
	}
	conn.close();
	return TestdataInMap;
}
}