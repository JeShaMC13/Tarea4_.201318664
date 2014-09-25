package gt.edu.usac.ipc1a;

import java.awt.Color;
import java.awt.Graphics;
public class Circle {

	public int positionX, positionY;
	public float velocityX, velocityY;
	public int size;
	public float Chocar;

	
	public void Update()
	{
		Rebote();
		ActualizarPosicion();
		DetectarParedDerecha();// se agrego DetectarPared(); de la clase WallJumper 
		DetectarParedIzquierda();
	}
	public void ActualizarPosicion()
	{
		positionX = (int) velocityX;
		positionY = (int)velocityY;
	}


	public void Draw (Graphics g){		 

		g.setColor(Color.RED);
		g.fillOval(positionX,positionY,size,size);   

	}
	public void  Rebote(){
		velocityX += Chocar;
		
	}
	
	class Rebote extends Circle{
	
	public Rebote(){
		//if(positionX+size == 800);
		//System.out.println("Detectar pared lol ");
		//velocityX -= gravity;// se agrego esto

	}
	//public void AplicarGravedad()
	//{
		//velocityX += gravity;
	//}

}

	public void DetectarParedDerecha() {
		positionX = (int) velocityX;		
	}
	public void DetectarParedIzquierda(){
		positionX = (int) velocityX;
	}
}

