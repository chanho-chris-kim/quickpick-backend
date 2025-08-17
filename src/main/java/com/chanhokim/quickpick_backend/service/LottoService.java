package com.chanhokim.quickpick_backend.service;

import com.chanhokim.quickpick_backend.model.Draw;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LottoService {

    public Map<Integer, Integer> getNumberCounts() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InputStream is = getClass().getResourceAsStream("/data/winning-numbers.json");
        List<Draw> draws = mapper.readValue(is, new TypeReference<List<Draw>>() {});

        Map<Integer, Integer> counts = new HashMap<>();
        for (Draw draw : draws) {
            for (int num : draw.getNumbers()) {
                counts.put(num, counts.getOrDefault(num, 0) + 1);
            }
        }
        return counts;
    }
}
