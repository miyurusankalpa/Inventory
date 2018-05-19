package test;

public class Page {
	
	private static String title;
	
	public String createBtns(int tid, String page) {
		String html;
		html = "<td><a class=\"btn btn-primary\" href=\"/Inventory/edit/"+page+".jsp?id="+tid+"\">edit</a></\td>";
		html += "<td><a class=\"btn btn-danger\" href=\"/Inventory/Delete?id="+tid+"&table="+page+"\">delete</a></\td>";
		
		return html;
	}
	
	public static void setTitle(String t) {
		title=t;
	}
	
	public static String getTitle() {
		return title;
	}
}
