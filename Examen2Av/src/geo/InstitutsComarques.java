package geo;

import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQPreparedExpression;
import javax.xml.xquery.XQResultSequence;

import net.xqj.exist.ExistXQDataSource;

public class InstitutsComarques {

	public static void main(String[] args) throws XQException {
		XQDataSource s = new ExistXQDataSource();
		   s.setProperty("serverName", "localhost");
		   s.setProperty("port", "8080");
		   s.setProperty("user", "admin");
		   s.setProperty("password", "admin");
		 
		   XQConnection conn = s.getConnection();
		   String sent ="for $comarca in //comarca "
		   					+ "let $numH := sum($comarca//poblacio) "
		   					+ "let $numI := count($comarca//institut) "
		   					+ "let $rel := $numH div $numI "
		   					+ "order by $rel "
		   					+ "return concat($comarca/nom/text(), \": \", $rel , \" (\"  , $numH , \" habitants / \" , $numI , \" instituts)\")";

		   
		   XQPreparedExpression cons = conn.prepareExpression(sent);
		   XQResultSequence rs = cons.executeQuery();
		   
		while(rs.next())
		       System.out.println(rs.getItemAsString(null));
		 
		   conn.close();

	}

}
