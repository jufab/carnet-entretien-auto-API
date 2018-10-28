package fr.jufab.carnetentretien.domain.dto.mapper;

import fr.jufab.carnetentretien.domain.dto.*;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

@Mapper(
        withIoC = IoC.CDI_SINGLETON
)
public interface MaVoitureSelmaMapper{

    MaVoiture asMaVoitureDTO(fr.jufab.carnetentretien.domain.entity.MaVoiture in);
    fr.jufab.carnetentretien.domain.entity.MaVoiture asMaVoiture(MaVoiture in);

    ControleTechnique asControleTechniqueDTO(fr.jufab.carnetentretien.domain.entity.ControleTechnique ct);
    fr.jufab.carnetentretien.domain.entity.ControleTechnique asControleTechnique(ControleTechnique ct);

    MarqueVoiture asMarqueVoitureDTO(fr.jufab.carnetentretien.domain.entity.MarqueVoiture mv);
    fr.jufab.carnetentretien.domain.entity.MarqueVoiture asMarqueVoiture(MarqueVoiture mv);

    TypeCarburant asTypeCarburantDTO(fr.jufab.carnetentretien.domain.entity.TypeCarburant tc);
    fr.jufab.carnetentretien.domain.entity.TypeCarburant asTypeCarburant(TypeCarburant tc);

    CarnetEntretien asCarnetEntretienDTO(fr.jufab.carnetentretien.domain.entity.CarnetEntretien ce);
    fr.jufab.carnetentretien.domain.entity.CarnetEntretien asCarnetEntretien(CarnetEntretien ce);

}


