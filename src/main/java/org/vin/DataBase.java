package org.vin;

import java.sql.*;

public class DataBase {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/parkinglot";
        String name = "root";
        String password = "root";
        String query = "SELECT licplate,vehicletype FROM vehicle WHERE licplate='ewrte'";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, name, password);
        Statement st = con.createStatement();

        boolean hasResults = st.execute(query);

        while (hasResults) {
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                String details = rs.getString("licplate") + " " + rs.getString("vehicletype");
                System.out.println(details);
            }
            hasResults = st.getMoreResults();
        }

        st.close();
        con.close();
    }
}
