package com.xxxx;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA.
 * User: zhaolei
 * Date: 16-7-29
 * Time: 上午12:37
 */
@SpringBootApplication
public class ApplicationStart implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("args = [" + args + "]");
        BqTool.doit(args);
    }
}
