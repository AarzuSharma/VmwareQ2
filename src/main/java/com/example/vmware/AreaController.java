package com.example.vmware;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AreaController {
    private static final int area= 0;
    private final AtomicLong counter =new AtomicLong();
    int l,b,r,side;
    int a= l*b;
    double a1= 3.14*r*r;
    int area2= side*side;

    @GetMapping("/area")
    public Area area(@RequestParam( value ="type" ,defaultValue = "1")int area)
    {
        return new Area(counter.incrementAndGet(),String.format(area));
    }

mapper.writeValue(new );

    AreaController("/users/AarzuSharma/OutputArea.json"),area
}