package stepdefinitions;

import java.util.Map;
import java.util.Properties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelHandler;
import utilities.PropertiesFileReader;
import utilities.ReadexcelTestData;

public class ReadexcelBDDstep {

	PropertiesFileReader obj=new PropertiesFileReader();
	ReadexcelTestData readexcel=new ReadexcelTestData();

	@Given("Read test data for testcase_{int}")
	public void read_test_data_for_testcase(Integer int1) throws Exception {
		Properties properties=obj.getproperty();

		Map<String,String> TestdataInMap=ExcelHandler.getTestdataInmap
				(properties.getProperty("testdatafilepath"),properties.getProperty("sheetname"),"Testcase_001");
		System.out.println(TestdataInMap.get("Skill_7"));
		readexcel.setTestdatamap(TestdataInMap);
	}

	@When("Read test data for skill two")
	public void read_test_data_for_skill_two() {
		Map<String, String> testdatamap = readexcel.getTestdatamap();
		System.out.println(testdatamap.get("Skill_2"));
	}

	@Then("Read test data for skill three")
	public void read_test_data_for_skill_three() {
		Map<String, String> testdatamap = readexcel.getTestdatamap();
		System.out.println(testdatamap.get("java"));
	}
}
