package dev.sirosh.entity.extractor;

import dev.sirosh.enums.ExtractorChainType;
import dev.sirosh.entity.Source;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExtractorChain {
    private Long id;
    private Source source;
    private ExtractorChainType type;
    private List<ExtractorInfo> extractorInfo;
}
