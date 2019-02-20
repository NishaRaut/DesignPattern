package com.bridgelabz.structuralDesignPattern.facadeDesignPattern;
import java.sql.Connection;

import com.bridgelabz.structuralDesignPattern.facadeDesignPattern.HelperFacade;
import com.bridgelabz.structuralDesignPattern.facadeDesignPattern.MySqlHelper;
import com.bridgelabz.structuralDesignPattern.facadeDesignPattern.OracleHelper;

public class FacadePatternTest {
	public static void main(String[] args) {
		String tableName="Employee";
		
		//generating MySql HTML report and Oracle PDF report without using Facade
		Connection con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);
		
		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);
		
		//generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}
}