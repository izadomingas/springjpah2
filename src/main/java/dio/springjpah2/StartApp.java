package dio.springjpah2;

import dio.springjpah2.model.User;
import dio.springjpah2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setName("teste");
        user.setUsername("za");
        user.setPassword("123");

        repository.save(user);


        for(User u: repository.findAll()){
            System.out.println(u);
        }

    }

    }

