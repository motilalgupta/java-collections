package PracticeQuestions.IteratorQuestions.CollectionEntity;

import PracticeQuestions.IteratorQuestions.Employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
class Student{
    int id;
    String name;
    double salary;

    Student(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
class Employee5 {
    public	static	void	main(String[]	args)	throws	Exception	{
        List<Student> list = new ArrayList<Employee>();
        BufferedReader br =	null;
        try{
            br	=	new BufferedReader(new InputStreamReader(System.in));
            while(true)
            {
                System.out.println("Enter	Emp	details	to	add	:	");
                int id = Integer.parseInt(br.readLine());
                String name = br.readLine();
                double	salary	=	Double.parseDouble(br.readLine());
                Student e	=	new Student(id,	name,	salary);
                list.add(e);
                System.out.print("Do	you	add	another	record(yes/no)	:	");
                String choice =	br.readLine();
                if(choice.equals("no"))
                {break;
                }
            }
            System.out.println("Details	are	:	");
            for(Student e :	list)	{
                System.out.println(e.id + "	, "	+ e.name +	" ,	" +	e.salary);
            }
        }
        finally{
            if(br!=null)
                br.close();
        }
    }
}
