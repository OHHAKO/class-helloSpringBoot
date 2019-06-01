package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Customer;

//class이름, id타입. (Customer.java 보면 그럼). interface하면 클래스가 자동적으로 만들어준다.
//estore처럼 dao 코드 길게안써도 repository 기능으로 쉽게 구현이 가능하다.
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	List<Customer> findByLastName(String lastName);

}