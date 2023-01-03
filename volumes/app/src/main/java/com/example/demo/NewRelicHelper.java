package com.example.demo;

import org.springframework.stereotype.Component;

import com.newrelic.api.agent.NewRelic;

@Component("NewRelic")
public class NewRelicHelper {
	public String getBrowserTimingHeader() {
		return NewRelic.getBrowserTimingHeader();
		
	}
	public String getBrowserTimingFooter() {
		return NewRelic.getBrowserTimingFooter();
	}
}
