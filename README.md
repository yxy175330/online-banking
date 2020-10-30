# Online Banking
Prototype Online Banking System using the latest Java web technologies: Java 8, Spring Boot, Spring Data, Spring Security, Hibernate, MySQL.

## Online Banking features:

### User Front:
>Registration for normal user online banking account.

>Each normal user will have 2 accounts, Primary and Savings accounts.

>Each account can deposit and withdraw money.

>Customer can transfer money between accounts and to someone else.

>Customer can view all of his transaction records and account balance.

>Customer can view and edit his profile.

>Customer can schedule an appointment to a bank.

### Security:
>Secured by Spring Security, user need to log in to access other routes.

>Passwords are encrypted with BCryptPasswordEncoder and then stored in database.

### Database:
>The database contains user, role, user_role, primary_account, primary_account_transaction, savings_account, savings_account_transaction, recipient and appointment.

>There are 2 different roles: ROLE_USER and ROLE_ADMIN.

>Normal user can only register account with ROLE_USER.

>Admin user need to manually changed his role in database.

### This project is divided into two hierarchical parts:
>User Front end using Spring and Thymeleaf.

>Backend and database using Spring and MySQL.

## System Detail Diagram:
(src/main/resources/static/images/system_detail_diagram.png)
