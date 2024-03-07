package dev.sirosh.dto;

import dev.sirosh.dto.extractor.ExtractorChainDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SourceDto {
    private String name;
    private String baseUrl;
    private String localPath;
    private Set<ExtractorChainDto> extractorChains;
    private Map<String, String> headers = new HashMap<>();
}
