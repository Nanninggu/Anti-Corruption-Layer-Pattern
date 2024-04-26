package Design.Pattern.AntiCorruption.Layer.Pattern.Config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("Design.Pattern.AntiCorruption.Layer.Pattern.mapper, " +
        "Design.Pattern.AntiCorruption.Layer.Pattern.LegacySystem, " +
        "Design.Pattern.AntiCorruption.Layer.Pattern.ModernSystem")
public class MyBatisConfig {

}
