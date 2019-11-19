/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import BO.MedecinBO;
import DAO.ImedecinDAO;
import Service.MedecinService;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;


/**
 *
 * @author lorris   
 */

//@RunWith(MockitoJUnitRunner.class

public class MyTest {
    
    public MyTest() {
    }
    @Mock
    ImedecinDAO dao;
 
@InjectMocks MedecinService service ;
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    
    
    
    
    @Test
    public void testMockito() throws SQLException 
    {
        MockitoAnnotations.initMocks(this);
        
        
        
        MedecinBO bo = new MedecinBO();
        bo.setPrenom("test");
        
        when(dao.getElementById(1)).thenReturn(bo);
        
        MedecinBO boTest = service.getElementById(1);
        verify(dao, times(1)).getElementById(1);

        Assertions.assertEquals(bo.getPrenom(),boTest.getPrenom());
                
        
        
    }
}
