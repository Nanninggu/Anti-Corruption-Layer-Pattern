package Design.Pattern.AntiCorruption.Layer.Pattern.AntiCorruptionLayer;

import Design.Pattern.AntiCorruption.Layer.Pattern.LegacySystem.LegacyDto;
import Design.Pattern.AntiCorruption.Layer.Pattern.LegacySystem.LegacyRepository;
import Design.Pattern.AntiCorruption.Layer.Pattern.ModernSystem.ModernDto;
import Design.Pattern.AntiCorruption.Layer.Pattern.ModernSystem.ModernRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AntiCorruptionLayer {

    /**
     * Legacy System의 데이터를 가져와서
     * Modern System의 테이블에 insert 하는 로직
     */

    @Autowired
    private LegacyRepository legacyRepository;

    @Autowired
    private ModernRepository modernRepository;

    public List<ModernDto> getDataFromLegacy() {

        // get data from legacy system
        List<LegacyDto> legacyDataFromDatabase = legacyRepository.getDataFromLegacyTable();

        // translation logic between Modern system and the Legacy system
        return legacyDataFromDatabase.stream()
                .map(this::translateToDto)
                .collect(Collectors.toList());
    }

    private ModernDto translateToDto(LegacyDto legacyDto) {
        ModernDto modernDto = new ModernDto();
        modernDto.setUsername(legacyDto.getUsername());
        modernDto.setEmail(legacyDto.getEmail());

        // Insert Legacy data to Modern System
        modernRepository.putDataFromModernTable(legacyDto.getId(), legacyDto.getUsername(), legacyDto.getEmail());

        return modernDto;
    }
}
