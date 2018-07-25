package com.bkotharu.examples.template;

public class PdfDocumentParser extends DocumentParserTemplate {

	@Override
	public void read() {
		System.out.println("Reading pdf document!");
	}

	@Override
	public void process() {
		System.out.println("Processing pdf document!");
	}

	@Override
	public void write() {
		System.out.println("Writing pdf document!");
	}

}
