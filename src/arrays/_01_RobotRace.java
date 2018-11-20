package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {	
	boolean top = false;


	public static void main(String[] args) {

		_01_RobotRace robotRace = new _01_RobotRace();
	//	robotRace.fiveRobots(); 
		robotRace.twentyRobots();
	}

	
	void fiveRobots() {
		//2. create an array of 5 robots.
				Robot[] fiveRobots = new Robot[5];


				
				
			//3. use a for loop to initialize the robots.
				
				for (int i = 0; i < fiveRobots.length; i++) {
					fiveRobots[i] = new Robot();
				}

				//4. make each robot start at the bottom of the screen, side by side, facing up
				for (int i = 0; i < fiveRobots.length; i++) {
					fiveRobots[i].setSpeed(20);
					fiveRobots[i].moveTo(i * 95, 540);
				}
				
				/*
				while(!top) {
					for (int i = 0; i < fiveRobots.length; i++) {
						if(fiveRobots[i].getY() < 0) {
							top = true;
						}
					}
					}
					*/
		while(fiveRobots[0].getY() > 0) {	
			for (int i = 0; i < fiveRobots.length; i++) {	
			Random random = new Random();
			int randomResult = random.nextInt(50);
			//System.out.println(i + " moving: " + randomResult + " y: "+ fiveRobots[i].getY());
			fiveRobots[i].move(randomResult);
			
			
		}
			
			}
				while(!top) {
					for (int i = 0; i < fiveRobots.length; i++) {
						if(fiveRobots[i].getY() < 0) {
							top = true;
							System.out.println("Robot "+i + " won!");
							break;
							
						}
					}
				}
		

			}
			
			/*
			if(0 > fiveRobots[0].getY()) {
				System.out.println("Robot 0 won!");
				break;
			}
			else if(0 > fiveRobots[1].getY()) {
				System.out.println("Robot 1 won!");
				break;
			}
			else if(0 > fiveRobots[2].getY()) {
				System.out.println("Robot 2 won!");
				break;
		 	}
			else if(0 > fiveRobots[3].getY()) {
				System.out.println("Robot 3 won!");
				break;
			}
			else if(0 > fiveRobots[4].getY()) {
				System.out.println("Robot 4 won!");
				break;
			}
			*/
	
	
	
	void twentyRobots() {
		//2. create an array of 5 robots.
		Robot[] twentyRobots = new Robot[20];


		
		
	//3. use a for loop to initialize the robots.
		
		for (int i = 0; i < twentyRobots.length; i++) {
			twentyRobots[i] = new Robot();
		}

		//4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < twentyRobots.length; i++) {
			twentyRobots[i].setSpeed(20);
			twentyRobots[i].moveTo(i * 50, 540);
		}
		
		/*
		while(!top) {
			for (int i = 0; i < fiveRobots.length; i++) {
				if(fiveRobots[i].getY() < 0) {
					top = true;
				}
			}
			}
			*/
while(twentyRobots[0].getY() > 0) {	
	for (int i = 0; i < twentyRobots.length; i++) {	
	Random random = new Random();
	int randomResult = random.nextInt(50);
	//System.out.println(i + " moving: " + randomResult + " y: "+ fiveRobots[i].getY());
	twentyRobots[i].move(randomResult);
	
	
}
	
	}
		while(!top) {
			for (int i = 0; i < twentyRobots.length; i++) {
				if(twentyRobots[i].getY() < 0) {
					top = true;
					System.out.println("Robot "+i + " won!");
					break;
					
				}
			}
		}
	}
}
