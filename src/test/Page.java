package test;

public class Page {
	
	private static String title;
	
	public String createBtns(int tid) {
		String html;
		html = "<td><div class=\"btn btn-primary\">edit</div></\td>";
		html += "<td><div class=\"btn btn-danger\" onclick=\"window.location('/Inventory/Delete?id="+tid+"')\">delete</div></\td>";
		
		return html;
	}
	
	public static void setTitle(String t) {
		title=t;
	}
	
	public static String getTitle() {
		return title;
	}
}
