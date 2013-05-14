/*

   Derby - Class org.apache.derby.jdbc.BasicClientXADataSource40

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/

package org.apache.derby.jdbc;

import java.sql.SQLException;
import javax.sql.XAConnection;
import javax.sql.XADataSource;

/**
 * This datasource is suitable for client/server use of Derby,
 * running on Java 8 Compact Profile 2 or higher.
 * <p/>
 * Similar to ClientXADataSource except it does not support JNDI,
 * i.e. it does not implement {@code javax.naming.Referenceable}.
 */
public class BasicClientXADataSource40
    extends BasicClientDataSource40
    implements ClientXADataSourceInterface,
               XADataSource /* compile-time check of 41 extensions */ {

    public static final String className__ =
        "org.apache.derby.jdbc.BasicClientXADataSource40";

    // following serialVersionUID was generated by the JDK's serialver program
    // verify it everytime that ClientXADataSource is modified
    private static final long serialVersionUID = 7057075094707674881L;

    public BasicClientXADataSource40() {
    }

    public XAConnection getXAConnection() throws SQLException {
        return getXAConnectionMinion();
    }

    public XAConnection getXAConnection(String user, String password)
        throws SQLException {

        return getXAConnectionMinion(user, password);
    }
}
