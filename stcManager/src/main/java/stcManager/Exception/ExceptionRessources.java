package stcManager.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus .NOT_FOUND)
public class ExceptionRessources extends Exception{

	
	   private static final long serialVersionUID = 1L;

	    public ExceptionRessources(String message){
	        super(message);
	    }
}
