@Controller
public class IceInventory 
{	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	   public String index() 
           {
	      return "index";
	   }
}
