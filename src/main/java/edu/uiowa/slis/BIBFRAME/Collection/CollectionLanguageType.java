package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionLanguageIterator theCollectionLanguageIterator = (CollectionLanguageIterator)findAncestorWithClass(this, CollectionLanguageIterator.class);
			pageContext.getOut().print(theCollectionLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for language tag ");
		}
		return SKIP_BODY;
	}
}

