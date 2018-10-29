-- Type de carburant
insert into TypeCarburant (id,carburant) values (1,'Essence');
insert into TypeCarburant (id,carburant) values (2,'Diesel');

-- Marque de uneVoiture
insert into MarqueVoiture (id,nom) values (1,'PEUGEOT');
insert into MarqueVoiture (id,nom) values (2,'RENAULT');
insert into MarqueVoiture (id,nom) values (3,'OPEL');
insert into MarqueVoiture (id,nom) values (4,'AUDI');

-- Les Entretiens
insert into Entretien (id,commentaire,libelle,nombreAnnee,nombreKmMini,nombreKmMax) values (1,'','Vidange + Filtre à huile',1,0,0);
insert into Entretien (id,commentaire,libelle,nombreAnnee,nombreKmMini,nombreKmMax) values (2,'','Filtre à air',1,0,0);
insert into Entretien (id,commentaire,libelle,nombreAnnee,nombreKmMini,nombreKmMax) values (3,'','Filtre habitacle',1,0,0);
insert into Entretien (id,commentaire,libelle,nombreAnnee,nombreKmMini,nombreKmMax) values (4,'','Bougies',3,60000,60000);
insert into Entretien (id,commentaire,libelle,nombreAnnee,nombreKmMini,nombreKmMax) values (5,'','Bougies de préchauffage',0,120000,120000);
insert into Entretien (id,commentaire,libelle,nombreAnnee,nombreKmMini,nombreKmMax) values (6,'Voir le livret','Courroie de distribution',0,60000,160000);
insert into Entretien (id,commentaire,libelle,nombreAnnee,nombreKmMini,nombreKmMax) values (7,'Au visuel','Plaquette de frein',0,30000,45000);
insert into Entretien (id,commentaire,libelle,nombreAnnee,nombreKmMini,nombreKmMax) values (8,'au besoin','Réservoir AdBlue',1,0,0);
insert into Entretien (id,commentaire,libelle,nombreAnnee,nombreKmMini,nombreKmMax) values (9,'à vérifier à chaque vidange','Filtre à gazole',0,20000,20000);
insert into Entretien (id,commentaire,libelle,nombreAnnee,nombreKmMini,nombreKmMax) values (10,'à vérifier à chaque vidange','Filtre à essence',0,40000,40000);
insert into Entretien (id,commentaire,libelle,nombreAnnee,nombreKmMini,nombreKmMax) values (11,'','Climatisation(recharge)',2,0,0);
insert into Entretien (id,commentaire,libelle,nombreAnnee,nombreKmMini,nombreKmMax) values (12,'','Climatisation(Nettoyage)',1,0,0);

--Entretien par Type de carburant

insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (1,1);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (2,1);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (1,2);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (2,2);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (1,3);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (2,3);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (1,4);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (2,5);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (2,6);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (1,7);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (2,7);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (2,8);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (2,9);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (1,10);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (1,11);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (2,11);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (1,12);
insert into ENTRETIEN_TYPECARBURANT (TYPEDECARBURANT_ID,ENTRETIEN_ID) values (2,12);