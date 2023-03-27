package be.vdab.mensen.controllers;

import be.vdab.mensen.domain.Mens;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/")
    List<Mens> findAll() {
        logger.info("GET request naar alle mensen");
        return List.of(
                new Mens(1, "James", "Gosling"),
                new Mens(1, "Brian", "Goetz"),
                new Mens(3, "Gavin", "King"));
    }
}
