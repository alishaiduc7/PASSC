package tema4_passc;

public class Student {

	private int id;
	private String nume;
	private double nota;
	
	public Student(int id, String nume, double nota)
	{
		this.id = id;
		this.nume = nume;
		this.nota = nota;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getNume() 
	{
		return nume;
	}
	public double getNota() 
	{
		return nota;
	}
	public void setNota(double nota) 
	{
		this.nota = nota;
	}
	public String toString() 
	{
		return this.id + " " + this.nume + " " + this.nota;
	}
	
}
