package pages

import modules.*
import geb.Page

class FrontPage extends Page {
	
	static at = { title.contains("Login") }
	
	static content = {
		
		// Define our two lots of speakers
//		springOneSpeakers { speakersAfterHeading("SpringOne Featured Speakers") }
//		twoGxSpeakers { speakersAfterHeading("2GX Featured Speakers") }
//		
//		speakersAfterHeading { module(Speakers, $("h3", text: it).next()) }
	}

}