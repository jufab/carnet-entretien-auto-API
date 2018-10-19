package fr.jufab.carnetentretien;

import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.arquillian.DefaultDeployment;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import static org.junit.Assert.assertNotNull;

@RunWith(Arquillian.class)
@DefaultDeployment
public class MaVoitureServiceTest {

    @ArquillianResource
    InitialContext context;

//    @Deployment(name = "MAVOITUREREPO", managed = false)
//    public static Archive createDeployment() {
//        WARArchive deployment = ShrinkWrap.create( WARArchive.class );
//        deployment.addDefaultPackage();
//        deployment.addPackage("fr.jufab.carnetentretien");
//        return deployment;
//    }

//    @Inject
//    MaVoitureService maVoitureService;


    @Test
    public void testDataSourceIsBound() throws Exception {
        DataSource ds = (DataSource) context.lookup("java:jboss/datasources/uneDatasource");
        assertNotNull( ds );
    }

    /*@Test
    public void testCreateRepositoryMaVoiture() throws Exception {
        MaVoiture maVoiture = new MaVoiture();
        maVoiture.setModele("508 SW");
        maVoiture.setAnnee(2017);
        maVoiture.setDateAchat(new SimpleDateFormat("dd/MM/YYYY").parse("21/06/2018"));
        maVoiture = maVoitureService.persist(maVoiture);
        assertNotNull(maVoiture);
        assertTrue(maVoiture.getId()>0);
    }*/

}
