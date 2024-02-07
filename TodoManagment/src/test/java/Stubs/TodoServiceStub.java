package Stubs;

import java.util.Arrays;
import java.util.List;

import com.Anudip.in.TodoManagment.Service.TodosService;

public class TodoServiceStub implements TodosService  {

	@Override
	public List<String> retriveToDosList(String user) {
		// TODO Auto-generated method stub
		
		
		return Arrays.asList("list - collection" , "Set - collection......"  ," collectson.....pura hi .", "Live Match  dekhna hai ")  ;
	}

}
