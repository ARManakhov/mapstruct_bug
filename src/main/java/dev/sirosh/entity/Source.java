package dev.sirosh.entity;


import dev.sirosh.entity.extractor.ExtractorChain;
import lombok.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Source {
    private Long id;
    private String name;
    private String baseUrl;
    private String localPath;
    private Set<ExtractorChain> extractorChains;
    private Map<String, String> headers = new HashMap<>();
}
