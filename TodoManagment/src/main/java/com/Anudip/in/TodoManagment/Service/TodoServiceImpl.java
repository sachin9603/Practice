package com.Anudip.in.TodoManagment.Service;

import java.util.Arrays;
import java.util.List;

public class TodoServiceImpl  implements TodosService{

	@Override
	public List<String> retriveToDosList(String user) {
		// TODO Auto-generated method stub
		// i am using a dummy  user \
		List<String > allTodos  ;
		if(user == "sachin") {
			allTodos= Arrays.asList("Multithreading" ,"operator" , "collections -List" ," collections -set" ,"collections -comaparable") ;
		}else {
		  allTodos = Arrays.asList("to call neha " ,"wash utensils " , " List of rashan  " ," pay bill" , "clling shivan " ) ;
		}
		
		
		return allTodos;
	}

}
