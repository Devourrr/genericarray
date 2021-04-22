package week05.day3;

public class MyString {

    private char[  ] str ;  //멤버변수 
    
    
    //생성자
    public MyString(char[] m_str)
   {
    	 //넘어온 배열의 크기만큼 배열생성
         str = new char[m_str.length];		         

         // 넘어온 문자배열의 내용을 하나씩 복사함
         for(int i=0; i<m_str.length;i++)
             str[i] = m_str[i];
    }

        
    
    public void disp() {
   	 	for(int i=0;i<str.length; i++)
   		 System.out.print(str[i]);
    }
    
    public char charAt(int index) {
    	return str[index];
    }
    
   
   
    
    public static void main(String[] args)
    {
	   	 char[] str= {'h','e','l','l','o'};
	   	 MyString s = new MyString(str);
	   	 s.disp();
	     System.out.println("\n" +s.charAt(0));	   	 
	   	 
	   	  
    }	
}
