package com.example.swaggertest.controller;

import com.example.swaggertest.domain.model.Sample;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("sample")
public class SampleController {

    private static List<Sample> samples = List.of(new Sample(), new Sample());

    @GetMapping
    public List<Sample> getSamples() {
        return samples;
    }

    @GetMapping("{id}")
    public Sample getSample(@PathVariable int id) {
        return samples.get(0);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createSample(final @Valid @RequestBody Sample sample, BindingResult bindingResult) {
    }
}
