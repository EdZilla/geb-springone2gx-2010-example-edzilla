import spock.lang.Stepwise

import org.openqa.selenium.Keys

import pages.FrontPage
import pages.ContactUsPage
import pages.ReservationByEnvironmentReportPage
import geb.Browser; 

@Stepwise
class ChimpsSpec extends BaseSpec {	
	
//	def "at the front page"() {
//		when:
//		to FrontPage
//
//		then:
//		at FrontPage
//	}

	def "login to chimps"() {
		when:
		//Browser.drive("http://localhost:9090/chimps") {
		Browser.drive("http://10.252.167.37:8080/chimps") {
			assert title == "Login"
			println "looking for the login text field"
			println $("td").size()
			println $("td")
			
			println $("form")
			println $("table")
			println $("table", class: "simpleTable")
			println $("table", class: "simpleTable", id:"left_table")
			println $("table", class: "simpleTable", id:"left_table")
			def table = $("table", class: "simpleTable", id:"left_table")
			println table
			println $("tr")
			println $("tr", 2)
			println $("tr",2).text()
			println $("tr",3).text()
			println $("tr",4).text()
			println $("form")
			println $("form").find("input", name: "username")
			println $("form").username()
			$("form").username = "admin"
			println $("form").username()
			println $("form").password()
			println $("form").password = "admin"
			println $("form").password()
			println $("form").find("input", value: "Sign in")
			$("form").find("input", value: "Sign in").click()
			
			//println $("a.customizedLink")
		}
		
		then:
		assert title.contains("Login")
		//at ReservationByEnvironmentReportPage
		//at FrontPage
		
		//assert true
	}
}