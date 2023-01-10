package com.nt.view;

import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.nt.model.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("excelreport")
public class EmployeeExcelView extends AbstractXlsView {

	private int i=0;
	
	@Override
	protected void buildExcelDocument(Map<String, Object> map, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		// get Model Attribute
		Iterable<Employee> empsList= (Iterable<Employee>) map.get("empsList");
		// create sheet
		Sheet sheet1 = workbook.createSheet("sheet");
		// add Rows to sheet
		empsList.forEach(emp->{
			// add row Sheet representing employee record
			Row row = sheet1.createRow(i);
			// add cells to Row
			row.createCell(0).setCellValue(emp.getEmpno());
			row.createCell(1).setCellValue(emp.getEname());
			row.createCell(2).setCellValue(emp.getJob());
			row.createCell(3).setCellValue(emp.getSal());
			if(emp.getDeptno()!=null)
			row.createCell(4).setCellValue(emp.getDeptno());
			i++;
		});
	}

}
