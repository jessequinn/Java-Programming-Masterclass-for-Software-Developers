package com.jessequinn;

public class VipPerson {

        private String name;
        private double creditLmit;
        private String emailAddress;

        public VipPerson(String name, double creditLmit, String emailAddress) {
            this.name = name;
            this.creditLmit = creditLmit;
            this.emailAddress = emailAddress;
        }

        public VipPerson() {
            this("Default name", 50000, "default@email.com");
        }

        public VipPerson(String name, double creditLmit) {
            this(name, creditLmit, "unknown@email.com");
        }


        public String getName() {
            return name;
        }

        public double getCreditLmit() {
            return creditLmit;
        }

        public String getEmailAddress() {
            return emailAddress;
        }
}
