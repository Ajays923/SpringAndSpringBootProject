package com.nt.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "OTM_Person")
@RequiredArgsConstructor
public class Person implements Serializable {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer pid;
		@Column(length = 20)
		@NonNull
		private String pname;
		@Column(length = 20)
		@NonNull
		private String paddrs;
		//@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,mappedBy = "person")
		@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL)
		@JoinColumn(name = "PERSON_ID",referencedColumnName = "PID") // FK column
		private Set<PhoneNumber> contactDetails;  // for one to Many
		
		public Person() {
			System.out.println("Person::0-param constructor");
		}

		@Override
		public String toString() {
			return "Person [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + "]";
		}
		
}
