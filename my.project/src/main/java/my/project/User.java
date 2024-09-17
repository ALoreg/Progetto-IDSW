package my.project;

public class User {

	protected String CF;
	protected String Codice;
	
	public User() {
		
	}
	
	public User login(String cf, String co) {
		//se sei elettore ==> return this.BeElettore(cf, co);
		//se sei scrutinatore ==> return this.BeScrutinatore(cf, co);
		return this; //serve solo a non dare errori, VA CANCELLATO ED IMPLEMENTATO IL METODO!!!
	}
	
	public Elettore BeElettore() {
		Elettore e = new Elettore(CF, Codice);
		return e;
	}
	
	public Scrutinatore BeScrutinatore() {
		Scrutinatore s = new Scrutinatore(CF, Codice);
		return s;
	}
}


