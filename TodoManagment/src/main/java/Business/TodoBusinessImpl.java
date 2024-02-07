package Business;

import java.util.ArrayList;
import java.util.List;

import com.Anudip.in.TodoManagment.Service.TodosService;

public class TodoBusinessImpl {
	
// i am dependent on this TodosService  so using as dependency for TodoBusinessImpl
	private TodosService todosService  ;
	
	// stub --- we are creating a fake class which will give same data as real class 
	// i am doing this because i want test my business logic on different aspect 
	

	public TodoBusinessImpl(TodosService todosService) {
	
		this.todosService = todosService;
	}
	
	public List<String> retriveTodosRelatedToCollection(String user){
		
	List<String> alltodosRelatedtouser= todosService.retriveToDosList(user) ;
	
	List<String> todosRelatedToCollection  = new ArrayList<String>() ;
	// filter data related to collection 
	
	for(String  todo:alltodosRelatedtouser) {
		if(todo.contains("collection")) {
			todosRelatedToCollection.add(todo);
			
		}
	}
	return todosRelatedToCollection;
	}
	
	
	
 
}
