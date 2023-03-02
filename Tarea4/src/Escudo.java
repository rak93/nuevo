/**
 * Esta clase te crea un escudo
 * @author raque
 *
 */
public class Escudo {
	
private int altura;
 Tipo tipo;
 /**
  * El constructor solo te pide la altura y el tipo 
  *@author raquel
  * @param altura
  * @param tipo
  */
 
public Escudo(int altura, Tipo tipo) {
	this.altura = altura;
	this.tipo = tipo;
}
/**
 * Los getter para que devuelva la altura y el tipo de escudo
 * Los setter por si cambia la altura o el tipo de escudo que quiere usar
 * @return
 */
public int getAltura() {
	return altura;
}
public void setAltura(int altura) {
	this.altura = altura;
}
public Tipo getTipo() {
	return tipo;
}
public void setTipo(Tipo tipo) {
	this.tipo = tipo;
}
/**
 * metodo que segun tu altura te devuelve la anchura del escudo
 * 
 * @return
 */
public  int anchuraEscudo() {
		int anchuraEscudo = 0;
	if(tipo.equals(tipo.RECTANGULAR)){
		
			if(altura<160) {
				anchuraEscudo=40;
			}
			if(altura<170) {
				anchuraEscudo=43;
			}
			if(altura<180) {
				anchuraEscudo=45;
			}
			if(altura>190) {
				anchuraEscudo=47;
			}
			
		}
	else {

		if(altura<160) {
			anchuraEscudo=35;
		}
		if(altura<170) {
			anchuraEscudo=38;
		}
		if(altura<180) {
			anchuraEscudo=40;
		}
		if(altura>190) {
			anchuraEscudo=45;
		}
		
	}
	return anchuraEscudo;

}
/**
 *metodo que con la altura de la persona te devuelve la altura del escudo
 * @return
 */
public  int alturaEscudo() {
	int alturaEscudo = 0;
if(tipo.equals(tipo.RECTANGULAR)){
	
		if(altura<160) {
			alturaEscudo=70;
		}
		if(altura<170) {
			alturaEscudo=75;
		}
		if(altura<180) {
			alturaEscudo=80;
		}
		if(altura>190) {
			alturaEscudo=85;
		}
		
	}
else {

	if(altura<160) {
		alturaEscudo=70;
	}
	if(altura<170) {
		alturaEscudo=73;
	}
	if(altura<180) {
		alturaEscudo=78;
	}
	if(altura>190) {
		alturaEscudo=80;
	}
	
}
return alturaEscudo;

}
}
