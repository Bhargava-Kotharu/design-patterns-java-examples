package com.bkotharu.examples.template;

public abstract class DocumentParserTemplate {

	public abstract void read();

	public abstract void process();

	public abstract void write();

	public void parseDocument() {
		this.read();
		this.process();
		this.write();
	}

}
