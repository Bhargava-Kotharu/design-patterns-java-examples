package com.bkotharu.examples.template;

/**
 * Simple Template Design Pattern Example
 *
 */
public class TemplatePatternExample {
	public static void main(String[] args) {
		DocumentParserTemplate template = new WordDocumentParser();
		template.parseDocument();
		System.out.println("====================================");
		template = new PdfDocumentParser();
		template.parseDocument();
	}
}
