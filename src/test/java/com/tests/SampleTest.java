package com.tests;

import com.intuit.karate.junit5.Karate;

class SampleTest {

	@Karate.Test
	Karate testSpecificFeature() {
		return Karate.run("Tags").relativeTo(getClass());
	}
	
//	@Karate.Test
//	Karate testTags() {
//		To run tag regression
//		return Karate.run("Tags").tags("@regression").relativeTo(getClass());
//
//		To run tag regression or smoke
//		return Karate.run("Tags").tags("@regression,@smoke").relativeTo(getClass());
//
//		To run tag regression and smoke
//		return Karate.run("Tags").tags("@regression","@smoke").relativeTo(getClass());
//
//		To run tag regression or smoke and not sanity
//		return Karate.run("Tags").tags("@regression,@smoke","~@sanity").relativeTo(getClass());
//
//	}

}