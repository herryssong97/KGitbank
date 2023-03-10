package hipkg;



public class StringKibon { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		int pp=100;//stack 
		String aaa="ondal";//heap 
       
		//NPE(Null Pointer Exception) 
	    String ppp=null;
	    String qqq="";//빈문자열, 길이가 0인 문자열 
	    
	    System.out.println(qqq.length()>0);
	    System.out.println(ppp.length()>0);
	    
	     String irum1="ondal";
	     String irum2="ondal";
	    
	    if(irum1==irum2) //번지비교
	    	System.out.println("같구만");
	    else 
	    	System.out.println("다르네");
	    
	    

	    if(irum1.equals(irum2))//내용비교  
	    	System.out.println("같구만");
	    else 
	    	System.out.println("다르네");
	    
	}
	
	
	
	
	
	

}
