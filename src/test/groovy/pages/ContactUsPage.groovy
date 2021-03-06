package pages

import geb.*

class ContactUsPage extends BasePage {

	static at = { pageName == "Contact Us" }

	static content = {
		// Not required because there may not be an error message
		errorMessage(required: false) { $("span.errorMessage").text() }
		
		sendButton(to: [ContactUsPage, FrontPage]) { $("input#FeedbackAdd_0") }
	}
}