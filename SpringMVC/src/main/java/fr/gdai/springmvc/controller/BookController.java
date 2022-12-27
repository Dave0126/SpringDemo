package fr.gdai.springmvc.controller;

import fr.gdai.springmvc.domain.Book;
import fr.gdai.springmvc.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping("/toEntityList")
    // 2.3 	设置当前操作的返回值类型, 将该方法的返回值作为响应体返回给浏览器
    @ResponseBody
    public Result showAllBook() {
        Integer code;
        String message;

        List<Book> books = bookService.showAllBooks();
        if (books == null){
            code = ResultCode.SELECT_ERR;
            message = "查询结果为空，请重试";
        } else {
            code = ResultCode.SELECT_SUCC;
            message = "查询成功";
        }
        System.out.println("返回实体集合信息");
        return new Result(code, books, message);
    }

    @RequestMapping("/save")
    @ResponseBody
    public String bookSave() {
        System.out.println("book saved!");
        return "{'module':'springmvc:bookSave()'}";
    }

    @RequestMapping("/addBookEntity")
    @ResponseBody
    public String addBookEntity(Book book) {
        System.out.println("实体类型参数传递 ---> " + book);
        return "{'module':'springmvc:addBookEntity()'}";
    }

    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> args){
        System.out.println("集合类型参数传递 ---> " + args);
        return "{'module':'springmvc:listParam()'}";
    }

    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> args){
        System.out.println("JSON类型参数传递 ---> " + args);
        return "{'module':'listParamForJson()'}";
    }

    @RequestMapping("/entityParamForJson")
    @ResponseBody
    public String entityParamForJson(@RequestBody Book book) {
        System.out.println("实体类型参数传递 ---> " + book);
        return "{'module':'springmvc:entityParamForJson()'}";
    }

    @RequestMapping("/entityListParamForJson")
    @ResponseBody
    public String entityListParamForJson(@RequestBody List<Book> books) {
        System.out.println("JSON实体类型集合参数传递 ---> " + books);
        return "{'module':'springmvc:entityListParamForJson()'}";
    }

    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date date) {
        System.out.println("日期类型集合参数传递 ---> " + date);
        return "{'module':'springmvc:dateParam()'}";
    }

    @RequestMapping("/jumpToIndex")
    public String jumpToIndex() {
        System.out.println("跳转到index");
        return "/index.jsp";
    }

    @RequestMapping("/toText")
    @ResponseBody
    public String toText() {
        System.out.println("返回纯文本信息");
        return "response text";
    }

    @RequestMapping("/toArray")
    @ResponseBody
    public int[] toArray() {
        System.out.println("返回数组信息");
        return new int[] {1,2,3};
    }

    @RequestMapping("/toEntity")
    @ResponseBody
    public Book toEntity() {
        System.out.println("返回实体类信息");
        return new Book(null, "responseJSON", 100, 100);
    }

}
