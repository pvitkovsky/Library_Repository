package moriakoff.book.controller;

import moriakoff.book.dto.PublisherDto;
import moriakoff.book.entity.Publisher;
import moriakoff.book.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    @Autowired
    PublisherService publisherService;

    @PostMapping
    public boolean add(@RequestBody PublisherDto publisher){
        return publisherService.add(publisher);
    }

    @PutMapping
    public boolean update(@RequestBody PublisherDto publisher) {
        return publisherService.update(publisher);
    }
    @DeleteMapping
    public boolean delete(@RequestBody PublisherDto publisher){
        return publisherService.delete(publisher);
    }

    @GetMapping
    public PublisherDto get(@RequestParam("name") String name){
        return publisherService.getPublisher(name);
    }


}
