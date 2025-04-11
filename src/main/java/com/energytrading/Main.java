package com.energytrading;

import com.energytrading.controllers.BillingController;
import com.energytrading.controllers.TradingController;
import com.energytrading.controllers.UserController;
import com.energytrading.services.BillingService;
import com.energytrading.services.TradingService;
import com.energytrading.services.UserService;

import java.util.Scanner;

@SpringBootApplication
@ComponentScan(basePackages = "com.energytrading")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        UserController userController = new UserController(userService);
        BillingController billingController = new BillingController(billingService);
        TradingController tradingController = new TradingController(tradingService);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Register User");
            System.out.println("2. Login User");
            System.out.println("3. Create Bill");
            System.out.println("4. View Bill");
            System.out.println("5. Pay Bill");
            System.out.println("6. Create Transaction");
            System.out.println("7. View All Transactions");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    userController.registerUser();
                    break;
                case 2:
                    userController.loginUser();
                    break;
                case 3:
                    billingController.createBill();
                    break;
                case 4:
                    billingController.viewBill();
                    break;
                case 5:
                    billingController.payBill();
                    break;
                case 6:
                    tradingController.createTransaction();
                    break;
                case 7:
                    tradingController.viewAllTransactions();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
