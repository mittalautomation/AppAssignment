package StepDefinitions;

import com.app.pages.AppOperationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppStepDefinition extends AppOperationPage {
	AppOperationPage AppPage;
	
	public AppStepDefinition() {
		AppPage = new AppOperationPage();
	}
		    @When("^User enter fromDate \"([^\"]*)\"$")
		    public void User_enter_fromDate(String arg0) {
		    }

		    @And("^User enter toDate \"([^\"]*)\"$")
		    public void User_enter_toDate(String arg0) {

		    }

		    @Then("^Calculate Instrumentwise traded volume and List of instrument not traded between the daterange$")
		    public void Calculate_Instrumentwise_traded_volume_and_List_of_instrument_not_traded_between_the_daterange(){
		    	try {
		    		AppOperationPage.getInstrumentwiseTradedAndnonTradedList();
				} catch (Throwable e) {
					e.printStackTrace();
				}
		    }

		   /* @And("^Get List of instrument not traded between the dates$")
		    public void Get_List_of_indtrument_not_traded_between_the_dates(){
		    	try {
		    		AppOperationPage.getListOfInstrumentnotTraded();
				} catch (Throwable e) {
					e.printStackTrace();
				}*/
		    
}
		