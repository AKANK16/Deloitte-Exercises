

import java.util.Arrays;
public class Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empl []emp= new Empl[10];
		
		emp[0]=new Empl(12,"AAA","HR");
		emp[1]=new Empl(23,"jjj","Coder");
		emp[2]=new Empl(212,"rrr","Coder");
		emp[3]=new Empl(56,"qqq	","CEO");
		emp[4]=new Empl(89,"ggh","HR");
		emp[5]=new Empl(34,"dff","Sales Head");
		emp[6]=new Empl(25,"ssh","CEO");
		emp[7]=new Empl(889,"tth","Coder");
		emp[8]=new Empl(112,"hhh","HR");
		emp[9]=new Empl(156,"uuu","Manager");

		
		
		
		Arrays.sort(emp);
		{
			for(int i=0; i<emp.length; i++)
				System.out.println(emp[i]);
			
		}
	}

}
