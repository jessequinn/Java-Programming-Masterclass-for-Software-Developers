// Challenge Exercise Lesson 56

package com.jessequinn;

public class Main {

    public static void main(String[] args) {
//        Account jessesAccount = new Account("123456",0.00,"Jesse Quinn","me@jessequinn.info", "(416) 425-6460");
//
//        jessesAccount.withdrawal(100);
//        jessesAccount.deposit(50);
//        jessesAccount.withdrawal(100);
//        jessesAccount.deposit(51);
//        jessesAccount.withdrawal(100);
//
//        System.out.println("Number: " + jessesAccount.getNumber());
//
//        Account bobsAccount = new Account();
//        System.out.println("Number: " + bobsAccount.getNumber());

        VipPerson person1 = new VipPerson();

        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);

        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "some@email.com");

        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

    }
}
