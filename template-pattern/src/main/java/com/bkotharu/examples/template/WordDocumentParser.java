package com.bkotharu.examples.template;

public class WordDocumentParser extends DocumentParserTemplate {

	@Override
	public void read() {
		System.out.println("Reading word document!");
	}

	@Override
	public void process() {
		System.out.println("Processing word document!");
	}

	@Override
	public void write() {
		System.out.println("Writing word document!");
	}

}
