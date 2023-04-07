package QuizS7;

import java.util.Scanner;

class Person{
    String name;
    int dob_dd;
    int dob_mm;
    int dob_yyyy;

    
    public Person(String name, int dd, int mm, int yyyy){
        this.name = name;
        this.dob_dd = dd;
        this.dob_mm = mm;
        this.dob_yyyy = yyyy;
    }

	public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void display(){
        System.out.println("Name : " + name);
        System.out.println("DOB : " + dob_dd + " " + dob_mm + " "+ dob_yyyy);
    }
}

class Mahasiswa extends Person{
    public String SID;
    public int Point = 0;

    public Mahasiswa(String name, int dd, int mm, int yyyy, String SID) {
        super(name, dd, mm, yyyy);
        this.SID = SID;
    }

    public void helpingDosen(){
        Point+=10;
    }
    
    public void Display(){
        System.out.println("SID : " + SID);
        System.out.println("Point Before : " + Point);
        helpingDosen();
        System.out.println("Point After : " + Point);
        super.display();
    }
}

class Dosen extends Person{
    public String DID;
    public int Point = 0;

    public Dosen(String name, int dd, int mm, int yyyy, String DID) {
        super(name, dd, mm, yyyy);
        this.DID = DID;
    }


    public void selfDev(){
        System.out.println("SELF DEV");
        Point += 10;
    }

    public void teach(){
        System.out.println("Teaching");
        Point += 10;
    }

    public void p2m(){
        System.out.println("P2M");
        Point += 10;
    }

    public void research(){
        System.out.println("RESEARCH");
        Point += 10;
    }

    public void otherWorks(){
        System.out.println("DOING OTHER WORKS");
        Point += 10;
    }

    public void Display(){
        System.out.println("DID : " + DID);
        System.out.println("Point Before : " + Point);
        selfDev();
        teach();
        p2m();
        research();
        otherWorks();
        System.out.println("Point After : " + Point);
        super.display();
    }
}

public class Quiz2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] Args){
    	int i = 0;
    	while(i == 0){
    	System.out.println("=================");
        System.out.println("1. New Person");
        System.out.println("2. New Mahasiswa");
        System.out.println("3. New Dosen");
        System.out.println("=================");
        i = sc.nextInt(); sc.nextLine();
    	if(i == 1) {
    		System.out.println("Person : ");
    		Person p = new Person("Dar", 5, 10, 2000);
    		p.display();
    		p.sleep();
    		System.out.println("");
    		i = 0;
    	}
        else if(i == 2){
        	System.out.println("Mahasiswa : ");
            Mahasiswa m = new Mahasiswa("Dar E", 5, 10, 2003, "2540127856");
            m.Display();
            System.out.println("");
            i = 0;
        }else{
        	System.out.println("DOSEN : ");
            Dosen d = new Dosen("Mr. Dar", 5, 6, 1990, "6587210542");
            d.Display();
            System.out.println("");
            i = 0;
        }
    }
   }
}
