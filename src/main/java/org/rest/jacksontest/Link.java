package org.rest.jacksontest;

public class Link {

	private String href;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(href);
		
		return sb.toString();
	}
}
