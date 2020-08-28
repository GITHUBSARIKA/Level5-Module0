package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
	ArrayList<String> tasks;
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
		tasks=new ArrayList<String>();
	}
	public static void main(String[] args) {
		ToDoList todo=new ToDoList();
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO o-generated method stub
	     if(arg0.getSource() == addTask) {
	    	 String addedTask=JOptionPane.showInputDialog("Type a task in.");
	    	 tasks.add(addedTask);
	     }
	     if(arg0.getSource()==viewTask) {
	    	 String list = "";
	    	 for (int i = 0; i < tasks.size(); i++) {
				list+=tasks.get(i)+"\n";
			}
	    	 JOptionPane.showMessageDialog(null, "Here are your tasks: \n "+ list );
	     }
	     if(arg0.getSource()==removeTask) {
	    	 String message = "Which task do you want to remove\n";
	    	 
	    	 
	    	 for (int i = 0; i < tasks.size(); i++) {
				message+=tasks.get(i)+"\n";
			}
	    	 String removedTask= JOptionPane.showInputDialog(message );
	    	 for (int i = 0; i < tasks.size(); i++) {
					if(tasks.get(i).equals(removedTask)) {
						tasks.remove(tasks.get(i));
					}
				}
	    	
	     }
	     if(arg0.getSource()==saveList) {
	    	 try {
	    		 FileWriter fw=new FileWriter("ToDo list");
	    		 for (int i = 0; i <tasks.size() ; i++) {
					fw.write(tasks.get(i) + "\n");
				}
	    		 fw.close();
	    		 
	    	 }catch(IOException e) {
	    		 e.printStackTrace();
	    	 }
	     }
	     if(arg0.getSource()==loadList) {
	    	try {
	    		BufferedReader br=new BufferedReader(new FileReader("ToDo list"));
	    		
	    		String line=br.readLine();
	    		while(line!=null) {
	    			tasks.add(line);

	    			line=br.readLine();
	    			
	    		}
	    		br.close();
	    		
	    	}catch(FileNotFoundException el){
	    		el.printStackTrace();
	    	}catch(IOException e) {
	    		e.printStackTrace();
	    	}
	     }
	}
}
