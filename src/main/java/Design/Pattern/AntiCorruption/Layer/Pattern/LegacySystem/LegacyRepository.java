package Design.Pattern.AntiCorruption.Layer.Pattern.LegacySystem;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class LegacyRepository {

    private final LegacyMapper legacyMapper;

    public LegacyRepository(LegacyMapper legacyMapper) {
        this.legacyMapper = legacyMapper;
    }

    public List<LegacyDto> getDataFromLegacyTable() {
        return legacyMapper.getDataFromLegacyTable();
    }

}
