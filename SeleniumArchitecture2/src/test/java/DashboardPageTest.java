import org.testng.annotations.Test;

public class DashboardPageTest extends BaseTest{

    @Test
    public void testDashboard(){
        startTest().login().clickRecruitment();

    }
}
