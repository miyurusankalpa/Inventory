package test;

public class Page {
	
	private static String title;
	
	public String createBtns(int tid, String page) {
		String html;
		html = "<td><div class=\"btn btn-primary\" onclick=\"window.location('/Inventory/edit/"+page+".jsp?id="+tid+"')\">edit</div></\td>";
		html += "<td><div class=\"btn btn-danger\" onclick=\"window.location('/Inventory/Delete?id="+tid+"&t="+page+"')\">delete</div></\td>";
		
		return html;
	}
	
	public static void setTitle(String t) {
		title=t;
	}
	
	public static String getTitle() {
		return title;
	}
}
