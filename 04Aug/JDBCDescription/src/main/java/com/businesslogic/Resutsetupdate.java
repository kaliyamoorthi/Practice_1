package com.businesslogic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Resutsetupdate
 */
@WebServlet("/Resutsetupdate")
public class Resutsetupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resutsetupdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {


			  /*

			    * An updatable result set allows modification to data in a table through the result set. 

			    * If the database does not support updatable result sets, the result sets returned from 

			    * executeQuery() will be read-only. To get updatable results, the Statement object used 

			    * to create the result sets must have the concurrency type ResultSet.CONCUR_UPDATABLE. 

			    * The query of an updatable result set must specify the primary key as one of the selected 

			    * columns and select from only one table.

			    */
Connection connection=Datatabase
PrintWriter out=response.getWriter();
			  // Create a statement that will return updatable result sets

			  Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);


			  // Primary key test_col must be specified so that the result set is updatable

			  ResultSet results = statement.executeQuery("SELECT test_col FROM test_table");


			  out.println("Table data prior results handling... ");


			  // Display table data

			  while (results.next()) {


			    // Get the data from the current row using the column name - column data are in the VARCHAR format

			    String data = results.getString("test_col");

			    out.println("Fetching data by column name for row " + results.getRow() + " : " + data);


			  }

			  

			  // An updatable result supports a row called the "insert row". It is a buffer for holding the values of a new row

			  results.moveToInsertRow();


			  // Set values for the new row.

			  results.updateString("test_col", "inserted_test_value");


			  // Insert the new row

			  results.insertRow();


			  // Move cursor to the third row

			  results.absolute(3);


			  // Update the value of column test_col on that row

			  results.updateString("test_col", "updated_test_value");


			  // Update the row; if auto-commit is enabled, update is committed

			  results.updateRow();


			  // Discard the update to the row we could use 

			  // results.cancelRowUpdates();


			  // Delete the fifth row

			  results.absolute(5);

			  results.deleteRow();


			  // Retrieve the current values of the row from the database

			  results.refreshRow();


			  out.println("Table data after results handling... ");


			  results.beforeFirst();


			  // Display table data

			  while (results.next()) {


			    // Get the data from the current row using the column name - column data are in the VARCHAR format

			    String data = results.getString("test_col");

			    out.println("Fetching data by column name for row " + results.getRow() + " : " + data);


			  }


			} catch (SQLException e) {

			    out.println("Error while operating on updatable ResultSet " + e.getMessage());

			}

			  }
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
