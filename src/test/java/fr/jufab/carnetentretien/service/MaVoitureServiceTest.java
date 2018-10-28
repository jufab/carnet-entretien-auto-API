package fr.jufab.carnetentretien.service;

import fr.jufab.carnetentretien.domain.dto.MaVoiture;
import fr.jufab.carnetentretien.service.MaVoitureService;
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
public class MaVoitureServiceTest {

    /*@ArquillianResource
    InitialContext context;*/

//    @Deployment//(name = "MAVOITUREREPO", managed = false)
//    public static Archive<?> createDeployment() throws Exception {
//        return ShrinkWrap.create(WebArchive.class, "maVoitureServiceTest.war")
//                .addAsWebInfResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"))
//                .addPackage(MaVoitureServiceTest.class.getPackage())
//                .addAsResource("test-persistence.xml", "META-INF/persistence.xml");
//                //.addClass(MaVoitureService.class)
//                //.addClass(MaVoiture.class)
//                //.addClass(MaVoitureServiceImpl.class);
//        //WARArchive deployment = ShrinkWrap.create( WARArchive.class );
////        deployment.addDefaultPackage();
////        deployment.addAsWebInfResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"));
////        return deployment;
//    }

    @Inject
    MaVoitureService maVoitureService;


//    @Test
//    public void testDataSourceIsBound() throws Exception {
//        DataSource ds = (DataSource) context.lookup("java:jboss/datasources/uneDatasource");
//        assertNotNull( ds );
//    }

    @Test
    public void testCreateRepositoryMaVoiture() throws Exception {
        MaVoiture maVoiture = new MaVoiture();
        maVoiture.setModele("508 SW");
        maVoiture.setAnnee(2017);
        maVoiture.setDateAchat(new SimpleDateFormat("dd/MM/YYYY").parse("21/06/2018"));
        maVoiture = maVoitureService.persist(maVoiture);
        assertNotNull(maVoiture);
        assertTrue(maVoiture.getId()>0);
    }



}
