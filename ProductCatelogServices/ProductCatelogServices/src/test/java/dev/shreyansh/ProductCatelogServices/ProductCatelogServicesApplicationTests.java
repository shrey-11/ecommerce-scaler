package dev.shreyansh.ProductCatelogServices;

import dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.JoinedTable.JtMentorRepository;
import dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.JoinedTable.JtUserRepository;
import dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.JoinedTable.User;
import dev.shreyansh.ProductCatelogServices.inheritanceTypesImplementation.JoinedTable.Mentor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductCatelogServicesApplicationTests {
    @Autowired
    private JtUserRepository userRepository;
    @Autowired
    private JtMentorRepository mentorRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testDifferentInheritances() {
//        User user = new User();
//        user.setName("naman@scaler.com");
//        user.setPassword("password");
//        user.setEmail("ABC@gmail.com");
//        userRepository.save(user);
//
//        Mentor mentor = new Mentor();
//        mentor.setName("nmn@sclr.com");
//        mentor.setPassword("psswrd");
//        mentor.setRating("4");
//
//        mentorRepository.save(mentor);
    }

}
