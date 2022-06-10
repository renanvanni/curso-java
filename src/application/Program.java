package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.Circle;
import entities.ImportedProduct;
import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.ProductExFix;
import entities.Rectangle;
import entities.SavingsAccount;
import entities.Shape;
import entities.UsedProduct;
import entities.enums.Color;
import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		PROGRMA 1
//		Triagle x, y;
//		x = new Triagle();
//		y = new Triagle();
//		
//		System.out.println("Enter the measures of triangle X: ");
//		
//		x.a = sc.nextDouble();
//		x.b = sc.nextDouble();
//		x.c = sc.nextDouble();
//		
//		System.out.println("Enter the measures of triangle Y: ");
//		
//		y.a = sc.nextDouble();
//		y.b = sc.nextDouble();
//		y.c = sc.nextDouble();
//		
//		double areaX = x.area();
//		double areaY = y.area();
//		
//		System.out.printf("Triangle X area: %.4f%n", areaX);
//		System.out.printf("Triangle Y area: %.4f%n", areaY);
//		
//		if (areaX > areaY) {
//			System.out.println("Larger area: X");
//		} else {
//			System.out.println("Larger area: Y");
//		}
		
//		PROGRMA 2
		
//		System.out.println("Enter product data: ");
//		System.out.print("Name: ");
//		String name = sc.nextLine();
//		System.out.print("Price: ");
//		double price = sc.nextDouble();
//		System.out.print("Quantity in stock: ");
//		int quantity = sc.nextInt();
		
//		Product product = new Product(name, price);
//		
//		product.setName("Computador");
//		System.out.println("Updated name: " + product.getName());
//		
//		product.setPrice(1200.00);
//		System.out.println("Updated price: " + product.getPrice());
//		
//		System.out.println();
//		System.out.println("Product data: " + product);
//		
//		System.out.println();
//		System.out.print("Enter the number of products to be added in stock: ");
//		int quantity = sc.nextInt();
//		product.addProducts(quantity);
//		
//		System.out.println();
//		System.out.println("Updated data: " + product);
//		
//		System.out.println();
//		System.out.print("Enter the number of products to be removed from stock: ");
//		quantity = sc.nextInt();
//		product.removeProducts(quantity);
//		
//		System.out.println();
//		System.out.println("Updated data: " + product);
		
//		PROGRAMA 3
//		System.out.print("Enter radius: ");
//		double radius = sc.nextDouble();
//		
//		double c = Calculator.circunferencia(radius);
//		
//		double v = Calculator.volume(radius);
//		
//		System.out.printf("Circunferencia: %.2f%n", c);
//		System.out.printf("Volume: %.2f%n", v);
//		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
//		EXERCICIO 1
//		System.out.print("What is the dollar price? ");
//		double dolar = sc.nextDouble();
//		
//		System.out.print("How many dollars will be bought? ");
//		double qtd = sc.nextDouble();
//		
//		double total = Calculator.precoASerPago(dolar, qtd);
//		
//		System.out.printf("Amout to be paid in reais = %.2f%n", total);
		
//		EXERCICIO 2
//		Banco banco;
//		System.out.print("Enter account number: ");
//		int numeroConta = sc.nextInt();
//		
//		System.out.print("Enter account holder: ");
//		sc.nextLine();
//		String nome = sc.nextLine();
//		
//		System.out.print("Is there a initial deposit (y/n)? ");
//		char x = sc.next().charAt(0);
//		
//		
//		if(x == 'y') {
//			System.out.print("Enter initial deposit value: ");
//			double inicialDeposit = sc.nextDouble();
//			banco = new Banco(numeroConta, nome, inicialDeposit);
//		} else {
//			banco = new Banco(numeroConta, nome);
//		}
//		
//		System.out.println();
//		System.out.println("Account data:");
//		System.out.printf("Account " + banco);
//		
//		System.out.println();
//		System.out.print("Enter a deposit value: ");
//		banco.depositar(sc.nextDouble());
//		
//		System.out.println("Updated account data: ");
//		System.out.println("Account " + banco);
//		
//		System.out.print("Enter a withdraw value: ");
//		banco.retirar(sc.nextDouble());
//		
//		System.out.println("Updated account data: ");
//		System.out.println("Account " + banco);
		
//		PROGRAMA 4
//		int n = sc.nextInt();
//		Product[] vect = new Product[n];
//		
//		for(int i = 0; i < vect.length; i++) {
//			sc.nextLine();
//			String name = sc.nextLine();
//			double price = sc.nextDouble();
//			vect[i] = new Product(name, price);
//		}
//
//		double sum = 0.0;
//		for(int i = 0; i < vect.length; i++) {
//			sum += vect[i].getPrice();
//		}
//		
//		double avg = sum / vect.length;
//		
//		System.out.printf("Average height: %.2f%n", avg);
		
//		EXERCICIO 3
//		Quartos[] vect = new Quartos[10];
//		
//		System.out.print("How many rooms will be rented? ");
//		int n = sc.nextInt();
//		System.out.println();
//		
//		for(int i = 0; i < n; i++) {
//			System.out.println("Rent #" + (i + 1));
//			System.out.print("Name: ");
//			sc.nextLine();
//			String name = sc.nextLine();
//			System.out.print("Email: ");
//			String email = sc.nextLine();
//			System.out.print("Room: ");
//			int room = sc.nextInt();
//			System.out.println();
//			vect[room] = new Quartos(name, email);
//		}
//		
//		System.out.println("Busy rooms:");
//		for(int i = 0; i < vect.length; i++) {
//			if(vect[i] != null) {
//				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
//			}
//		}
		
//		PROGRAMA 5 -> listas
//		List<String> list = new ArrayList<String>();
//		
//		list.add("Maria");
//		list.add("Alex");
//		list.add("Bob");
//		list.add("Ana");
//		list.add(2, "Marco");
//		
//		System.out.println(list.size());
//		
//		for(String x : list) {
//			System.out.println(x);
//		}
//		
//		list.remove("Ana");
//		list.remove(1);
//		list.removeIf(x -> x.charAt(0) == 'M');
//		System.out.println("---------------------");
//		for(String x : list) {
//			System.out.println(x);
//		}
//		
//		System.out.println("---------------------");
//		System.out.println("Index of Bob: " + list.indexOf("Bob"));
//		System.out.println("Index of Marco: " + list.indexOf("Marco"));
//
//		System.out.println("---------------------");
//		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
//		
//		for(String x : result) {
//			System.out.println(x);
//		}
//		
//		System.out.println("---------------------");
//		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
//		System.out.println(name);
		
//		EXERCICIO 4
//		List<Employee> list = new ArrayList<Employee>();
//		
//		System.out.print("How many employees will be registered? ");
//		int n = sc.nextInt();
//		System.out.println();
//		
//		for(int i = 0; i < n; i++) {
//			System.out.println("Employee #" + (i + 1) + ":");
//			System.out.print("Id: ");
//			Integer id = sc.nextInt();
//			
//			while(hasId(list, id)) {
//				System.out.println("Id already taken! Try again: ");
//				id = sc.nextInt();
//			}
//			
//			sc.nextLine();
//			System.out.print("Name: ");
//			String name = sc.nextLine();
//			System.out.print("Salary: ");
//			Double salary = sc.nextDouble();
//			System.out.println();
//			list.add(new Employee(name, salary, id));
//		}
//		
//		System.out.print("Enter the employee ID that will have salary increase: ");
//		Integer id = sc.nextInt();
		
//		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
//		Integer pos = position(list, id);
//		
//		if(pos == null) {
//			System.out.println("This ID does not exist!");
//		} else {
//			System.out.print("Enter the percentage: ");
//			Double percentage = sc.nextDouble();
//			list.get(pos).increaseSalary(percentage);
//			emp.increaseSalary(percentage);
//		}
//		System.out.println();
//		System.out.println("List of employees:");
//		for(Employee e : list) {
//			System.out.println(e.getId() + ": " + e.getName() + ", " + e.getSalary());
//		}
		
//		PROGRAMA 6 -> MATRIZES
//		int n = sc.nextInt();
//		int[][] mat = new int[n][n];
//		
//		for(int i = 0; i < mat.length; i++) {
//			for(int j = 0; j < mat[i].length; j++) {
//				mat[i][j] = sc.nextInt();
//			}
//		}
//		
//		System.out.println("Main diagonal:");
//		for(int i = 0; i < mat.length; i++) {
//			System.out.print(mat[i][i] + " ");			
//		}
//		System.out.println();
//		
//		int count = 0;
//		for(int i = 0; i < mat.length; i++) {
//			for(int j = 0; j < mat[i].length; j++) {
//				if(mat[i][j] < 0) {
//					count++;
//				}
//			}
//		}
//		System.out.println("Negative numbers = " + count);
		
//		PROGRAMA 7 -> Enum
//		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
//		
//		System.out.println(order);
//		
//		OrderStatus os1 = OrderStatus.DELIVERED;
//		
//		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
//		
//		System.out.println(os1);
//		System.out.println(os2);
		
//		EXERCÍCIO 5
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		
//		System.out.print("Enter department's name: ");
//		String departmentName = sc.nextLine();
//		System.out.println("Enter worker data: ");
//		System.out.println("Name: ");
//		String workerName = sc.nextLine();
//		System.out.println("Level: ");
//		String workerLevel = sc.nextLine();
//		System.out.println("Base Salary: ");
//		double baseSalary = sc.nextDouble();
//		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
//		
//		System.out.print("How many contracts to this worker? ");
//		int n = sc.nextInt();
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.println("Enter contract #" + i + " data:");
//			System.out.print("Date (DD/MM/YYYY): ");
//			Date contractDate = sdf.parse(sc.next());
//			System.out.print("Value per hour: ");
//			double valuePerHour = sc.nextDouble();
//			System.out.print("Duration (hours): ");
//			int hours = sc.nextInt();
//			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
//			worker.addContract(contract);
//		}
//
//		System.out.println();
//		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
//		String monthAndYear = sc.next();
//		int month = Integer.parseInt(monthAndYear.substring(0, 2));
//		int year = Integer.parseInt(monthAndYear.substring(3));
//		
//		System.out.println("Name: " + worker.getName());
//		System.out.println("Department: " + worker.getDepartment().getName());
//		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
//		EXERCÍCIO 6
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		
//		Comment c1 = new Comment("Have a nice trip!");
//		Comment c2 = new Comment("Wow that's awesome!");
//		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),  "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
//		p1.addComment(c1);
//		p1.addComment(c2);
//		
//		Comment c3 = new Comment("Good night");
//		Comment c4 = new Comment("May the Force be with you");
//		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
//		p2.addComment(c3);
//		p2.addComment(c4);
//		
//		System.out.println(p1);
//		System.out.println(p2);
		
//		EXERCICIO 7
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		
//		
//		System.out.println("Enter cliente data:");
//		System.out.print("Name: ");		
//		String name = sc.nextLine();
//		System.out.print("Email: ");
//		String email = sc.next();
//		System.out.print("Birth date (DD/MM/YYYY): ");
//		Date date = sdf.parse(sc.next());
//		
//		Client client = new Client(name, email, date);
//		
//		System.out.println("Enter order data:");
//		System.out.print("Status: ");
//		OrderStatus os = OrderStatus.valueOf(sc.next());
//		
//		Order7 order = new Order7(new Date(), os, client);
//		
//		System.out.print("How many items to this order? ");
//		Integer itens = sc.nextInt();
//		
//		for(int i = 0; i < itens; i++) {
//			System.out.println("Enter #" + (i + 1) + " item data:");
//			System.out.print("Product name: ");
//			sc.nextLine();
//			String productName = sc.nextLine();
//			System.out.print("Product price: ");
//			Double productPrice = sc.nextDouble();
//			System.out.print("Quantity: ");
//			Integer productQuantity = sc.nextInt();
//			
//			Product7 product = new Product7(productName, productPrice);
//			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
//			order.addItem(orderItem);
//		}
//		
//		System.out.println();
//		System.out.println("ORDER SUMARY:");
//		System.out.println(order);
		
//		PROGRAMA 8 -> Herança, upcasting e downcasting
		
//		Account acc = new Account(1001, "Renan", 0.0);
//		BusinessAccount bacc = new BusinessAccount(1002, "Rebeca", 0.0, 500.0);
		
//		UPCASTING
		
//		Account acc1 = bacc;
//		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
//		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 200.0);
		
//		DOWNCASTING
		
//		BusinessAccount acc4 = (BusinessAccount)acc2;
//		acc4.loan(100.0);
		
//		BusinessAccount acc5 = (BusinessAccount)acc3;
//		if (acc3 instanceof BusinessAccount) {
//			BusinessAccount acc5 = (BusinessAccount)acc3;
//			acc5.loan(200.0);
//			System.out.println("Loan!");
//		}
//		
//		if (acc3 instanceof SavingsAccount) {
//			SavingsAccount acc5 = (SavingsAccount)acc3;
//			acc5.updateBalance();
//			System.out.println("Update!");
//		}
		
//		EXERCICIO 8 -> POLIMORFISMO
		
//		List<EmployeeEx8> list = new ArrayList<EmployeeEx8>();
//		
//		System.out.print("Enter the number of employees: ");
//		int n = sc.nextInt();
//		
//		for (int i = 0; i < n; i++) {
//			System.out.println("Employee #" + (i + 1) + " data:");
//			System.out.print("Outsourced (y/n)? ");
//			char ch = sc.next().charAt(0);
//			System.out.print("Name: ");
//			sc.nextLine();
//			String name = sc.nextLine();
//			System.out.print("Hours: ");
//			int hours = sc.nextInt();
//			System.out.print("Value per hour: ");
//			double valuePerHour = sc.nextDouble();
//			if (ch == 'y') {
//				System.out.print("Additional charge: ");
//				double additionalCharge = sc.nextDouble();
//				EmployeeEx8 emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
//				list.add(emp);
//				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
//			} else {
//				EmployeeEx8 emp = new EmployeeEx8(name, hours, valuePerHour);
//				list.add(emp);
//				list.add(new EmployeeEx8(name, hours, valuePerHour));
//			}
//		}
//		
//		System.out.println();
//		System.out.println("PAYMENTS:");
//		for (EmployeeEx8 emp : list) {
//			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));			
//		}
		
//		EXERCICIO DE FIXAÇÃO -> POLIMORFISMO
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		
//		List<ProductExFix> list = new ArrayList<ProductExFix>();
//		
//		System.out.print("Enter the number of products: ");
//		int n = sc.nextInt();
//		
//		for (int i = 0; i < n; i++) {
//			System.out.println("Product #" + (i + 1) + " data:");
//			System.out.print("Common, used or imported (c/u/i)? ");
//			char ch = sc.next().charAt(0);
//			System.out.print("Name: ");
//			sc.nextLine();
//			String name = sc.nextLine();
//			System.out.print("Price: ");
//			double price = sc.nextDouble();
//			if (ch == 'i') {
//				System.out.print("Customs free: ");
//				double free = sc.nextDouble();
//				list.add(new ImportedProduct(name, price, free));
//			} else if (ch == 'c') {
//				list.add(new ProductExFix(name, price));
//			} else {
//				System.out.print("Manufacture date (DD/MM/YYYY): ");
//				Date date = sdf.parse(sc.next());
//				list.add(new UsedProduct(name, price, date));
//			}
//		}
//		
//		System.out.println();
//		System.out.println("PRICE TAGS:");
//		for (ProductExFix product : list) {
//			System.out.println(product.priceTag());			
//		}
		
//		CLASSE ABSTRATA
//		List<Account> list = new ArrayList<Account>();
//		
//		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
//		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.0));
//		list.add(new SavingsAccount(1003, "Bob", 300.00, 0.01));
//		list.add(new BusinessAccount(1004, "Ana", 500.00, 500.0));
//		
//		double sum = 0;
//		for (Account acc : list) {
//			sum += acc.getBalance();
//		}
//		
//		System.out.printf("Total balance: %.2f%n", sum);
//		
//		for (Account acc : list) {
//			acc.deposit(10);
//		}
//		
//		for (Account acc : list) {
//			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
//		}
		
//		MÉTODO ABSTRATO
//		List<Shape> list = new ArrayList<Shape>();
//		
//		System.out.print("Enter the number of shapes: ");
//		int n = sc.nextInt();
//		
//		for (int i = 0; i < n; i++) {
//			System.out.println("Shape #" + (i + 1) + " data:");
//			System.out.print("Rectangle or Cicle (r/c)? ");
//			char ch = sc.next().charAt(0);
//			System.out.print("Color (BLACK/BLUE/RED): ");
//			Color color = Color.valueOf(sc.next());
//			if (ch == 'r') {
//				System.out.print("Width: ");
//				double width = sc.nextDouble();
//				System.out.print("Height: ");
//				double height = sc.nextDouble();
//				list.add(new Rectangle(color, width, height));
//			} else {
//				System.out.print("Radius: ");
//				double radius = sc.nextDouble();
//				list.add(new Circle(color, radius));
//			}
//		}
//		
//		System.out.println();
//		System.out.println("SHAPE AREAS:");
//		for (Shape shape : list) {
//			System.out.println(String.format("%.2f", shape.area()));
//		}
		
//		EXERCICIO 9
//		List<Pessoa> list = new ArrayList<Pessoa>();
//		
//		System.out.print("Enter the number of tax payers: ");
//		int n = sc.nextInt();
//		
//		for (int i = 0; i < n; i++) {
//			System.out.println("Tax payer #" + (i + 1) + " data:");
//			System.out.print("Individual or company (i/c)? ");
//			char ch = sc.next().charAt(0);
//			System.out.print("Name: ");
//			sc.nextLine();
//			String name = sc.nextLine();
//			System.out.print("Anual income: ");
//			double anualIncome = sc.nextDouble();
//			if (ch == 'i') {
//				System.out.print("Health expenditures: ");
//				double health = sc.nextDouble();
//				list.add(new PessoaFisica(name, anualIncome, health));
//			} else {
//				System.out.print("Number of employees: ");
//				int number = sc.nextInt();
//				list.add(new PessoaJuridica(name, anualIncome, number));
//			}
//		}
//		
//		System.out.println();
//		System.out.println("TAXES PAID:");
//		Double sum = 0.0; 
//		for (Pessoa r : list) {
//			System.out.println(r.getName() + ": $ " + String.format("%.2f", r.tax()));			
//			sum += r.tax();
//		}
//		
//		System.out.println();
//		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
		
//		EXCEÇÕES
//		method1();
//		System.out.println("End of program");
		
//		EXCEÇÕES2		
//		File file = new File("C:\\temp\\in.txt");
//		sc = null;
//		
//		try {
//			sc = new Scanner(file);
//			while (sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//			}
//		}
//		catch (FileNotFoundException e) {
//			System.out.println("Error opening file: " + e.getMessage());
//		}
//		finally {
//			if (sc != null) {
//				sc.close();
//			}
//			System.out.println("Finally block executed");
//		}
		
//		EXCEÇÕES 3
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			System.out.println();
			System.out.println("Enter date to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Reservation dates for updates must be future dates");
			} else if (!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			} else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);				
			}
			
		}
		
		sc.close();
	}
	
//	EXCEÇÕES
//	public static void method1() {
//		System.out.println("*** METHOD1 START ***");
//		method2();
//		System.out.println("*** METHOD1 END ***");
//	}
//	public static void method2() {
//		System.out.println("*** METHOD2 START ***");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			String[] vect = sc.nextLine().split(" ");
//			int position = sc.nextInt();
//			System.out.println(vect[position]);			
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Invalid position!");
//			e.printStackTrace();
//			sc.next();
//		}
//		catch (InputMismatchException e) {
//			System.out.println("Input error");
//		}
//				
//		sc.close();
//		
//		System.out.println("*** METHOD2 END ***");
//	}

//	public static Integer position(List<Employee> list, int id) {
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getId() == id) {
//				return i;
//			}
//		}
//		return null;
//	}
//	
//	public static boolean hasId(List<Employee> list, int id) {
//		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
//		return emp != null;
//	}
}
