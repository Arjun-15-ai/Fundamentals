public class Company
{
	public static void main(String[] args) {
		if(args.length !=2){
		    System.out.println("provide valied input ");
		    return;
		}
		
		String company=args[0];
		String city = args[1];
		System.out.println(company + "Technologies"+ city);
		
	}
}\