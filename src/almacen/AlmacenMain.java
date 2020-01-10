package almacen;


import java.util.ArrayList;
import java.util.List;


public class AlmacenMain {

	public static void main(String[] args) {
		Bebidas otraBebida = new Bebidas(new Identificador(), 2.5, 9.5, "anis del mono");
		BebidaAzucarada colaBebidas = new BebidaAzucarada(new Identificador(), 1.5, 1.8, "Coca-Cola", 1.2, true);
		Bebidas aguaMineral1 = new AguaMineral(new Identificador(), 1.5, 1.25, "Aquarel", "Nestle");
		
		System.out.println(otraBebida);
		System.out.println(colaBebidas);
		System.out.println(aguaMineral1);
		List<Bebidas> estanteriaBebidas = new ArrayList<Bebidas>();
			estanteriaBebidas.add(otraBebida);
			estanteriaBebidas.add(colaBebidas);
			estanteriaBebidas.add(aguaMineral1);
			
		System.out.println(estanteriaBebidas);
		
		
	}
	

}
