import spock.lang.Stepwise

import org.openqa.selenium.Keys

import pages.FrontPage
import pages.ContactUsPage
import geb.Browser; 

@Stepwise
class ChimpsSpec extends BaseSpec {
	def "at the front page"() {
		when:
		to FrontPage

		then:
		at FrontPage
	}

	def "drive chimps"() {
		when:
		Browser.drive("http://localhost:9090/chimps") {
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
			println ("form")
			//println ("form").find("input", name: "username")
		}
		
		then:
		assert true
	}
}