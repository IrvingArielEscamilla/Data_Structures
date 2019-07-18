package mx.algoritmia.CapituloTres;

public class ErrorFisicoException  extends Exception{

	public ErrorFisicoException (Exception ex)
	{
		super("Ocurrio un error fisico", ex);
	}
}
