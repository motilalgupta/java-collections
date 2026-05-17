package PracticeQuestions.IteratorQuestions.CollectionEntity;

import PracticeQuestions.IteratorQuestions.Employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Employee5 {
    public	static	void	main(String[]	args)	throws	Exception	{
        List<Employee> list = new ArrayList<Employee>();
        BufferedReader br =	null;
        try{
            br	=	new BufferedReader(new InputStreamReader(System.in));
            while(true)
            {
                System.out.println("Enter	Emp	details	to	add	:	");
                int id = Integer.parseInt(br.readLine());
                String name = br.readLine();
                double	salary	=	Double.parseDouble(br.readLine());
                Employee	e	=	new Employee(id,	name,	salary);
                list.add(e);
                System.out.print("Do	you	add	another	record(yes/no)	:	");
                String choice =	br.readLine();
                if(choice.equals("no"))
                {break;
                }
            }
            System.out.println("Details	are	:	");
            for(Employee e :	list)	{
                System.out.println(e.id + "	, "	+ e.name +	" ,	" +	e.salary);
            }
        }
        finally{
            if(br!=null)
                br.close();
        }
    }
}
