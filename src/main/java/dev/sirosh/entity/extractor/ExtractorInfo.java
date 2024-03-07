package dev.sirosh.entity.extractor;

import dev.sirosh.enums.ExtractorType;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExtractorInfo {
    private Long id;
    private String selector;
    private ExtractorType type;
    private int order;
    private ExtractorChain extractorChain;
}
