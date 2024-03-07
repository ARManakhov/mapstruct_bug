package dev.sirosh.dto.extractor;

import dev.sirosh.entity.extractor.ExtractorChain;
import dev.sirosh.enums.ExtractorType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExtractorInfoDto {
    private String selector;
    private ExtractorType type;
    private int order;
    private ExtractorChain extractorChain;
}
