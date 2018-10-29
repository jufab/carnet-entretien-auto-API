package fr.jufab.carnetentretien.domain.dto.mapper;


import fr.jufab.carnetentretien.domain.dto.*;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;

@Mapper(
        withIoC = IoC.CDI_SINGLETON
)
public interface CarnetEntretienSelmaMapper {

    CarnetEntretien asCarnetEntretienDTO(fr.jufab.carnetentretien.domain.entity.CarnetEntretien in);
    fr.jufab.carnetentretien.domain.entity.CarnetEntretien asCarnetEntretien(CarnetEntretien in);

    Entretien asEntretienDTO(fr.jufab.carnetentretien.domain.entity.Entretien in);
    fr.jufab.carnetentretien.domain.entity.Entretien asEntretien(Entretien in);

    TypeCarburant asTypeCarburantDTO(fr.jufab.carnetentretien.domain.entity.TypeCarburant in);
    fr.jufab.carnetentretien.domain.entity.TypeCarburant asTypeCarburant(TypeCarburant in);

    @Maps(withIgnoreFields={"desEntretiens"})
    Voiture asVoitureDTO(fr.jufab.carnetentretien.domain.entity.Voiture in);
    @Maps(withIgnoreFields={"desEntretiens"})
    fr.jufab.carnetentretien.domain.entity.Voiture asVoiture(Voiture in);

    @Maps(withIgnoreFields={"desVoitures"})
    MarqueVoiture asMarqueVoitureDTO(fr.jufab.carnetentretien.domain.entity.MarqueVoiture mv);
    @Maps(withIgnoreFields={"desVoitures"})
    fr.jufab.carnetentretien.domain.entity.MarqueVoiture asMarqueVoiture(MarqueVoiture mv);

}
