import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Labtest {

	public static void main(String[] args) {

		try {
			// ָ��excel��·��
			File src = new File("C:\\Users\\MKZ\\Desktop\\input.xlsx");

			// �����ļ�
			FileInputStream fis = new FileInputStream(src);

			// ����workbook
			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			// ����sheet
			XSSFSheet sh1 = wb.getSheetAt(0);

			// ��ȡ����
			for (int i = 0; i < sh1.getPhysicalNumberOfRows(); i++) {
				System.out.println(sh1.getRow(i).getCell(0).getStringCellValue());
				System.out.println(sh1.getRow(i).getCell(0).getStringCellValue().substring(4));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}