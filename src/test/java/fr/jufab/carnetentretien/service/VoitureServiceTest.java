package fr.jufab.carnetentretien.service;

import fr.jufab.carnetentretien.domain.dto.Voiture;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.arquillian.DefaultDeployment;

import javax.inject.Inject;
import java.text.SimpleDateFormat;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotNull;

@RunWith(Arquillian.class)
@DefaultDeployment(type = DefaultDeployment.Type.WAR)
public class VoitureServiceTest {

    /*@ArquillianResource
    InitialContext context;*/

//    @Deployment//(name = "MAVOITUREREPO", managed = false)
//    public static Archive<?> createDeployment() throws Exception {
//        return ShrinkWrap.create(WebArchive.class, "maVoitureServiceTest.war")
//                .addAsWebInfResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"))
//                .addPackage(VoitureServiceTest.class.getPackage())
//                .addAsResource("test-persistence.xml", "META-INF/persistence.xml");
//                //.addClass(VoitureService.class)
//                //.addClass(Voiture.class)
//                //.addClass(VoitureServiceImpl.class);
//        //WARArchive deployment = ShrinkWrap.create( WARArchive.class );
////        deployment.addDefaultPackage();
////        deployment.addAsWebInfResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"));
////        return deployment;
//    }

    @Inject
    VoitureService voitureService;


//    @Test
//    public void testDataSourceIsBound() throws Exception {
//        DataSource ds = (DataSource) context.lookup("java:jboss/datasources/uneDatasource");
//        assertNotNull( ds );
//    }

    @Test
    public void testCreateRepositoryMaVoiture() throws Exception {
        Voiture voiture = new Voiture();
        voiture.setModele("508 SW");
        voiture.setAnnee(2017);
        voiture.setDateAchat(new SimpleDateFormat("dd/MM/YYYY").parse("21/06/2018"));
        voiture = voitureService.persist(voiture);
        assertNotNull(voiture);
        assertTrue(voiture.getId()>0);
    }



}
