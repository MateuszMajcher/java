class Watek extends Thread {
	String wysun="";
	public Watek(String str,int numer){
		     super(str);
		     for(int i=1;i<numer;i++) wysun = wysun+"\t";
		}
	
	public void run(){
		 for(int i=0;i<4;i++){
			 System.out.println(wysun + i +" "+getName());
			 try{
				 sleep(1000);
				 }catch ( InterruptedException e ) 
			{ e.printStackTrace(); } 
				 System.out.println(wysun + getName() + " koniec");
				  }
		
		}
	}