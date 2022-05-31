package tema4_passc;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Student Alis = new Student(37, "Alis", 7.5);
		Student Vlad = new Student(1, "Vlad", 9);
		Student Andreea = new Student(59, "Andreea", 8);
		Student Mihai = new Student(12, "Mihai", 9);
		Student Daniela = new Student(10, "Daniela", 6);
		
		List<Student> students=new ArrayList<>();
	    students.add(Alis);
	    students.add(Vlad);
	    students.add(Andreea);
	    students.add(Mihai);
	    students.add(Daniela);
	    
	    AlgoritmHoroscop alg = new AlgoritmHoroscop();
	    alg.listaStudenti(students);
	    alg.afisare_medie_prezisa(37);
	    alg.afisare_medie_prezisa(1);
	    alg.afisare_medie_prezisa(59);
	    alg.afisare_medie_prezisa(12);
	    alg.afisare_medie_prezisa(10);
	    alg.studentiMedieScazutaPeste8();
	    alg.studentCuZiuaBuna(37);
	    alg.studentCuZiuaBuna(1);
	    alg.studentCuZiuaBuna(59);
	    alg.studentCuZiuaBuna(12);
	    alg.studentCuZiuaBuna(10);
	      
//	    StudentDatabaseInterface database = new SqliteDB();
//	    try {
//	        Class.forName("org.sqlite.JDBC");
//	    } catch (ClassNotFoundException eString) {
//	        System.err.println("Could not init JDBC driver - driver not found");
//	    }
//	    database.connect();
//	    database.createNewDatabase();
	    
	    StudentDatabaseInterface studDB = new XML();
	    alg.listaStudenti(studDB.getStudentsData());
	    alg.afisare_medie_prezisa(4);
	    alg.studentiMedieScazutaPeste8();
	    alg.studentCuZiuaBuna(4);
	}

}
