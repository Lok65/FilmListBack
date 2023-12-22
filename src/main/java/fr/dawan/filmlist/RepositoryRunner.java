package fr.dawan.filmlist;

import fr.dawan.filmlist.entities.*;
import fr.dawan.filmlist.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RepositoryRunner implements CommandLineRunner {

    @Autowired
    private ActorRepository actRepo;
    @Autowired
    private CategoryRepository catRepo;
    @Autowired
    private FilmRepository filmRepo;
    @Autowired
    private ProducerRepository prodRepo;
    @Autowired
    private ReviewRepository revRepo;
    @Autowired
    private UserRepository userRepo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("repository runner");

        //Actor
        List <Actor> act=actRepo.findActorByName("Leonardo Dicaprio");
        for(Actor a: act) {
            System.out.println(a);
        }

        //Category
        List <Category> cat= catRepo.findCategoryByName("Policier");
        for(Category c: cat) {
            System.out.println(c);
        }

        //Film
        List <Film> film=filmRepo.findFilmByName("Expendables");
        for(Film l: film) {
            System.out.println(l);
        }

        //Producer
        List <Producer> prod= prodRepo.findProducerByName("Michael Bay");
        for(Producer p: prod) {
            System.out.println(p);
        }

        //Review
        List <Review> rev= revRepo.findReviewByFilmId(filmRepo.findById(1L).get());//ByFilm
        for(Review r: rev) {
            System.out.println(r);
        }

        rev = revRepo.findReviewByUserId(userRepo.findById(1L).get());//ByUserId
        for(Review r: rev) {
            System.out.println(r);
        }

        rev = revRepo.findReviewById(1);//ById
        for(Review r: rev) {
            System.out.println(r);
        }

        rev = revRepo.findReviewByScore(5);//ByScore
        for(Review r: rev) {
            System.out.println(r);
        }


        //User
        List <User> user=userRepo.findUserByName("Pseudo");
        for(User u: user) {
            System.out.println(u);
        }


    }

}
