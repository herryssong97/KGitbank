package hipkg;



public class StringKibon { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		int pp=100;//stack 
		String aaa="ondal";//heap 
       
		//NPE(Null Pointer Exception) 
	    String ppp=null;
	    String qqq="";//���ڿ�, ���̰� 0�� ���ڿ� 
	    
	    System.out.println(qqq.length()>0);
	    System.out.println(ppp.length()>0);
	    
	     String irum1="ondal";
	     String irum2="ondal";
	    
	    if(irum1==irum2) //������
	    	System.out.println("������");
	    else 
	    	System.out.println("�ٸ���");
	    
	    

	    if(irum1.equals(irum2))//�����  
	    	System.out.println("������");
	    else 
	    	System.out.println("�ٸ���");
	    
	}
	
	
	
	
	
	

}
