package snippet;

//import java.io.FileOutputStream;
//import java.util.List;
//
//import org.apache.poi.ss.usermodel.CellStyle;
//import org.apache.poi.ss.usermodel.IndexedColors;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFCellStyle;
//import org.apache.poi.xssf.usermodel.XSSFFont;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import dao.ArrayGakusei;
//import dao.ArrayGakusei.Gakusei;
//
//public class XSSFSample {
//
//	public static void main(String[] args) throws Exception {
//
//		List<Gakusei> gakuseitati = ArrayGakusei.getGakusei();
//
//		// （1）Excelファイルを表すワークブックオブジェクトを生成
//		XSSFWorkbook wb = new XSSFWorkbook();
//
//		// （2）ワークシートオブジェクトを生成
//		XSSFSheet sheet = wb.createSheet("XSSFSheet1");
//
//		// （3-1）セルスタイルへ罫線の設定(塗りつぶし)
//		CellStyle styleForeground = wb.createCellStyle();
//		styleForeground.setFillPattern(CellStyle.SOLID_FOREGROUND);
//		styleForeground.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
//		styleForeground.setBorderBottom(XSSFCellStyle.BORDER_THIN);
//		styleForeground.setBottomBorderColor(IndexedColors.BLACK.getIndex());
//		styleForeground.setBorderLeft(XSSFCellStyle.BORDER_THIN);
//		styleForeground.setLeftBorderColor(IndexedColors.BLACK.getIndex());
//		styleForeground.setBorderRight(XSSFCellStyle.BORDER_THIN);
//		styleForeground.setRightBorderColor(IndexedColors.BLACK.getIndex());
//		styleForeground.setBorderTop(XSSFCellStyle.BORDER_THIN);
//		styleForeground.setTopBorderColor(IndexedColors.BLACK.getIndex());
//
//		// （3-2）セルスタイルへ罫線の設定(セル色)
//		XSSFFont font = wb.createFont();
//		font.setFontHeightInPoints((short) 8);
//		font.setFontName("Courier New");
//		font.setColor(IndexedColors.RED.getIndex());
//
//		CellStyle styleFontColorRed = wb.createCellStyle();
//		styleFontColorRed.setFont(font);
//		styleFontColorRed.setBorderBottom(XSSFCellStyle.BORDER_THIN);
//		styleFontColorRed.setBottomBorderColor(IndexedColors.BLACK.getIndex());
//		styleFontColorRed.setBorderLeft(XSSFCellStyle.BORDER_THIN);
//		styleFontColorRed.setLeftBorderColor(IndexedColors.BLACK.getIndex());
//		styleFontColorRed.setBorderRight(XSSFCellStyle.BORDER_THIN);
//		styleFontColorRed.setRightBorderColor(IndexedColors.BLACK.getIndex());
//		styleFontColorRed.setBorderTop(XSSFCellStyle.BORDER_THIN);
//		styleFontColorRed.setTopBorderColor(IndexedColors.BLACK.getIndex());
//
//		// (3-3)セルスタイルへ罫線の設定
//		CellStyle styleBasic = wb.createCellStyle();
//		styleBasic.setBorderBottom(XSSFCellStyle.BORDER_THIN);
//		styleBasic.setBottomBorderColor(IndexedColors.BLACK.getIndex());
//		styleBasic.setBorderLeft(XSSFCellStyle.BORDER_THIN);
//		styleBasic.setLeftBorderColor(IndexedColors.BLACK.getIndex());
//		styleBasic.setBorderRight(XSSFCellStyle.BORDER_THIN);
//		styleBasic.setRightBorderColor(IndexedColors.BLACK.getIndex());
//		styleBasic.setBorderTop(XSSFCellStyle.BORDER_THIN);
//		styleBasic.setTopBorderColor(IndexedColors.BLACK.getIndex());
//
//		for (int i = 0; i < gakuseitati.size(); i++) {
//			Gakusei gakusei = gakuseitati.get(i);
//
//			XSSFRow row = sheet.createRow(i);
//
//			XSSFCell cell = row.createCell(1);
//			cell.setCellValue(gakusei.getGakunen());
//
//			cell = row.createCell(2);
//			cell.setCellValue(gakusei.getKurasu());
//
//			cell = row.createCell(3);
//			cell.setCellValue(gakusei.getNamae());
//
//			// データの学年が3の倍数の時セルを塗りつぶす
//			if (gakusei.getGakunen() % 3 == 0) {
//				for (int j = 1; j <= 3; j++) {
//					cell = row.getCell(j);
//					cell.setCellStyle(styleForeground);
//				}
//			} else if (gakusei.getGakunen() % 10 == 0) {
//				// データの学年が3の倍数の時セル色を付ける
//				for (int j = 1; j <= 3; j++) {
//					cell = row.getCell(j);
//					cell.setCellStyle(styleFontColorRed);
//				}
//			} else {
//				for (int j = 1; j <= 3; j++) {
//
//					cell = row.getCell(j);
//					cell.setCellStyle(styleBasic);
//				}
//			}
//		}
//
//		// （8）ワークブックオブジェクトをファイル出力
//		FileOutputStream fileOut = new FileOutputStream("XSSFSample.xlsx");
//		wb.write(fileOut);
//		fileOut.close();
//	}
//}
