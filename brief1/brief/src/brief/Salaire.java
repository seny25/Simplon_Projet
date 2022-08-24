package brief;



public class Salaire {
	public static void main(String[] args) {
		
				
		EmployeFixe EF= new EmployeFixe("boukhanchouch","Itihal","12/01/1990",4000);		
		EmployeHoraire EH=new EmployeHoraire( "balde","Seny","25/03/1993",34,190,6460);
		EmployeCom EC=new EmployeCom("sana", "balde", "23/05/1999",200,0.5,10);
		
		System.out.println(EF.toString());
		System.out.println(EH.toString());
		System.out.println(EC.toString());
  }
}	

