package Design.Pattern.AntiCorruption.Layer.Pattern.ModernSystem;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ModernMapper {

    int putDataFromModernTable(String id, String username, String email);

}
