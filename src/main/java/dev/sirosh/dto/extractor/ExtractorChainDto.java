package dev.sirosh.dto.extractor;

import dev.sirosh.enums.ExtractorChainType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExtractorChainDto {
    private ExtractorChainType type;
    private List<ExtractorInfoDto> extractorInfo;
}
