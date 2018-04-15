import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Labtest {

	public static void main(String[] args) {

		try {
			// 指定excel的路径
			File src = new File("C:\\Users\\MKZ\\Desktop\\input.xlsx");

			// 加载文件
			FileInputStream fis = new FileInputStream(src);

			// 加载workbook
			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			// 加载sheet
			XSSFSheet sh1 = wb.getSheetAt(0);

			// 读取数据
			for (int i = 0; i < sh1.getPhysicalNumberOfRows(); i++) {
				System.out.println(sh1.getRow(i).getCell(0).getStringCellValue());
				System.out.println(sh1.getRow(i).getCell(0).getStringCellValue().substring(4));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}