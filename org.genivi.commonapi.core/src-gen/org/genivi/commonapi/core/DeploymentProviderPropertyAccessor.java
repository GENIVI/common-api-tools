/*******************************************************************************
* This file has been generated by Franca's FDeployGenerator.
* Source: deployment spec 'org.genivi.commonapi.core.deployment'
*******************************************************************************/
package org.genivi.commonapi.core;

import java.util.List;
import java.util.ArrayList;

import org.franca.core.franca.FInterface;
import org.franca.deploymodel.dsl.fDeploy.FDProvider;
import org.franca.deploymodel.dsl.fDeploy.FDInterfaceInstance;
import org.franca.deploymodel.core.FDeployedProvider;

/**
 * Accessor for deployment properties for 'org.genivi.commonapi.core.deployment' specification
 */		
public class DeploymentProviderPropertyAccessor
{
	
	private FDeployedProvider target;

	public DeploymentProviderPropertyAccessor (FDeployedProvider target) {
		this.target = target;
	}
	
	public List<FInterface> getClientInstanceReferences (FDProvider obj) {
		return target.getInterfaceArray(obj, "ClientInstanceReferences");
	}
	
	public List<String> getProjectVariants (FDProvider obj) {
		return target.getStringArray(obj, "ProjectVariants");
	}
	
	public String getDomain (FDInterfaceInstance obj) {
		return target.getString(obj, "Domain");
	}
	
	public String getInstanceId (FDInterfaceInstance obj) {
		return target.getString(obj, "InstanceId");
	}
	
	public Integer getDefaultTimeout (FDInterfaceInstance obj) {
		return target.getInteger(obj, "DefaultTimeout");
	}
	
	public List<String> getPreregisteredProperties (FDInterfaceInstance obj) {
		return target.getStringArray(obj, "PreregisteredProperties");
	}
	
	public String getCodeArtifactName (FDInterfaceInstance obj) {
		return target.getString(obj, "CodeArtifactName");
	}
	
	
}