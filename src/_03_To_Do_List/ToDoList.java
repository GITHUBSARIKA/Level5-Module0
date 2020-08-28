package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToDoList implements ActionListener{
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 *
	 */
	JButton addTask;
	JButton viewTask;
	JButton removeTask;
	JButton saveList;
	JButton loadList;
	public ToDoList(){
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		addTask=new JButton("Add Task");
		viewTask=new JButton("View Task");
		removeTask=new JButton("Remove Task");
		saveList=new JButton("Save List");
		loadList=new JButton("Load List");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(addTask);
		panel.add(viewTask);
		panel.add(removeTask);
		panel.add(saveList);
		panel.add(loadList);
		addTask.addActionListener(this);
		viewTask.addActionListener(this);
		removeTask.addActionListener(this);
		saveList.addActionListener(this);
		loadList.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		ToDoList todo=new ToDoList();
		ArrayList<String> tasks=new ArrayList<String>();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO o-generated method stub
	     if(arg0.getSource() == addTask) {
	    	 String addedTask=JOptionPane.showInputDialog("Type a task in.");
	     }
	}
}
