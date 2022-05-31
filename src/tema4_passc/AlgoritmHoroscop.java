package tema4_passc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AlgoritmHoroscop {

	
	private static ArrayList<Student>students=new ArrayList<>();
	
	public void listaStudenti(List<Student> listaStudenti)
	{
		students.addAll(listaStudenti);
	}
	
	public boolean predictie(int id, String nume)
	{
		int aux = id, index;
		int val=0;
		
		while( aux > 0 )
		{
			val = val + aux % 10;
			aux = aux / 10;
		}
		for(index=0 ; index<nume.length(); index++)
		{
			val = val + nume.charAt(index);
		}
		if(val % 2 == 1)
			return true;
		else 
			return false;
	}
	
    public void studentiMedieScazutaPeste8()
    {
    	int contor=0;
    	for(Student student:students)
    	{
    		if(student.getNota() > 8 && (predictie(student.getId(),student.getNume())==false))
    		{	
    			contor++;
    		}
    	}
    	
        System.out.println("Numarul studentilor cu media peste 8 care vor avea media scazuta este: " + contor);
    	
    }
    
    public void afisare_medie_prezisa(int id)
    {
    	String auxNume="";
    	
        for(Student student:students)
        {
            if(student.getId()==id)
            {
                auxNume=student.getNume();
                break;
            }
        }
        if(predictie(id, auxNume))
        {
            System.out.println("Studentul cu numele "+ auxNume + " va avea media mai mare");
        }
        else
        {
            System.out.println("Studentul cu numele " + auxNume + " va avea media mai mica");
        }
    }
    
    public void studentCuZiuaBuna(int id)
    {
    	String nume="";
    	int index=0, val=0;
    	for(Student student:students)
    	{
    		if(student.getId() == id)
    		{
    			nume=student.getNume();
    		}
    	}
    	//calcul zi curenta
    	LocalDate dataAzi = LocalDate.now();
        int ziuaCurenta = dataAzi.getDayOfMonth();
        
        val = ziuaCurenta + nume.charAt(0);
        
        if(val % 2 == 1) 
        {
        	System.out.println("Astrele ti-au suras, "+ nume + ", vei avea o zi buna");
        }
        else
        {
        	System.out.println("Mercur e in retrograd, "+ nume + ", astazi nu vei avea o zi buna");
        }
    }
    
}
