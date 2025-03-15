package com.dbda;

public class Contact {

		private String name;
		private String phoneNumber;
		
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		
		public Contact() {
			super();
		}
		
		
		public Contact(String name, String phoneNumber) {
			super();
			this.name = name;
			this.phoneNumber = phoneNumber;
		}
		
		
		@Override
		public String toString() {
			return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + "]";
		}
		
		
		

}
