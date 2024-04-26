package Design.Pattern.AntiCorruption.Layer.Pattern.ModernSystem;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ModernRepository {

    private final ModernMapper modernMapper;

    public ModernRepository(ModernMapper modernMapper) {
        this.modernMapper = modernMapper;
    }

    public int putDataFromModernTable(String id, String username, String email) {
        return modernMapper.putDataFromModernTable(id, username, email);
    }

}
