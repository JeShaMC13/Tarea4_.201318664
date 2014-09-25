package gt.edu.usac.ipc1a;

import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Graphics;

public class WallJumper extends Circle{	
	Color color;

	public WallJumper(){
		size = 150;
		Chocar = 2f;// 0.5-->2
		color = Color.ORANGE;
		
	}

	@Override
	
	public void DetectarParedDerecha()
	{
		if(positionX+size >= 800)
			{
				Saltar();
				CambiarColor();
				System.out.println("Se detecto Pared  De la derecha");
			
			}
	}
	
	public void DetectarParedIzquierda()
	{
		if(positionX+size <= 0)
			{
				Saltar();
				CambiarColor();
				System.out.println("Se detecto Pared  De la Izquierda");
			Saltar1();
			}
	}
		
	
	
	
	public void Saltar(){
		Chocar = -0.5f;// se agrego Chocar = -0.5f; 
		velocityX = 1f;
			
	}
	public void Saltar1(){
		Chocar = 0.5f;// se agrego Chocar = 0.5f; 
		velocityX -= Chocar;//Se agrego para que regrese cuando haya chocado con la pared
		velocityX = 1f;
			
	}
	
	public void CambiarColor()
	{
		color = Color.RED;
	}
	
	@Override
 	public void Draw (Graphics g){		 
		 g.setColor(color);
		 g.fillOval(positionX,positionY,size,size);
	}



}

