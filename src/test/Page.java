package test;

public class Page {
	
	private static String title;
	
	public String createBtns() {
		String html;
		html = "<td><div class=\"btn btn-info\">edit</div><\td>";
		html += "<td><div class=\"btn btn-danger\">delete</div><td>";
		
		return html;
	}
	
	public static void setTitle(String t) {
		title=t;
	}
	
	public static String getTitle() {
		return title;
	}
}
