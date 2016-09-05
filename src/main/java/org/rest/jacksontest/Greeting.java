package org.rest.jacksontest;

import java.util.Map;

public class Greeting {

	private String content;

	private Map<String, Link> _links;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Map<String, Link> get_links() {
		return _links;
	}

	public void set_links(Map<String, Link> _links) {
		this._links = _links;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("\n");
		sb.append("content=" + content);
		sb.append("\n");
		sb.append("_links=" + _links);
		sb.append("\n");
		sb.append("}");

		return sb.toString();
	}

}
