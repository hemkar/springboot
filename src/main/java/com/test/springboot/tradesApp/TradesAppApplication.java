package com.test.springboot.tradesApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.test.springboot.beans.Trades;
import com.test.springboot.dao.TradesDao;

@SpringBootApplication
@ComponentScan("com.test.springboot")
public class TradesAppApplication implements CommandLineRunner {

	
	//private Logger logger= (Logger) LoggerFactory.logger(this.getClass());
	@Autowired
	TradesDao tradesDao;
	
	public static void main(String[] args)  {
		SpringApplication.run(TradesAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Trades> trades=tradesDao.findAll();
		//logger.info("All users ->{}",tradesDao.findAll());
		
		System.out.println("Trades from DB :"+trades);
		
		
	}
}
