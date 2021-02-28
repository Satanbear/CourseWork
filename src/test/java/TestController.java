import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TestController {

//    @Mock
//    ModelImpl model;
//
//    @InjectMocks
//    Controller controller;
//
//    @Test
//    public void testInsertFootballLeague() throws IOException, SQLException {
//        //DAOFootballLeague service = new DAOFootballLeague();
//        FootballLeague footballLeague = new FootballLeague();
//        //FootballLeague footballLeague1 = service.getByID(100);
//        controller.addFootballLeague(footballLeague);
//        verify(model, times(1)).addFootballLeague(any());
//        //Assert.assertEquals(footballLeague1.getCountry(), footballLeague.getCountry());
//    }
//
//    @Test
//    public void testUpdateFootballLeague() throws IOException, SQLException {
//        FootballLeague footballLeague = new FootballLeague("Barclays",3,"England");
//        controller.updateFootballLeague(1,footballLeague);
//        verify(model, times(1)).updateFootballLeague(anyInt(),any());
//    }
//
//    @Test
//    public void testDeleteFootballLeague() throws IOException, SQLException {
//        controller.deleteFootballLeague(45);
//        verify(model, times(1)).delFootballLeague(anyInt());
//    }
//
//    @Test
//    public void testGetAllFootballLeagues() throws Exception {
//        DAOFootballLeague service = new DAOFootballLeague();
//        List<FootballLeague> expectedData = ParserFromExcel.readXLSFileTest1();
//        //Add footballLeagues in DB
//        for (FootballLeague expectedDatum : expectedData) {
//            service.insert(expectedDatum);
//        }
//        List<FootballLeague> footballLeaguesActual = service.getAll();
//        //CheckData
//        for(int i = 0; i < expectedData.size(); i++) {
//            Assert.assertEquals(expectedData.get(i).getCountry(), footballLeaguesActual.get(i).getCountry());
//        }
//    }
//
//    @Test
//    public void testGetAllFootballClubs() throws Exception {
//        DAOFootballClub service = new DAOFootballClub();
//        List<FootballCLub> footballCLubs = service.getAll();
//        List<FootballCLub> expectedData = ParserFromExcel.readXLSFileTest2();
//        Assert.assertEquals(expectedData.size(), footballCLubs.size());
//    }
//
//    @Test
//    public void testGetAllPlayers() throws Exception {
//        DAOPlayer service = new DAOPlayer();
//        List<Player> players = service.getAll();
//        List<Player> expectedData = ParserFromExcel.readXLSFileTest3();
//        Assert.assertEquals(expectedData.size(), players.size());
//
//        for(int i = 0; i < expectedData.size(); i++) {
//            Assert.assertEquals(expectedData.get(i).getFioPlayer(), players.get(i).getFioPlayer());
//        }
//    }
// Не комент



//    @Test
//    public void getFCFromSpain() throws Exception {
//        DAOFootballClub service = new DAOFootballClub();
//        List<FootballCLub> footballClubs = service.getClubsFromSpain();
//        List<FootballCLub> expectedData = ParserFromExcel.readXLSFileTest3();
//        Assert.assertEquals(expectedData.size(), footballClubs.size());
//    }
}
