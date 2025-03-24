/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 9, 2024, 7:22:40 PM                     ---
 * ----------------------------------------------------------------
 */
package com.sap.smartedittrail.jalo;

import com.sap.smartedittrail.constants.SmartedittrailConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.smartedittrail.jalo.pages.CustomContentPage;
import de.hybris.platform.smartedittrail.jalo.pages.CustomPage;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SmartedittrailManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSmartedittrailManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public CustomContentPage createCustomContentPage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SmartedittrailConstants.TC.CUSTOMCONTENTPAGE );
			return (CustomContentPage)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomContentPage : "+e.getMessage(), 0 );
		}
	}
	
	public CustomContentPage createCustomContentPage(final Map attributeValues)
	{
		return createCustomContentPage( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomPage createCustomPage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SmartedittrailConstants.TC.CUSTOMPAGE );
			return (CustomPage)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomPage : "+e.getMessage(), 0 );
		}
	}
	
	public CustomPage createCustomPage(final Map attributeValues)
	{
		return createCustomPage( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SmartedittrailConstants.EXTENSIONNAME;
	}
	
}
