/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2013-2015 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * http://glassfish.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.packtpub.rest.ch6.oauth2.client;

import org.glassfish.jersey.client.oauth2.ClientIdentifier;
import org.glassfish.jersey.client.oauth2.OAuth2CodeGrantFlow;

/**
 * Store of credentials and Authorization flow. 
 * This needs to be replaced with a better mechanism  for real life use
 */
public class OAuthServiceContext {
    private  String accessToken = null;
    /**
     * Contains null or actually authorization flow.
     */
    private  OAuth2CodeGrantFlow flow;
    private  ClientIdentifier clientIdentifier;
    static OAuthServiceContext context= new OAuthServiceContext();
    private OAuthServiceContext(){
        
    }
    /**
     * Needs to be modified to return context for a user
     * @param userId
     * @return 
     */
    public static OAuthServiceContext getInstnace(String userId){
        System.out.println("OAuthServiceContext obj:"+context);
        return context;
    }
    public  String getAccessToken() {
        return accessToken;
    }

    public  void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public  OAuth2CodeGrantFlow getFlow() {
        return flow;
    }

    public  void setFlow(OAuth2CodeGrantFlow flow) {
        this.flow = flow;
    }

    public  ClientIdentifier getClientIdentifier() {
        return clientIdentifier;
    }

    public  void setClientIdentifier(ClientIdentifier clientIdentifier) {
        this.clientIdentifier = clientIdentifier;
    }
}
