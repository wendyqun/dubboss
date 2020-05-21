package cn.injava.dubboss.server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.concurrent.ForkJoinPool;

@Controller
public class DefferController {

    @GetMapping("/async-deferredresult")
    public DeferredResult<ResponseEntity<?>> handleReqDefResult(Model model) {
        DeferredResult<ResponseEntity<?>> output = new DeferredResult<>();
        ForkJoinPool.commonPool().submit(() -> {
            long start=System.currentTimeMillis();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            output.setResult(ResponseEntity.ok("ok->"+(System.currentTimeMillis()-start)));
        });
        return output;
    }
}
