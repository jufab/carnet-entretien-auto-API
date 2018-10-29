package fr.jufab.carnetentretien.domain.dto.mapper;

import fr.jufab.carnetentretien.domain.dto.*;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;

@Mapper(
        withIoC = IoC.CDI_SINGLETON
)
public interface VoitureSelmaMapper {

    Voiture asVoitureDTO(fr.jufab.carnetentretien.domain.entity.Voiture in);
    fr.jufab.carnetentretien.domain.entity.Voiture asVoiture(Voiture in);

    ControleTechnique asControleTechniqueDTO(fr.jufab.carnetentretien.domain.entity.ControleTechnique ct);
    fr.jufab.carnetentretien.domain.entity.ControleTechnique asControleTechnique(ControleTechnique ct);

    @Maps(withIgnoreFields={"desVoitures"})
    MarqueVoiture asMarqueVoitureDTO(fr.jufab.carnetentretien.domain.entity.MarqueVoiture mv);
    @Maps(withIgnoreFields={"desVoitures"})
    fr.jufab.carnetentretien.domain.entity.MarqueVoiture asMarqueVoiture(MarqueVoiture mv);

    TypeCarburant asTypeCarburantDTO(fr.jufab.carnetentretien.domain.entity.TypeCarburant tc);
    fr.jufab.carnetentretien.domain.entity.TypeCarburant asTypeCarburant(TypeCarburant tc);

    @Maps(withIgnoreFields={"uneVoiture"})
    CarnetEntretien asCarnetEntretienDTO(fr.jufab.carnetentretien.domain.entity.CarnetEntretien ce);
    @Maps(withIgnoreFields={"uneVoiture"})
    fr.jufab.carnetentretien.domain.entity.CarnetEntretien asCarnetEntretien(CarnetEntretien ce);

}


