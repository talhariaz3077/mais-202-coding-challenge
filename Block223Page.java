package ca.mcgill.ecse223.block.view;

import java.awt.*;
import java.util.HashMap;
import acm.gui.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Block223Page extends JFrame {
	
	
	//private instance variables
	   private int FRAME_WIDTH = 1500 , FRAME_HEIGHT = 500;
	   private JTextField field1;							//input field object
	   private JTextField field2;							//output field object
	   private JTextField precisionBox;						//precision indicator field object
	   private int precision=0;								//variable to store current precision value of slider. Set to 6 by default
	   private String finalResult;							//stores the final result of the input expression
	
	 //create a game
	   private JTextField gameNameField;
	   private JButton createGameButton;
	   private JLabel createGameLabel;

	   //define game settings
	   
	   private JLabel nrLevelsLabel;
	   private JTextField nrLevelsField;
	   private JLabel nrBlocksperlevelLabel;
	   private JTextField nrBlocksperlevelField;
	   private JLabel minBallSpeedXLabel;
	   private JTextField minBallSpeedXField;
	   private JLabel minBallSpeedYLabel;
	   private JTextField minBallSpeedYField;
	   private JLabel ballSpeedIncreaseFactorLabel;
	   private JTextField ballSpeedIncreaseFactorField;
	   private JLabel maxPaddleLengthLabel;
	   private JTextField maxPaddleLengthField;
	   private JLabel minPaddleLengthLabel;
	   private JTextField minPaddleLengthField;
	   private JButton defineSettingsButton;

	   //delete game
	   private JComboBox currentDesignableGames;
	   private JButton deleteGameButton;

	   //update game
	   private JLabel availableGamesLabel;
	   private JComboBox currentDesignableGames2;
	   private JLabel selectedGamelabel;
	   private JTextField selectionDisplayField;
	   private JLabel updatedGameNameLabel;
	   private JTextField updatedGameNameField;
	   private JLabel updatedNrLevelsLabel;
	   private JTextField updatedNrLevelsField;
	   private JLabel updatedNrBlocksperlevelLabel;
	   private JTextField updatedNrBlocksperlevelField;
	   private JLabel updatedMinBallSpeedXLabel;
	   private JTextField updatedMinBallSpeedXField;
	   private JLabel updatedMinBallSpeedYLabel;
	   private JTextField updatedMinBallSpeedYField;
	   private JLabel updatedBallSpeedIncreaseFactorLabel;
	   private JTextField updatedBallSpeedIncreaseFactorField;
	   private JLabel updatedMaxPaddleLengthLabel;
	   private JTextField updatedMaxPaddleLengthField;
	   private JLabel updatedMinPaddleLengthLabel;
	   private JTextField updatedMinPaddleLengthField;
	   private JButton updateSettingsButton;

	   // add block
	   private JLabel redLabel;
	   private JSlider colorSliderRed;
	   private JTextField redTextField; 
	   private JLabel pointsLabel;
	   private JSlider pointsSlider;
	   private JTextField pointsTextField;
	   private JLabel greenLabel;
	   private JSlider colorSliderGreen;
	   private JTextField greenTextField;
	   private JLabel blueLabel;
	   private JSlider colorSliderBlue;
	   private JTextField blueTextField;
	   private JButton addBlockButton;
	   //delete block
	   private JLabel availableGamesLabel1;
	   private JComboBox currentDesignableGames3;
	   private JLabel selectedGamelabel1;
	   private JTextField selectionDisplayField1;
	   private JLabel blocksInGameLabel;
	   private JComboBox blocksInGame;
	   private JButton deleteBlockButton;
	  
	   //update block
	   private JLabel availableGamesLabel2;
	   private JComboBox currentDesignableGames4;
	   private JLabel selectedGamelabel2;
	   private JTextField selectionDisplayField2;
	   private JLabel blocksInGameLabel1;
	   private JComboBox blocksInGame1;
	   private JButton updateBlockButton;
	   private JLabel redLabel1;
	   private JSlider colorSliderRed1;
	   private JTextField redTextField1; 
	   private JLabel pointsLabel1;
	   private JSlider pointsSlider1;
	   private JTextField pointsTextField1;
	   private JLabel greenLabel1;
	   private JSlider colorSliderGreen1;
	   private JTextField greenTextField1;
	   private JLabel blueLabel1;
	   private JSlider colorSliderBlue1;
	   private JTextField blueTextField1;

	   //error
	   private JLabel errorMessage;
	
	
	
	
	
	
	public Block223Page () {
		initComponents();
		}
	

	public void initComponents() {
		
		
		
		//frame dimensions
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
		
		TableLayout layout = new TableLayout(25, 14);
		
		setLayout(layout);
		
		ScrollPane scrollPane = new ScrollPane();
		

		
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Block223");
		
		//createGame
		createGameLabel = new JLabel("Game Name:   ");
		add(createGameLabel, "gridwidth=1");
		
		
		field1 = new JTextField(10);
		add(field1, "gridwidth=2");
		
		createGameButton = new JButton("Create");
		add(createGameButton, "gridwidth=2");
	
		JLabel ff = new JLabel("    ");
		add(ff,"gridwidth=1");
		
		
		//deleteGame
		JLabel f = new JLabel("    ");
		add(f,"gridwidth=1");
		
		
		JLabel g = new JLabel("    ");
		add(g,"gridwidth=2");
		
		JLabel e = new JLabel("Delete game: ");
		add(e,"gridwidth=1");
			
		currentDesignableGames = new JComboBox<String>(new String[0]);
		add(currentDesignableGames, "gridwidth=2");
		
		deleteGameButton = new JButton("Delete");
		add(deleteGameButton, "gridwidth=2");
		
		JSeparator horizontalLineTop = new JSeparator();
		add(horizontalLineTop, "gridwidth=14");
		
		//defineGameSettings
		nrLevelsLabel = new JLabel("No. of levels:");
		add(nrLevelsLabel);
		
		nrLevelsField = new JTextField();
		add(nrLevelsField, "gridwidth=1");
		
	//	JLabel fff = new JLabel("    ");
	//	add(fff,"gridwidth=1");
		
		nrBlocksperlevelLabel = new JLabel(" No. of blocks per level:");
		add(nrBlocksperlevelLabel, "gridwidth=2");
		
		nrBlocksperlevelField = new JTextField();
		add(nrBlocksperlevelField);
		
		minBallSpeedXLabel = new JLabel("minBallSpeedX:");
		add(minBallSpeedXLabel);
		
		minBallSpeedXField = new JTextField();
		add(minBallSpeedXField);
		
		minBallSpeedYLabel = new JLabel("minBallSpeedY:");
		add(minBallSpeedYLabel);
		
		minBallSpeedYField = new JTextField();
		add(minBallSpeedYField);
		
		ballSpeedIncreaseFactorLabel = new JLabel(" Speed Increase Factor:");
		add(ballSpeedIncreaseFactorLabel, "gridwidth=2");
		
		ballSpeedIncreaseFactorField = new JTextField();
		add(ballSpeedIncreaseFactorField);
		
		JLabel s2 = new JLabel("    ");
		add(s2,"gridwidth=2");
		
		maxPaddleLengthLabel = new JLabel("Max paddle length:");
		add(maxPaddleLengthLabel);
		
		maxPaddleLengthField = new JTextField();
		add(maxPaddleLengthField);
		
		minPaddleLengthLabel = new JLabel("Min paddle length:");
		add(minPaddleLengthLabel);
		
		minPaddleLengthField = new JTextField();
		add(minPaddleLengthField);
		
		JLabel gg = new JLabel("    ");
		add(gg,"gridwidth=4");
		
		JLabel hh = new JLabel("    ");
		add(hh,"gridwidth=4");
		
		defineSettingsButton = new JButton("Define Settings");
		add(defineSettingsButton, "gridwidth=3");
		
		JSeparator horizontalLineTop1 = new JSeparator();
		add(horizontalLineTop1, "gridwidth=14");
		
		
		//updateGame
		availableGamesLabel = new JLabel("Available Games: ");
		add(availableGamesLabel);
		
		currentDesignableGames2 = new JComboBox<String>(new String[0]);
		add(currentDesignableGames2, "gridwidth=3");
		
		selectedGamelabel = new JLabel("Selected Game: ");
		add(selectedGamelabel);
		
		selectionDisplayField = new JTextField();
		selectionDisplayField.setEditable(false);
		add(selectionDisplayField,"gridwidth = 2");
		
		JLabel x = new JLabel("    ");
		add(x,"gridwidth=7");
		
		updatedGameNameLabel = new JLabel("New Game Name:");
		add(updatedGameNameLabel);
		
		updatedGameNameField  = new JTextField();
		add(updatedGameNameField, "gridwidth=3");
		
		
		updatedNrLevelsLabel = new JLabel("No. of levels:");
		add(updatedNrLevelsLabel);
		
		updatedNrLevelsField = new JTextField();
		add(updatedNrLevelsField);
		
		updatedNrBlocksperlevelLabel = new JLabel(" No. of blocks per level:");
		add(updatedNrBlocksperlevelLabel,"gridwidth=2");
		
		updatedNrBlocksperlevelField = new JTextField();
		add(updatedNrBlocksperlevelField);
		
		updatedMinBallSpeedXLabel = new JLabel("minBallSpeedX:");
		add(updatedMinBallSpeedXLabel);
		
		updatedMinBallSpeedXField = new JTextField();
		add(updatedMinBallSpeedXField);
		
		JLabel s3 = new JLabel("    ");
		add(s3,"gridwidth=4");
		
		updatedMinBallSpeedYLabel = new JLabel("minBallSpeedY:");
		add(updatedMinBallSpeedYLabel);
		
		updatedMinBallSpeedYField = new JTextField();
		add(updatedMinBallSpeedYField);
		

		//JLabel hhh = new JLabel("    ");
		//add(hhh,"gridwidth=4");
		
		updatedBallSpeedIncreaseFactorLabel = new JLabel("Speed Increase Factor: ");
		add(updatedBallSpeedIncreaseFactorLabel,"gridwidth=1");
		
		updatedBallSpeedIncreaseFactorField = new JTextField();
		add(updatedBallSpeedIncreaseFactorField);
		
		
		updatedMaxPaddleLengthLabel = new JLabel("Max paddle length:");
		add(updatedMaxPaddleLengthLabel);
		
		updatedMaxPaddleLengthField = new JTextField();
		add(updatedMaxPaddleLengthField);
		
		updatedMinPaddleLengthLabel = new JLabel(" Min paddle length:");
		add(updatedMinPaddleLengthLabel, "gridwidth=2");
		
		updatedMinPaddleLengthField = new JTextField();
		add(updatedMinPaddleLengthField);
		
		//JLabel ggg = new JLabel("    ");
		//add(ggg,"gridwidth=5");
		
		JLabel hhhh = new JLabel("    ");
		add(hhhh,"gridwidth=3");
		
		updateSettingsButton = new JButton("Update Settings");
		add(updateSettingsButton, "gridwidth=2");
		
		JSeparator horizontalLineTop2 = new JSeparator();
		add(horizontalLineTop2, "gridwidth=14");
		
		//addBlock
		
		
		//red
		redLabel = new JLabel("Red:");
		add(redLabel);
		
		colorSliderRed = new JSlider(0, 255, 0);	  
		add(colorSliderRed);
		
		redTextField = new JTextField();
		redTextField.setEditable(false);
		add(redTextField);
		redTextField.setText(Integer.toString(precision));
		
		JLabel a = new JLabel("    ");
		add(a,"gridwidth=1");
		
		//green
		greenLabel = new JLabel("Green:");
		add(greenLabel);
		
		colorSliderGreen = new JSlider(0, 255, 0);	  
		add(colorSliderGreen);
		
		greenTextField = new JTextField();
		greenTextField.setEditable(false);
		add(greenTextField);
		greenTextField.setText(Integer.toString(precision));
		
		JLabel b = new JLabel("    ");
		add(b,"gridwidth=9");
		
		//blue
		blueLabel = new JLabel("Blue:");
		add(blueLabel);
		
		colorSliderBlue = new JSlider(0, 255, 0);	  
		add(colorSliderBlue);
		
		blueTextField = new JTextField();
		blueTextField.setEditable(false);
		add(blueTextField);
		blueTextField.setText(Integer.toString(precision));
		
		JLabel aa = new JLabel("    ");
		add(aa,"gridwidth=1");
		
		//points
		pointsLabel = new JLabel("Points: ");
		add(pointsLabel);
		pointsSlider = new JSlider(0, 1000, 0);	  
		add(pointsSlider);
		
		pointsTextField = new JTextField();
		pointsTextField.setEditable(false);
		add(pointsTextField);
		pointsTextField.setText(Integer.toString(precision));
		
		JLabel c = new JLabel("    ");
		add(c,"gridwidth=5");
		
		addBlockButton = new JButton ("Add Block");
		add(addBlockButton, "gridwidth=2");
		
		

		JSeparator horizontalLineTop3 = new JSeparator();
		add(horizontalLineTop3, "gridwidth=14");
		
		availableGamesLabel1 = new JLabel("Available Games: ");
		add(availableGamesLabel1);
		
		currentDesignableGames3 = new JComboBox<String>(new String[0]);
		add(currentDesignableGames3, "gridwidth=3");
		
		selectedGamelabel1 = new JLabel("Selected Game: ");
		add(selectedGamelabel1);
		
		selectionDisplayField1 = new JTextField();
		selectionDisplayField1.setEditable(false);
		add(selectionDisplayField1,"gridwidth = 2");
		
		blocksInGameLabel = new JLabel(" Blocks in Game: ");
		add(blocksInGameLabel);
		
		blocksInGame = new JComboBox<String>(new String[0]);
		add(blocksInGame, "gridwidth=3");
		
		JLabel s1 = new JLabel("    ");
		add(s1,"gridwidth=1");
		
		deleteBlockButton = new JButton("Delete Block");
		add(deleteBlockButton, "gridwidth=2");
		
		JSeparator horizontalLineTop4 = new JSeparator();
		add(horizontalLineTop4, "gridwidth=14");
		 
		availableGamesLabel2 = new JLabel("Available Games: ");
		add(availableGamesLabel2);
		
		currentDesignableGames4 = new JComboBox<String>(new String[0]);
		add(currentDesignableGames4, "gridwidth=3");
		
		selectedGamelabel2 = new JLabel("Selected Game: ");
		add(selectedGamelabel2);
		
		selectionDisplayField2 = new JTextField();
		selectionDisplayField2.setEditable(false);
		add(selectionDisplayField2,"gridwidth = 2");
		
		blocksInGameLabel1 = new JLabel(" Blocks in Game: ");
		add(blocksInGameLabel1);
		
		blocksInGame1 = new JComboBox<String>(new String[0]);
		add(blocksInGame1, "gridwidth=3");
		
		JLabel s4 = new JLabel("    ");
		add(s4,"gridwidth=3");
		 
		//red
				redLabel1 = new JLabel("Red:");
				add(redLabel1);
				
				colorSliderRed1 = new JSlider(0, 255, 0);	  
				add(colorSliderRed1);
				
				redTextField = new JTextField();
				redTextField.setEditable(false);
				add(redTextField);
				redTextField.setText(Integer.toString(precision));
				
				JLabel a1 = new JLabel("    ");
				add(a1,"gridwidth=1");
				
				//green
				greenLabel1 = new JLabel("Green:");
				add(greenLabel1);
				
				colorSliderGreen1 = new JSlider(0, 255, 0);	  
				add(colorSliderGreen1);
				
				greenTextField1 = new JTextField();
				greenTextField1.setEditable(false);
				add(greenTextField1);
				greenTextField1.setText(Integer.toString(precision));
				
				JLabel b1 = new JLabel("    ");
				add(b1,"gridwidth=7");
				
				//blue
				blueLabel1 = new JLabel("Blue:");
				add(blueLabel1);
				
				colorSliderBlue1 = new JSlider(0, 255, 0);	  
				add(colorSliderBlue1);
				
				blueTextField1 = new JTextField();
				blueTextField1.setEditable(false);
				add(blueTextField1);
				blueTextField1.setText(Integer.toString(precision));
				
				JLabel aa1 = new JLabel("    ");
				add(aa1,"gridwidth=1");
				
				//points
				pointsLabel1 = new JLabel("Points: ");
				add(pointsLabel1);
				pointsSlider1 = new JSlider(0, 1000, 0);	  
				add(pointsSlider1);
				
				pointsTextField1 = new JTextField();
				pointsTextField1.setEditable(false);
				add(pointsTextField1);
				pointsTextField1.setText(Integer.toString(precision));
				
				JLabel c1 = new JLabel("    ");
				add(c1,"gridwidth=5");
				
				updateBlockButton = new JButton("Update Block");
				add(updateBlockButton, "gridwidth=2");
				
				JSeparator horizontalLineTop5 = new JSeparator();
				add(horizontalLineTop5, "gridwidth=14");
		 
				
				//JLabel c2 = new JLabel("    ");
				//add(c2,"gridwidth=10");
				
				//JButton abc = new JButton ("Hello");
				//add(abc, "gridwidth=2");
				
				
			
				String [] Calculator_Buttons = {"<--", "Res→In" ,  "C" , "+/-" , "(" , ")", "+" , "7" , "8" , "9" , "-" , "4" , "5" , "6" , "x" , "1" ,"2" , "3" ,  "/" , ".", "0" };
			for (int counter1=0; counter1<Calculator_Buttons.length; counter1++) {
					if(Calculator_Buttons[counter1].matches("C")) {
						add(new JButton(Calculator_Buttons[counter1]), "gridwidth=2");
					}
					else {
						add(new JButton(Calculator_Buttons[counter1]));
					}
				}
		
		
			
		
		
		
		
		
		
		
		
	}

} 

