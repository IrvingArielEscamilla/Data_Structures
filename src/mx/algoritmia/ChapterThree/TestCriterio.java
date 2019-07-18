package mx.algoritmia.CapituloTres;

public class TestCriterio {

	public static void main(String[] args) {
		
		Alumno arr[] =  { new Alumno ("Merit",25,9.5),
				          new Alumno ("Irving",24,8),
				          new Alumno ("Sandra",27,9)};
		
		//orden del array por nombre
		System.out.println("-----------------Nombre----------------------");
		UtilCriterio.ordenar(arr, new CriterioAlumNombre());
		UtilCriterio.imprimirArray(arr);
		
		//ordena del arrar por promedio
		System.out.println("-----------------Promedio--------------------");
		UtilCriterio.ordenar(arr, new CriterioAlumNotaProm());
		UtilCriterio.imprimirArray(arr);
	}
}
