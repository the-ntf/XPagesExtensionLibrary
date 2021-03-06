/*
 * � Copyright IBM Corp. 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */

package com.ibm.xsp.extlib.renderkit.dojoext.form;

import javax.faces.context.FacesContext;

import com.ibm.xsp.dojo.FacesDojoComponent;
import com.ibm.xsp.extlib.resources.ExtLibResources;
import com.ibm.xsp.resource.DojoModuleResource;


public class DojoExtNameTextBoxRenderer extends DojoExtListTextBoxRenderer {

    @Override
    protected String getDefaultDojoType(FacesContext context, FacesDojoComponent component) {
        return "extlib.dijit.NameTextBox"; // $NON-NLS-1$
    }
    
    @Override
    protected DojoModuleResource getDefaultDojoModule(FacesContext context, FacesDojoComponent component) {
        return ExtLibResources.extlibNameTextBox;
    }
}