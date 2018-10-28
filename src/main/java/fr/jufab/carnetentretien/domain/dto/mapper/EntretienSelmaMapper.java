package fr.jufab.carnetentretien.domain.dto.mapper;


import fr.jufab.carnetentretien.domain.dto.Entretien;
import fr.jufab.carnetentretien.domain.dto.TypeCarburant;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

@Mapper(
        withIoC = IoC.CDI_SINGLETON
)
public interface EntretienSelmaMapper {

    Entretien asEntretienDTO(fr.jufab.carnetentretien.domain.entity.Entretien in);
    fr.jufab.carnetentretien.domain.entity.Entretien asEntretien(Entretien in);

    TypeCarburant asTypeCarburantDTO(fr.jufab.carnetentretien.domain.entity.TypeCarburant in);
    fr.jufab.carnetentretien.domain.entity.TypeCarburant asTypeCarburant(TypeCarburant in);

}
