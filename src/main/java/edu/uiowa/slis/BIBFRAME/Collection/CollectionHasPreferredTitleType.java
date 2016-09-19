package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasPreferredTitleIterator theCollectionHasPreferredTitleIterator = (CollectionHasPreferredTitleIterator)findAncestorWithClass(this, CollectionHasPreferredTitleIterator.class);
			pageContext.getOut().print(theCollectionHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

