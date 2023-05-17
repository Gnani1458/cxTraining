/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.cxtraining.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.cxtraining.fulfilmentprocess.constants.CxtrainingFulfilmentProcessConstants;

public class CxtrainingFulfilmentProcessManager extends GeneratedCxtrainingFulfilmentProcessManager
{
	public static final CxtrainingFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CxtrainingFulfilmentProcessManager) em.getExtension(CxtrainingFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
