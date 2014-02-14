package com.oosic.webservice.model.vo;

import java.util.List;



public class Greeting {

    private final long id;
    private final String content;
    private List<String> strings;

    
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
    
    public Greeting(long id, String content, List<String> strings) {
        this.id = id;
        this.content = content;
        this.strings = strings;
    }

    public List<String> getStrings() {
		return strings;
	}

	public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
