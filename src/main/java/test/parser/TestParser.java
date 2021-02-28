package test.parser;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import test.model.Paradigm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestParser {

    public TestParser() throws IOException { }

    public static List<Paradigm> readXLSFileTest1() throws IOException {

        //Данные для первого теста
        FileInputStream inputStream = new FileInputStream(new File("src\\test\\java\\dataTest\\Test1.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();

        List<Paradigm> paradigms = new ArrayList();
        // Инициализация футбольной лиги
        String nameParadigm = "";
        double countFC = 0;
        String country = "";

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();

                // Инициализация футбольной лиги
                if(row.getRowNum() <= 2)
                {
                    if (cell.getColumnIndex() == 0)
                    {
                        nameParadigm = cell.getStringCellValue();
                    }
                }
            }

            if(row.getRowNum() <= 2) {
                paradigms.add(new Paradigm(nameParadigm));
            }
        }
        return paradigms;
    }

//    public static List<FootballCLub> readXLSFileTest2() throws IOException {
//
//        //Данные для второго теста
//        FileInputStream inputStream = new FileInputStream(new File("src\\test\\java\\dataTest\\Test2.xlsx"));
//        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//        XSSFSheet sheet = workbook.getSheetAt(0);
//        Iterator<Row> rowIterator = sheet.iterator();
//
//        List<FootballCLub> footballCLubs = new ArrayList();
//        // Инициализация футбольного клуба
//        String nameClub = "";
//        String nameLeagueClub = "";
//        double budget = 0;
//        double countPlayers = 0;
//        String nameOwner = "";
//        double countAwards = 0;
//
//        while (rowIterator.hasNext()) {
//            Row row = rowIterator.next();
//            Iterator<Cell> cellIterator = row.cellIterator();
//
//            while (cellIterator.hasNext()) {
//                Cell cell = cellIterator.next();
//
//                // Инициализация футбольного клуба
//                if(row.getRowNum() >= 3 && row.getRowNum() <= 11)
//                {
//                    if (cell.getColumnIndex() == 0)
//                    {
//                        nameClub = cell.getStringCellValue();
//                    }
//                    else if (cell.getColumnIndex() == 1)
//                    {
//                        nameLeagueClub = cell.getStringCellValue();
//                    }
//                    else if (cell.getColumnIndex() == 2)
//                    {
//                        budget = cell.getNumericCellValue();
//                    }
//                    else if (cell.getColumnIndex() == 3)
//                    {
//                        countPlayers = cell.getNumericCellValue();
//                    }
//                    else if (cell.getColumnIndex() == 4)
//                    {
//                        nameOwner = cell.getStringCellValue();
//                    }
//                    else if (cell.getColumnIndex() == 5)
//                    {
//                        countAwards = cell.getNumericCellValue();
//                    }
//                }
//            }
//
//            if(row.getRowNum() >= 3 && row.getRowNum() <= 11) {
//                footballCLubs.add(new FootballCLub(nameClub, nameLeagueClub, (int)budget, (int)countPlayers, nameOwner, (int)countAwards));
//            }
//        }
//        return footballCLubs;
//    }
//
//    public static List<Player> readXLSFileTest3() throws IOException {
//
//        //Данные для третьего теста
//        FileInputStream inputStream = new FileInputStream(new File("src\\test\\java\\dataTest\\Test3.xlsx"));
//        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//        XSSFSheet sheet = workbook.getSheetAt(0);
//        Iterator<Row> rowIterator = sheet.iterator();
//
//        List<Player> players = new ArrayList();
//        List<FootballCLub> footballClubsFromSpain = new ArrayList();
//
//        // Инициализация игрока
//        String nameClubPlayer = "";
//        String lnamePlayer = "";
//        String position = "";
//        double costPlayer = 0;
//        String nationality = "";
//        double age = 0;
//
//        while (rowIterator.hasNext()) {
//            Row row = rowIterator.next();
//            Iterator<Cell> cellIterator = row.cellIterator();
//
//            while (cellIterator.hasNext()) {
//                Cell cell = cellIterator.next();
//
//                // Инициализация футбольного клуба
//                if(row.getRowNum() >= 12 && row.getRowNum() <= 32)
//                {
//                    if (cell.getColumnIndex() == 0)
//                    {
//                        nameClubPlayer = cell.getStringCellValue();
//                    }
//                    else if (cell.getColumnIndex() == 1)
//                    {
//                        lnamePlayer = cell.getStringCellValue();
//                    }
//                    else if (cell.getColumnIndex() == 2)
//                    {
//                        position = cell.getStringCellValue();
//                    }
//                    else if (cell.getColumnIndex() == 3)
//                    {
//                        costPlayer = cell.getNumericCellValue();
//                    }
//                    else if (cell.getColumnIndex() == 4)
//                    {
//                        nationality = cell.getStringCellValue();
//                    }
//                    else if (cell.getColumnIndex() == 5)
//                    {
//                        age = cell.getNumericCellValue();
//                    }
//                }
//            }
//
//            if(row.getRowNum() >= 12 && row.getRowNum() <= 32) {
//                players.add(new Player(nameClubPlayer, lnamePlayer, position, (int)costPlayer, nationality, (int)age));
//            }
//        }
//        return players;
//    }
}
