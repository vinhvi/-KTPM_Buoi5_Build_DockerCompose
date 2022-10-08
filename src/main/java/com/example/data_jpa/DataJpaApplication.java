package com.example.data_jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import com.example.data_jpa.reponsitory.ChungNhanDAOImpl;
import com.example.data_jpa.reponsitory.ChuyenBayDAOImpl;
import com.example.data_jpa.reponsitory.MayBayDAOImpl;
import com.example.data_jpa.reponsitory.NhanVienDAOImpl;

@SpringBootApplication
@Transactional
public class DataJpaApplication {
	@Bean
	public CommandLineRunner run(ChuyenBayDAOImpl chuyenBayDAOImpl, MayBayDAOImpl mayBayDAOImpl,
			NhanVienDAOImpl nhanVienDAOImpl, ChungNhanDAOImpl chungNhanDAOImpl) {
		return (ArgsAnnotationPointcut -> {
			
		});
	}

	public static void main(String[] args) {
		SpringApplication.run(DataJpaApplication.class, args);
	}

}
