package week05.day3;

public class MyString {

    private char[  ] str ;  //������� 
    
    
    //������
    public MyString(char[] m_str)
   {
    	 //�Ѿ�� �迭�� ũ�⸸ŭ �迭����
         str = new char[m_str.length];		         

         // �Ѿ�� ���ڹ迭�� ������ �ϳ��� ������
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
