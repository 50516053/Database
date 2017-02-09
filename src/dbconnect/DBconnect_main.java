package dbconnect;


import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.data.category.DefaultCategoryDataset;

public class DBconnect_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id, year,ton;
		String name;
		ResultSet rs;
		MySQL mysql = new MySQL();
		rs = mysql.selectAll();
		DefaultCategoryDataset data= new DefaultCategoryDataset();

		try {
			while(rs.next()){
	                id = rs.getInt("id");
	                name = rs.getString("name");
	                year = rs.getInt("year");
	                ton = rs.getInt("ton");
	                //System.out.println("IDF" + id);
	                //System.out.println("nameF" + name);
	                //System.out.println("yearF" + year);
	                //System.out.println("tonF" + ton);
	                data.addValue(ton, name,String.valueOf(year));

	

	            }

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}



		Graph frame = new Graph(data);
		frame.setBounds(5,5,655,455);
		frame.setVisible(true);


	}



}

