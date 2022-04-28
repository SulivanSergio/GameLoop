package W5;

import java.util.Random;

public class GameLoop {
	
	static final int C = 2;
	static final int T = 2;
	
	float position = 0;
	float speed = 10.0f;
	final int SYNC = 30;
	
	int sync1 = 0;
	
	static int carros[] = new int[C];
	
	static ThreadCarros thread[] = new ThreadCarros[T];
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		for(int i =0; i< C; i++)
		{
			
			carros[i] = i;
			
		}
		
		for(int i = 0; i< T;i++)
		{
			thread[i] = new ThreadCarros(carros,random.nextFloat(5),10f,i );
			thread[i].start();
			
		}
		
		GameLoop gl = new GameLoop();
		gl.Start();
		
	}
	
	
	public void Input()
	{
		
	}
	
	public void Update(float deltaTime)
	{
		
		
		
	}
	public void FixedUpdate(float fixedDeltaTime)
	{
		
		
	}
	
	public void Render()
	{
		
		
		
	}
	
	
	public void Start()
	{
		float deltaTime = 0;
		
		
		while(true)
		{
			long start = System.currentTimeMillis();
			
			
			
			Input();
			Update(deltaTime);
			
			
			
			Render();
			
			long end = System.currentTimeMillis();
			deltaTime = (float) (end - start)/ 1000.0f;
		
			
			
			
		}
		
		
	}
	
	

}
