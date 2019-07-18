package mx.algoritmia.CapituloTres;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	//constructor sobreecargado
	//constructor con argumentos
	public Fecha(int d, int m, int a) {
		dia =d;
		mes=m;
		anio=a;
		
	}
	//constructor sin argumentos
	public Fecha() {
		
	}
	
	public Fecha(String s) {
		//primera ocurrencia
		int pos1 = s.indexOf('/');
		
		//segunda ocurrencia
		int pos2 = s.lastIndexOf('/');
		
		//Procesamos el dia
		String sDia = s.substring(0,pos1);
		dia = Integer.parseInt(sDia);
		
		//Procesamos el mes
		String sMes =  s.substring(pos1+1,pos2);
		mes = Integer.parseInt(sMes);
		
		//Procesamos el anio
		String sAnio =  s.substring(pos2+1);
		anio = Integer.parseInt(sAnio);
		
	}
		
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	//sobreescribir metodo toString
	
	public String toString() {
		return dia + "/" + mes + "/" + anio;
	}
	
	//metodo equals
	
	public boolean equals(Object o) {
		Fecha otra = (Fecha)o;
		return( dia==otra.dia)&&(mes==otra.mes)&&(anio==otra.anio);
		
	}
	
	private int fechaToDias() {
		return anio *360 + mes*30 + dia;
	}
	
	//arrglar algoritmo para sumar dias !!!
	private void diasToFecha(int i) {
		anio = (int) i/360;
		int resto = i%360;
		mes = (int)i/30;
		dia = resto%30;
		
		//ajuste por dia quedado en cero
		if(dia==0) {
			dia = 30;
			mes --;
		}
		//ajuste po mes quedado en cero
		
		if(mes==0) {
			mes =12;
			anio--;
		}
	}
	
	public void addDias(int d) {
		int sum = fechaToDias() + d;
		diasToFecha(sum);
		
	}
	
	}