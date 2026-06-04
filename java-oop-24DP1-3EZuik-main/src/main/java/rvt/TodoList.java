package rvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList {

	private final List<String> tasks;

	public TodoList() {
		this.tasks = new ArrayList<>();
	}

	public void add(String task) {
		this.tasks.add(task);
	}

	public void print() {
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + ". " + tasks.get(i));
		}
	}

	public void remove(int number) {
		int index = number - 1;
		if (index >= 0 && index < tasks.size()) {
			this.tasks.remove(index);
		}
	}
}

class UserInterface {

	private final TodoList todoList;
	private final Scanner scanner;

	public UserInterface(TodoList todoList, Scanner scanner) {
		this.todoList = todoList;
		this.scanner = scanner;
	}

	public void start() {
		while (true) {
			System.out.print("Command: ");
			String command = scanner.nextLine();

			if (command.equals("stop")) {
				break;
			}

			if (command.equals("add")) {
				System.out.print("Task: ");
				String task = scanner.nextLine();
				todoList.add(task);
				continue;
			}

			if (command.equals("list")) {
				todoList.print();
				continue;
			}

			if (command.equals("remove")) {
				System.out.print("Which one is removed? ");
				int number = Integer.valueOf(scanner.nextLine());
				todoList.remove(number);
			}
		}
	}
}