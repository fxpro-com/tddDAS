package jamesshore.com;

public class QueryString {

	private String name_query;
	
	public QueryString(String _query) {
		name_query = _query;
	}

	public long count() {
		 if (name_query == "")
			 return 0;
         else 
        	 return 1;
	}


}
