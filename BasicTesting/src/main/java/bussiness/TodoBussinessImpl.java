package bussiness;

import java.util.ArrayList;
import java.util.List;

import service.TodoService;
// todoService Dependency  
// todoService SUT(service under test ) ; now i have to test this class without Service class is this posiible 
//yes we can do this with the help of stub  ,, why mokito 


public class TodoBussinessImpl {

	private TodoService todoService ;

	public TodoBussinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	
	public List<String >  retriveTodosRelatedToSpring(String User){
		
		List <String > filteredTodos = new ArrayList<String> () ;
		
		List<String> todos  = todoService.retieveTodos(User) ;
		
		for (String todo  : todos ) {
		
			if (todo.contains("spring")) {
				filteredTodos.add(todo) ;
			}
		}
		return filteredTodos ;
	}
	
	
	
	
}
