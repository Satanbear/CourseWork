package test;

import test.DAO.DAOParadigm;
//import test.parser.ParserFromExcel;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
//        DAOFootballLeague footballLeague = new DAOFootballLeague();
        DAOParadigm paradigm = new DAOParadigm();
//        Controller controller = new Controller();
//        DAOFootballClub footballClub = new DAOFootballClub();
//        DAOPlayer player = new DAOPlayer();
//        System.out.println(footballClub.getAll());
//        System.out.println(footballLeague.getAll());
//        System.out.println(player.getAll());
//        System.out.println(controller.getFootballLeagueByID(45));
//        System.out.println(footballLeague.getByID(2));
//        ParserFromExcel.readXLSFileTest1();
        System.out.println(paradigm.getAll());
//        paradigm.update(1,);
//        System.out.println(paradigm.getAll());
    }
}
