package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

    public WelcomeRestController() {
        logger.info("***** WelcomeRestController::Constructor *****");
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> welcomeMsg() {
        logger.info("***** welcomeMsg() execution start *****");
        String msg = "Welcome to the Beautiful Spring Boot REST API!";
        logger.info("***** welcomeMsg() execution end *****");
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @GetMapping("/welcome/{name}")
    public ResponseEntity<String> welcomeMsgWithName(@PathVariable String name) {
        logger.info("***** welcomeMsgWithName() execution start *****");
        String msg = String.format("Hello, %s! Welcome to the Beautiful Spring Boot REST API!", name);
        logger.info("***** welcomeMsgWithName() execution end *****");
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
