package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionTranslatedAsIterator theCollectionTranslatedAsIterator = (CollectionTranslatedAsIterator)findAncestorWithClass(this, CollectionTranslatedAsIterator.class);
			pageContext.getOut().print(theCollectionTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

