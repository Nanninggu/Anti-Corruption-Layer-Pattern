package Design.Pattern.AntiCorruption.Layer.Pattern.LegacySystem;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LegacyMapper {

    List<LegacyDto> getDataFromLegacyTable();

}
