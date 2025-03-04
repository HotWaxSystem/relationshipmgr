import org.moqui.context.ExecutionContext
import org.moqui.entity.EntityCondition
import org.moqui.entity.EntityFind
import org.moqui.entity.EntityList
import org.moqui.entity.EntityValue

import java.sql.Timestamp

def currentDate = new Timestamp(System.currentTimeMillis())

  if(birthDate.compareTo(currentDate) < 0 ){
    def personEntity = ec.entity.makeValue('Person')
    personEntity.set('partyId', partyId)
    personEntity.set('firstName', firstName)
    personEntity.set('lastName', lastName)
    personEntity.set('birthDate', birthDate)
    personEntity.create()
  }
    
    else
    {
        ec.message.addError("please Enter the valid Date of Birth")
    }