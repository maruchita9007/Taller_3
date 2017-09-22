import java.util.ArrayList;
import java.util.List;

public class MathHelper{

	private int numero;
	private int aux;
	private List<Integer> list;
	public MathHelper() {
		
		list = new ArrayList<Integer>();
		// TODO Auto-generated constructor stub
	}

	public void add(int numero){
		list.add(numero);
	}
	
	public void burbuja(){
		boolean movimiento = true;
		int contRondas = 0;
		while(movimiento){
			movimiento = false;
			for(int i=1;i<list.size()-contRondas;i++){
				if(list.get(i)<list.get(i-1)){
					movimiento = true;
					aux = list.get(i);
					list.set(i, list.get(i-1));
					list.set(i-1, aux);
						   					}
													}
										}
		imprimeLista(1);	
		}
	
	public void remove(int n){
		if((list.size() > n) && (n>=0)){
			list.remove(n);
			burbuja();
		}
		else{
			System.out.println("Posición fuera del rango de la lista");
		}
	}
	
public void imprimeLista(int num) {
		
		if(num == 0)
			System.out.print("Lista sin ordenar: ");	
		else if(num == 1)
			System.out.print("Lista ordenada: ");
			
		
		for(Integer i:list){
			
			System.out.print(i+" ");
		
		}
		//Imprime un separador de línea
		System.out.println();
		
	}
	
		}
	
	

