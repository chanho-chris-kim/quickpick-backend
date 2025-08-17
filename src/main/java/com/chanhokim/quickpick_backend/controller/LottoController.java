package com.chanhokim.quickpick_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chanhokim.quickpick_backend.service.LottoService;

import java.util.Map;

@RestController
public class LottoController {

    @Autowired
    private LottoService lottoService;

    @GetMapping("/lotto/stats")
    public Map<Integer, Integer> getStats() throws Exception {
        return lottoService.getNumberCounts();
    }
}
