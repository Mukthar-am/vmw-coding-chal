//package questions.com.vmware.smartmart.snake;
//
//
//import cucumber.api.DataTable;
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class CucumberStepDefs {
//
//    @Given("^a new game (\\d+) by (\\d+) game$")
//    public void newGame(int rows, int cols) {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("Rows :"+rows +" Cols :"+cols);
//        throw new PendingException();
//    }
//
//    @When("^I ask where is snake head$")
//    public void playGameWhenNoFood() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Given("^the following state of snake game$")
//    public void restoreGameFromState(DataTable initialState) throws Exception {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//        // E,K,V must be a scalar (String, Integer, Date, enum etc)
//        throw new PendingException();
//    }
//
//
//    @When("^I offer food using$")
//    public void playGameWithFood(DataTable foodLocation) {
//        System.out.println("Input Food location "+foodLocation);
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Then("^it should show following state$")
//    public void displayStateAfterFood(DataTable expected) {
//        System.out.println("Expected position"+expected);
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//}
