package zz2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zz2.service.CrawlerDataService;
import zz2.support.RequestResult;
@CrossOrigin
@Controller
@RequestMapping("/api/test")
public class CrawlerDataController {

    @Autowired
    public CrawlerDataService crawlerDataService;

    @RequestMapping(value = "/RandomSelectBook", method = RequestMethod.POST)
    @ResponseBody
    RequestResult RandomSelectBook(String serial) {
        RequestResult result = crawlerDataService.RandomSelectBook(serial);
        return result;
    }

    @GetMapping(value = "/selectWriterInformation/{authorName}")
    @ResponseBody
    RequestResult selectWriterInformation(@PathVariable String authorName) {
        RequestResult result = crawlerDataService.selectWriterInformation(authorName);
        return result;
    }

    @GetMapping(value = "/selectWriterBook/{authorName}")
    @ResponseBody
    RequestResult selectWriterBook(@PathVariable String authorName) {
        RequestResult result = crawlerDataService.selectWriterBook(authorName);
        return result;
    }

    @GetMapping(value = "/selectBookByBookName/{bookName}")
    @ResponseBody
    RequestResult selectBookByBookName(@PathVariable String bookName){
        RequestResult result=crawlerDataService.selectBookByBookName(bookName);
        return result;
    }

    @GetMapping(value = "/selectAllBook")
    @ResponseBody
    RequestResult selectAllBook(){
        RequestResult result=crawlerDataService.selectAllBook();
        return result;
    }

}
