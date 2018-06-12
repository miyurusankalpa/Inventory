package modals;

public abstract class Page {
	
	private static String title;
	
	public String createBtns(int tid, String page) {
		String html;
		html = "<td><a class=\"btn btn-primary\" href=\"/Inventory/edit/"+page+".jsp?id="+tid+"\"><i class=\"fa fa-edit\"></i> edit</a></\td>";
		html += "<td><a class=\"btn btn-danger\" href=\"/Inventory/Delete?id="+tid+"&table="+page+"\"><i class=\"fa fa-trash\"></i> delete</a></\td>";
		
		return html;
	}
	
	public String createbtnreport(int i,String page) {
		return "<td><a href=\"/Inventory/reports/"+page+".jsp?id="+i+"\" class=\"btn btn-dark\"><i class=\"fa fa-list-alt\"></i> Report</a></td>";
	}
	
	public static void setTitle(String t) {
		title=t;
	}
	
	public static String getTitle() {
		return title;
	}
}
