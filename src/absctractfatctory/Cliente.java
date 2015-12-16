package absctractfatctory;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;


public class Cliente {
	
	
	public static void main(String[] args) throws ParseException {
		
		Scanner d = new Scanner(System.in);
		System.out.println("Digite uma Data no formato MM/dd/yy");
		String datastring = d.next();
		DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		Date date = (Date)formatter.parse(datastring);

		Date data = new Date();
		Calendar c = new GregorianCalendar();
		c.setTime(date);
		String nome = "";
		int dia = c.get(c.DAY_OF_WEEK);
		
		PizzaFactory pedidocalabresa = new PizzaioloFactoryCalabresa();
		Pizza calabresa = pedidocalabresa.criaPizza();
		
		 PizzaFactory pedidopresunto = new PizzaioloFactoryPresunto();
		 Pizza presunto = pedidopresunto.criaPizza();
		
		
		switch(dia){
		  case Calendar.SUNDAY: nome = "FECHADO - Domingo";break;
		  
		  case Calendar.MONDAY: nome = " - Segunda"; calabresa.ExibeIngredientes();break;
		  case Calendar.TUESDAY: nome = "- Terça";presunto.ExibeIngredientes();break;
		  case Calendar.WEDNESDAY: nome = "- Quarta";calabresa.ExibeIngredientes(); break;
		  case Calendar.THURSDAY: nome = "- Quinta";presunto.ExibeIngredientes();break;
		  case Calendar.FRIDAY: nome = "- Sexta";calabresa.ExibeIngredientes();break;
		  case Calendar.SATURDAY: nome = "- Sábado";presunto.ExibeIngredientes();break;
		}
		System.out.println(nome);
		
		
		
		
	}
	
	
		
	}
	
	
	
	


