/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.cxtraining.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.cxtraining.core.constants.CxtrainingCoreConstants;
import de.hybris.cxtraining.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class CxtrainingCoreManager extends GeneratedCxtrainingCoreManager
{
	public static final CxtrainingCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CxtrainingCoreManager) em.getExtension(CxtrainingCoreConstants.EXTENSIONNAME);
	}
}
