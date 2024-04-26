package Design.Pattern.AntiCorruption.Layer.Pattern.controller;

import Design.Pattern.AntiCorruption.Layer.Pattern.AntiCorruptionLayer.AntiCorruptionLayer;
import Design.Pattern.AntiCorruption.Layer.Pattern.ModernSystem.ModernDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    AntiCorruptionLayer AntiCorruptionLayer;

    @GetMapping("/LegacyToModernTransfer")
    public List<ModernDto> getExternalData() {
        return AntiCorruptionLayer.getDataFromLegacy();
    }

}
